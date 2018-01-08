var personalPortalServices = angular.module('personalPortalServices', [
    'ngResource'
]);

personalPortalServices.service('PatientService', ['$resource', '$rootScope', '$http',
    function ($resource, $rootScope, $http) {
        this.login = function (user) {
            var loginRequest = $resource($rootScope.baseBackendUrl + 'login', {}, {
                doRequest: {method: "POST", params: {user: "@user"}}
            });

            return loginRequest.doRequest(user);
        }

        this.signup = function (user) {
            var signupRequest = $resource($rootScope.baseBackendUrl + 'signup', {}, {
                doRequest: {method: "POST", params: {user: "@user"}}
            });

            return signupRequest.doRequest(user);
        }

        this.changePassword = function(userId, password, newPassword) {
            var changePasswordRequest = $resource($rootScope.baseBackendUrl + 'changePassword', {}, {
                doRequest: {method: "POST", params: {id: "@id", password: "@password", newPassword: "@newPassword"}}
            });

            return changePasswordRequest.doRequest({id: userId, password: password, newPassword: newPassword});
        }

        this.forgotPassword = function(email) {
            var forgotPasswordRequest = $resource($rootScope.baseBackendUrl + 'forgotPassword', {}, {
                doRequest: {method: "POST", params: {email: "@email"}}
            });

            return forgotPasswordRequest.doRequest({email: email});
        }

        this.sendCustomerSupportRequest = function($scope, userId, subject, message) {
            var sendCustomerSupportRequest = $resource($rootScope.baseBackendUrl + '/customerSupportRequest', {}, {
                doRequest: {method: "POST", params: {id: "@id", subject: "@subject", message: "@message"}}
            });

            sendCustomerSupportRequest.doRequest({id: userId, subject: subject, message: message}, function () {
                $scope.success = true;
            });
        }

        this.loadPatientData = function (patientId) {
            var getRequest = $resource($rootScope.baseBackendUrl + '/getPatient', {}, {
                doRequest: {method: "POST",
                            params: {id: "@id"},
                            transformResponse: appendTransform($http.defaults.transformResponse, function(response) {
                                return convertDateStringsToDates(response);
                            })}
            });

            return getRequest.doRequest({id: patientId});
        }

        this.savePatientData = function ($scope, patientData, type) {
            var serviceMethod = type == 'general' ? 'savePatientGeneral' : 'savePatientMedicalData';

            var saveRequest = $resource($rootScope.baseBackendUrl + serviceMethod, {}, {
                doRequest: {method: "POST",
                            params: {patient: "@patient"},
                            transformRequest: prependTransform($http.defaults.transformRequest, function(request) {
                                return convertDatesToStrings(angular.copy(request));
                            })}
            });

            if (patientData.$valid) {
                saveRequest.doRequest($scope.patient, function () {
                    $scope.dataSaved = true;
                    patientData.$submitted = false;
                    patientData.$dirty = false;
                    $rootScope.currentUser.name = $scope.patient.name + ' ' + $scope.patient.surname;
                });
            } else {
                $scope.dataSaved = false;
            }
        }

        this.loadHealthStatement = function (patientId) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientHealthStatement', {}, {
                doRequest: {method: "POST", params: {patientId: "@patientId"}}
            });

            return getRequest.doRequest({patientId: patientId});
        }

        this.saveHealthStatement = function ($scope, patientHealthStatement) {
            var saveRequest = $resource($rootScope.baseBackendUrl + 'savePatientHealthStatement', {}, {
                doRequest: {method: "POST", params: {healthStatement: "@healthStatement"}}
            });

            saveRequest.doRequest($scope.healthStatement, function (result) {
                $scope.dataSaved = true;
                patientHealthStatement.$dirty = false;
                $scope.healthStatement.id = result.id;
            });
        }

        this.loadNotes = function (patientId) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientNotes', {}, {
                doRequest: {method: "POST", params: {patientId: "@patientId"}}
            });

            return getRequest.doRequest({patientId: patientId});
        }

        this.saveNotes = function ($scope, patientNotes) {
            var saveRequest = $resource($rootScope.baseBackendUrl + '/savePatientNotes', {}, {
                doRequest: {method: "POST", params: {notes: "@notes"}}
            });

            saveRequest.doRequest($scope.notes, function (result) {
                $scope.dataSaved = true;
                patientNotes.$dirty = false;
                $scope.notes.id = result.id;
            });
        }

        this.loadSelfHealthCheck = function (id) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientSelfHealthCheck', {}, {
                doRequest: {method: "POST", params: {id: "@id"}}
            });

            return getRequest.doRequest({id: id});
        }

        this.loadSelfHealthChecks = function (patientId, startDate, endDate) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientSelfHealthChecks', {}, {
                doRequest: {method: "POST", params: {patientId: "@patientId", startDate: "@startDate", endDate: "@endDate"}, isArray: true}
            });

            return getRequest.doRequest({patientId: patientId, startDate: startDate, endDate: endDate});
        }

        this.saveSelfHealthCheck = function ($scope, selfHealthCheckForm) {
            var saveRequest = $resource($rootScope.baseBackendUrl + 'savePatientSelfHealthCheck', {}, {
                doRequest: {method: "POST", params: {selfHealthCheck: "@selfHealthCheck"}}
            });

            saveRequest.doRequest($scope.selfHealthCheck, function (result) {
                $scope.dataSaved = true;
                selfHealthCheckForm.$dirty = false;
                $scope.selfHealthCheck.id = result.id;
            });
        }

        this.getPatientBPMeasurements = function (patientId, startDate, endDate, squashDayMeasurements) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientBPMeasurements', {}, {
                doRequest: {
                    method: "POST",
                    params: {
                        patientId: "@patientId",
                        startDate: "@startDate",
                        endDate: "@endDate",
                        squashDayMeasurements: "@squashDayMeasurements"
                    },
                    transformResponse: appendTransform($http.defaults.transformResponse, function(response) {
                        return convertDateStringsToDates(response);
                    })
                }
            });

            return getRequest.doRequest({patientId: patientId, startDate: startDate, endDate: endDate, squashDayMeasurements: squashDayMeasurements});
        }

        this.getPatientWeightMeasurements = function (patientId, startDate, endDate, squashDayMeasurements) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientWeightMeasurements', {}, {
                doRequest: {
                    method: "POST",
                    params: {
                        patientId: "@patientId",
                        startDate: "@startDate",
                        endDate: "@endDate",
                        squashDayMeasurements: "@squashDayMeasurements"
                    },
                    transformResponse: appendTransform($http.defaults.transformResponse, function(response) {
                        return convertDateStringsToDates(response);
                    })
                }
            });

            return getRequest.doRequest({patientId: patientId, startDate: startDate, endDate: endDate, squashDayMeasurements: squashDayMeasurements});
        }

        this.getPatientBOMeasurements = function (patientId, startDate, endDate, squashDayMeasurements) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientBOMeasurements', {}, {
                doRequest: {
                    method: "POST",
                    params: {
                        patientId: "@patientId",
                        startDate: "@startDate",
                        endDate: "@endDate",
                        squashDayMeasurements: "@squashDayMeasurements"
                    },
                    transformResponse: appendTransform($http.defaults.transformResponse, function(response) {
                        return convertDateStringsToDates(response);
                    })
                }
            });

            return getRequest.doRequest({patientId: patientId, startDate: startDate, endDate: endDate, squashDayMeasurements: squashDayMeasurements});
        }

        this.getPatientHRMeasurements = function (patientId, startDate, endDate, squashDayMeasurements) {
            var getRequest = $resource($rootScope.baseBackendUrl + 'getPatientHRMeasurements', {}, {
                doRequest: {
                    method: "POST",
                    params: {
                        patientId: "@patientId",
                        startDate: "@startDate",
                        endDate: "@endDate",
                        squashDayMeasurements: "@squashDayMeasurements"
                    },
                    transformResponse: appendTransform($http.defaults.transformResponse, function(response) {
                        return convertDateStringsToDates(response);
                    })
                }
            });

            return getRequest.doRequest({patientId: patientId, startDate: startDate, endDate: endDate, squashDayMeasurements: squashDayMeasurements});
        }
    }]);

