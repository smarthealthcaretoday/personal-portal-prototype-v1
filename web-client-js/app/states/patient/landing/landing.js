angular.module('personalPortal.patient.landing', [
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.landing', {
            url: '/landing',
            views: {
                '@personalPortal': {
                    templateUrl: 'states/patient/landing/landing.html',
                    controller: 'LandingCtrl'
                }
            },
            resolve: {
                reminders: function (EbmedsService, $rootScope) {
                    return EbmedsService.getReminders($rootScope.currentUser.id);
                }
            }
        });
    })
    .controller('LandingCtrl', ['$scope', 'reminders',
        function ($scope, reminders) {
            $scope.reminders = reminders;
        }]);