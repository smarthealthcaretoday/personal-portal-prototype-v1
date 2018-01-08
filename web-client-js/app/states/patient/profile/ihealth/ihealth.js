angular.module('personalPortal.patient.profile.ihealth', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.ihealth', {
            url: '/ihealth',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/ihealth/ihealth.html',
                    controller: 'IHealthCtrl'
                }
            }
        });
    })
    .controller('IHealthCtrl', ['$scope', '$rootScope', '$window', 'IHealthService',
        function ($scope, $rootScope, $window, IHealthService) {

            $scope.getAuthUrl = function () {
                IHealthService.getAuthorizationUrl($rootScope.currentUser.id).$promise.then(function (response) {
                    $window.open(response.url, '_blank', 'toolbar=no, scrollbars=no, resizable=no, top=100, left=500, width=500, height=500');
                });
            }
        }]);