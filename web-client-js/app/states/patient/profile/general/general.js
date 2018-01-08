angular.module('personalPortal.patient.profile.general', [
        'ui.router',
        'ui.bootstrap',
        'ui.bootstrap.datetimepicker',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.general', {
            url: '/general',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/general/general.html',
                    controller: 'GeneralDataCtrl'
                }
            },
            resolve:{
                patient : function(PatientService, $rootScope) {
                    return PatientService.loadPatientData($rootScope.currentUser.id);
                }
            }
        });
    })
    .controller('GeneralDataCtrl', ['$scope', 'patient', 'PatientService',
        function ($scope, patient, PatientService) {
            $scope.patient = patient;

            $scope.save = function (patientData) {
                PatientService.savePatientData($scope, patientData, 'general');
            }

            $scope.datepickerState = {
                birthDateOpened: false
            };

            $scope.openBirthDate = function ($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.birthDateOpened = true;
            };

        }]);