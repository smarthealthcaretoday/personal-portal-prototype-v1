angular.module('personalPortal.patient.profile.medicalData', [
        'ui.router',
        'ui.bootstrap',
        'angucomplete-alt',
        'smart-table',
        'ui.bootstrap.datetimepicker',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.medicalData', {
            url: '/medical-data',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/medical_data/medical_data.html',
                    controller: 'MedicalDataCtrl'
                }
            },
            resolve:{
                patient : function(PatientService, $rootScope, $q, $filter) {
                    var deferred = $q.defer();

                    PatientService.loadPatientData($rootScope.currentUser.id).$promise.then(function (patient) {
                        patient.measurements = $filter('orderBy')(patient.measurements, 'date', false);
                        deferred.resolve(patient);
                    });

                    return deferred.promise;
                }
            }
        });
    })
    .controller('MedicalDataCtrl', ['$scope', 'patient', 'PatientService', '$rootScope',
        function ($scope, patient, PatientService, $rootScope) {
            $scope.patient = patient;

            $scope.baseBackendUrl = $rootScope.baseBackendUrl;

            $scope.save = function (patientData) {
                PatientService.savePatientData($scope, patientData, 'medicalData');
            }

            $scope.addMeasurement = function () {
                var measurement = {};
                if (!$scope.patient.measurements || $scope.patient.measurements.length == 0) {
                    $scope.patient.measurements = [];
                }
                $scope.patient.measurements.push(measurement);
            }

            $scope.removeMeasurement = function (index) {
                $scope.patient.measurements.splice(index, 1);
            }

            $scope.addMedication = function () {
                var medication = {};
                if (!$scope.patient.medications || $scope.patient.medications.length == 0) {
                    $scope.patient.medications = [];
                }
                $scope.patient.medications.push(medication);
            }

            $scope.removeMedication = function (index) {
                $scope.patient.medications.splice(index, 1);
            }

            $scope.addVaccination = function () {
                var vaccination = {};
                if (!$scope.patient.vaccinations || $scope.patient.vaccinations.length == 0) {
                    $scope.patient.vaccinations = [];
                }
                $scope.patient.vaccinations.push(vaccination);
            }

            $scope.removeVaccination = function (index) {
                $scope.patient.vaccinations.splice(index, 1);
            }

            $scope.addDiagnosis = function () {
                var diagnosis = {};
                if (!$scope.patient.diagnoses || $scope.patient.diagnoses.length == 0) {
                    $scope.patient.diagnoses = [];
                }
                $scope.patient.diagnoses.push(diagnosis);
            }

            $scope.removeDiagnosis = function (index) {
                $scope.patient.diagnoses.splice(index, 1);
            }

            $scope.addDrugToAvoid = function () {
                var drugToAvoid = {};
                if (!$scope.patient.drugsToAvoid || $scope.patient.drugsToAvoid.length == 0) {
                    $scope.patient.drugsToAvoid = [];
                }
                $scope.patient.drugsToAvoid.push(drugToAvoid);
            }

            $scope.removeDrugToAvoid = function (index) {
                $scope.patient.drugsToAvoid.splice(index, 1);
            }

            $scope.datepickerState = {
                measurementOpened: [],
                medicationStartOpened: [],
                medicationEndOpened: [],
                vaccinationStartOpened: [],
                vaccinationEndOpened: [],
                diagnosisStartOpened: [],
                diagnosisEndOpened: []
            };
            $scope.openMeasurement = function ($event, $index) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.measurementOpened[$index] = true;
            };
            $scope.openMedicationStart = function ($event, $index) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.medicationStartOpened[$index] = true;
            };
            $scope.openMedicationEnd = function ($event, $index) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.medicationEndOpened[$index] = true;
            };
            $scope.openVaccinationStart = function ($event, $index) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.vaccinationStartOpened[$index] = true;
            };
            $scope.openVaccinationEnd = function ($event, $index) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.vaccinationEndOpened[$index] = true;
            };
            $scope.openDiagnosisStart = function ($event, $index) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.diagnosisStartOpened[$index] = true;
            };
            $scope.openDiagnosisEnd = function ($event, $index) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.diagnosisEndOpened[$index] = true;
            };

        }]);