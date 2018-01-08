angular.module('personalPortal.patient.support', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.support', {
            url: '/customersupport',
            views: {
                '@personalPortal': {
                    templateUrl: 'states/patient/support/support.html',
                    controller: 'SupportCtrl'
                }
            }
        });
    })
    .controller('SupportCtrl', ['$scope', 'PatientService', '$rootScope',
        function ($scope, PatientService, $rootScope) {

            $scope.sendCustomerSupportRequest = function (customerSupportForm) {
                if (customerSupportForm.$valid) {
                    PatientService.sendCustomerSupportRequest($scope, $rootScope.currentUser.id, $scope.subject, $scope.message);
                    customerSupportForm.$dirty = false;
                }
            }
        }]);