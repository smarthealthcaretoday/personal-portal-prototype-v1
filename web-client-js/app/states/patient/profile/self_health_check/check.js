angular.module('personalPortal.patient.profile.selfHealthCheck.check', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices',
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.selfHealthCheck.check', {
            url: '/check/:id',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/self_health_check/check.html',
                    controller: 'SelfHealthCheckCheckCtrl'
                }
            },
            resolve: {
                selfHealthCheck: function (PatientService, $rootScope, $stateParams) {
                    if($stateParams.id) {
                        return PatientService.loadSelfHealthCheck($stateParams.id);
                    } else {
                        return {};
                    }
                }
            }
        });
    })
    .controller('SelfHealthCheckCheckCtrl', ['$scope', 'PatientService', 'selfHealthCheck', '$state', '$rootScope',
        function ($scope, PatientService, selfHealthCheck, $state, $rootScope) {
            $scope.new = true;
            $scope.selfHealthCheck = selfHealthCheck;

            if(selfHealthCheck.id) {
                $scope.new = false;
            }

            $scope.save = function (selfHealthCheckForm) {
                if($scope.new) {
                    $scope.selfHealthCheck.patientId = $rootScope.currentUser.id;
                }
                PatientService.saveSelfHealthCheck($scope, selfHealthCheckForm);
                $scope.new = false;
                $scope.selfHealthCheck.date = new Date();
            }

            $scope.back = function() {
                $state.go('personalPortal.patient.profile.selfHealthCheck.history');
            }

        }]);