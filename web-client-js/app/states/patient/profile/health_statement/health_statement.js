angular.module('personalPortal.patient.profile.healthStatement', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.healthStatement', {
            url: '/health-statement',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/health_statement/health_statement.html',
                    controller: 'HealthStatementCtrl'
                },
                'lifestyle@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/lifestyle.html',
                    controller: 'HealthStatementCtrl'
                },
                'medicalDevices@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/medical_devices.html',
                    controller: 'HealthStatementCtrl'
                },
                'cardiovascularCondition@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/cardiovascular_condition.html',
                    controller: 'HealthStatementCtrl'
                },
                'workingEnvironment@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/working_environment.html',
                    controller: 'HealthStatementCtrl'
                },
                'allergies@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/allergies.html',
                    controller: 'HealthStatementCtrl'
                },
                'mentalHealth@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/mental_health.html',
                    controller: 'HealthStatementCtrl'
                },
                'nervousSystem@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/nervous_system.html',
                    controller: 'HealthStatementCtrl'
                },
                'eyesAndVision@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/eyes_and_vision.html',
                    controller: 'HealthStatementCtrl'
                },
                'earNoseThroat@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/ear_nose_throat.html',
                    controller: 'HealthStatementCtrl'
                },
                'respiratorySystem@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/respiratory_system.html',
                    controller: 'HealthStatementCtrl'
                },
                'metabolicDisorders@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/metabolic_disorders.html',
                    controller: 'HealthStatementCtrl'
                },
                'bonesJointsMuscles@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/bones_joints_muscles.html',
                    controller: 'HealthStatementCtrl'
                },
                'infectiousDiseases@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/infectious_diseases.html',
                    controller: 'HealthStatementCtrl'
                },
                'otherChronicDiseases@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/other_chronic_diseases.html',
                    controller: 'HealthStatementCtrl'
                },
                'treatmentUpToNow@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/treatment_up_to_now.html',
                    controller: 'HealthStatementCtrl'
                },
                'traumas@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/traumas.html',
                    controller: 'HealthStatementCtrl'
                },
                'skinDisorders@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/skin_disorders.html',
                    controller: 'HealthStatementCtrl'
                },
                'digestiveOrgans@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/digestive_organs.html',
                    controller: 'HealthStatementCtrl'
                },
                'urogenitalSystem@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/urogenital_system.html',
                    controller: 'HealthStatementCtrl'
                },
                'bloodProblems@personalPortal.patient.profile.healthStatement' : {
                    templateUrl: 'states/patient/profile/health_statement/blood_problems.html',
                    controller: 'HealthStatementCtrl'
                }
            },
            resolve: {
                healthStatement: function (PatientService, $rootScope) {
                    return PatientService.loadHealthStatement($rootScope.currentUser.id);
                }
            }
        });
    })
    .controller('HealthStatementCtrl', ['$scope', 'PatientService', 'healthStatement',
        function ($scope, PatientService, healthStatement) {
            $scope.healthStatement = healthStatement;

            $scope.save = function (patientHealthStatement) {
                PatientService.saveHealthStatement($scope, patientHealthStatement);
            }

        }]);