personalPortalServices.service('EbmedsService', ['$resource', '$rootScope',
    function ($resource, $rootScope) {
        var ebmedsRequest = $resource($rootScope.baseBackendUrl + 'ebmedsRequest', {}, {
            doRequest: {method: "POST", params: {id: "@id"}, isArray: true}
        });

        this.getReminders = function (patientId) {
            return ebmedsRequest.doRequest({id: patientId});
        }
    }
]);

personalPortalServices.service('IHealthService', ['$resource', '$rootScope',
    function ($resource, $rootScope) {
        this.getAuthorizationUrl = function (patientId) {
            var getAuthUrlRequest = $resource($rootScope.baseBackendUrl + 'ihealth/authorizationUrl', {}, {
                doRequest: {method: "POST", params: {patientId: "@patientId"}}
            });

            return getAuthUrlRequest.doRequest({patientId: patientId});
        }
    }
]);

personalPortalServices.service('PatientActionsService', ['$resource', '$rootScope',
    function ($resource, $rootScope) {
        var getAllActionsRequest = $resource($rootScope.baseBackendUrl + 'allActions', {}, {
            doRequest: {method: "POST", isArray: true}
        });

        this.getAllActions = function () {
            return getAllActionsRequest.doRequest();
        }
    }
]);

function appendTransform(defaults, transform) {

    // We can't guarantee that the default transformation is an array
    defaults = angular.isArray(defaults) ? defaults : [defaults];

    // Append the new transformation to the defaults
    return defaults.concat(transform);
}

function prependTransform(defaults, transform) {

    return [transform].concat(defaults);
}

function convertDateStringsToDates(input) {
    if (typeof input !== "object") return input;

    for (var key in input) {
        if (!input.hasOwnProperty(key)) continue;

        if(key.match('Date') || key.match('date')) {
            input[key] = new Date(input[key]);
        } else if (Array.isArray(input[key])) {
            for(var i = 0; i < input[key].length; i++) {
                convertDateStringsToDates(input[key][i]);
            }
        }
    }

    return input;
}

function convertDatesToStrings(input) {
    if (typeof input !== "object") return input;

    for (var key in input) {
        if (!input.hasOwnProperty(key)) continue;

        if(angular.isDate(input[key])) {
            input[key] = input[key].getTime();
        } else if (Array.isArray(input[key])) {
            for(var i = 0; i < input[key].length; i++) {
                convertDatesToStrings(input[key][i]);
            }
        }
    }

    return input;
}