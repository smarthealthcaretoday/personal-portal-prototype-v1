angular.module('personalPortal.patient.decisionSupport', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.decisionSupport', {
            url: '/decision-support',
            views: {
                '@personalPortal': {templateUrl: 'states/patient/decision_support/layout.html'},
                'header@personalPortal.patient.decisionSupport': { templateUrl: 'states/patient/decision_support/header.html' },
                '@personalPortal.patient.decisionSupport': {
                    templateUrl: 'states/patient/decision_support/reminders.html',
                    controller: 'RemindersCtrl'
                }
            },
            resolve: {
                reminders: function (EbmedsService, $rootScope) {
                    return EbmedsService.getReminders($rootScope.currentUser.id);
                }
            }
        });
    })
    .controller('RemindersCtrl', ['$scope', 'reminders',
        function ($scope, reminders) {
            $scope.reminders = reminders;
        }]);