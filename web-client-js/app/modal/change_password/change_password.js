angular.module('personalPortal.changePassword', [
    'ui.bootstrap',
    'personalPortalServices'
])
    .service('ChangePasswordModal', ['$modal',
        function ($modal) {

            return function () {
                return $modal.open({
                    templateUrl: 'modal/change_password/change_password.html',
                    controller: 'ChangePasswordModalCtrl',
                    controllerAs: 'ChangePasswordModalCtrl'
                });
            };

        }])

    .controller('ChangePasswordModalCtrl', ['$scope', '$rootScope', 'PatientService',
        function ($scope, $rootScope, PatientService) {
            this.cancel = $scope.$dismiss;

            this.submit = function (changePasswordForm) {
                if (changePasswordForm.$valid) {
                    PatientService.changePassword($rootScope.currentUser.id, $scope.password, $scope.newPassword).$promise.then(function (response) {
                        if (response.result == 'OK') {
                            $scope.success = true;
                            $scope.wrongUserPass = false;
                        } else {
                            $scope.wrongUserPass = true;
                            $scope.success = false;
                        }
                    });
                }
            };
        }]);