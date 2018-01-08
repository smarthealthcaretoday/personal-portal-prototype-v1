angular.module('personalPortal.login', [
    'ui.bootstrap',
    'angular-storage',
    'personalPortalServices',
    'angular-jwt',
    'personalPortal.forgotPassword'
])
    .service('LoginModal', ['$modal', '$rootScope', 'store', 'jwtHelper',
        function ($modal, $rootScope, store, jwtHelper) {

            function assignCurrentUser(response) {
                var token = response.token;
                store.set('jwt', token);

                var decodedToken = jwtHelper.decodeToken(token);
                var user = {id: decodedToken.id, name: decodedToken.name, role: decodedToken.role};
                $rootScope.currentUser = user;
            }

            return function () {
                var instance = $modal.open({
                    templateUrl: 'modal/login/login.html',
                    windowClass: 'login-modal-window',
                    controller: 'LoginModalCtrl',
                    controllerAs: 'LoginModalCtrl'
                })

                return instance.result.then(assignCurrentUser);
            };

        }])
    .controller('LoginModalCtrl', ['$scope', 'PatientService', 'ForgotPasswordModal',
        function ($scope, PatientService, ForgotPasswordModal) {
            $scope.user = {};

            this.cancel = $scope.$dismiss;

            this.forgotPassword = function() {
                $scope.$dismiss();
                return ForgotPasswordModal();
            }

            this.submit = function (loginForm) {
                if (loginForm.$valid) {
                    PatientService.login($scope.user).$promise.then(function (response) {
                        if (response.result == 'OK') {
                            $scope.$close(response);
                        } else {
                            $scope.wrongUserPass = true;
                        }
                    });
                }
            };
        }]);