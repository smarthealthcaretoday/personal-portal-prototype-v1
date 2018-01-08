angular.module('personalPortal.patient.profile.selfHealthCheck.history', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.selfHealthCheck.history', {
            url: '/history',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/self_health_check/history.html',
                    controller: 'SelfHealthCheckHistoryCtrl'
                }
            },
            resolve: {
                selfHealthChecks: function (PatientService, $rootScope) {
                    return PatientService.loadSelfHealthChecks($rootScope.currentUser.id);
                }
            }
        });
    })
    .controller('SelfHealthCheckHistoryCtrl', ['$scope', '$rootScope', 'selfHealthChecks', 'PatientService',
        function ($scope, $rootScope, selfHealthChecks, PatientService) {
            $scope.selfHealthChecks = selfHealthChecks;
            $scope.history = {};
            $scope.history.endDate = new Date();
            $scope.history.endDate.setHours(23, 59, 59);
            $scope.history.startDate = angular.copy($scope.history.endDate);
            $scope.history.startDate.setDate($scope.history.endDate.getDate() - 14);
            $scope.history.startDate.setHours(0, 0, 0);

            $scope.show = function() {
                $scope.selfHealthChecks = PatientService.loadSelfHealthChecks($rootScope.currentUser.id, $scope.history.startDate.getTime(), $scope.history.endDate.getTime());
            };

            $scope.datepickerState = {
                startDateOpened: false,
                endDateOpened: false
            };

            $scope.openStartDate = function ($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.startDateOpened = true;
            };

            $scope.openEndDate = function ($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.datepickerState.endDateOpened = true;
            };

        }]);