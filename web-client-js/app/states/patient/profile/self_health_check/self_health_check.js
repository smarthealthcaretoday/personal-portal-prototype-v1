angular.module('personalPortal.patient.profile.selfHealthCheck', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices',
        'personalPortal.patient.profile.selfHealthCheck.history',
        'personalPortal.patient.profile.selfHealthCheck.check'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.selfHealthCheck', {
            url: '/self-health-check',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/self_health_check/self_health_check.html',
                    controller: 'SelfHealthCheckCtrl'
                }
            }
        });
    })
    .controller('SelfHealthCheckCtrl', ['$scope',
        function ($scope) {

        }]);