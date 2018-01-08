angular.module('personalPortal.forgotPassword', [
    'ui.bootstrap',
    'personalPortalServices'
])
    .service('ForgotPasswordModal', ['$modal',
        function ($modal) {

            return function () {
                return $modal.open({
                    templateUrl: 'modal/forgot_password/forgot_password.html',
                    controller: 'ForgotPasswordModalCtrl',
                    controllerAs: 'ForgotPasswordModalCtrl'
                });
            };

        }])

    .controller('ForgotPasswordModalCtrl', ['$scope', '$rootScope', 'PatientService',
        function ($scope, $rootScope, PatientService) {
            this.cancel = $scope.$dismiss;

            this.submit = function (forgotPasswordForm) {
                if (forgotPasswordForm.$valid) {
                    PatientService.forgotPassword($scope.email).$promise.then(function (response) {
                        if (response.result == 'OK') {
                            $scope.success = true;
                            $scope.wrongEmail = false;
                        } else {
                            $scope.wrongEmail = true;
                            $scope.success = false;
                        }
                    });
                }
            };
        }]);