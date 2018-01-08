angular.module('personalPortal.signup', [
    'ui.bootstrap',
    'angular-storage',
    'ui.utils',
    'personalPortalServices'
])
    .service('SignupModal', ['$modal', '$rootScope', 'store', 'jwtHelper',
        function ($modal, $rootScope, store, jwtHelper) {

            function proceed(response) {
                var token = response.token;
                store.set('jwt', token);

                var decodedToken = jwtHelper.decodeToken(token);
                var user = {id: decodedToken.id, name: decodedToken.name, role: decodedToken.role};
                $rootScope.currentUser = user;
            }

            return function () {
                var instance = $modal.open({
                    templateUrl: 'modal/signup/signup.html',
                    controller: 'SignupModalCtrl',
                    controllerAs: 'SignupModalCtrl'
                })

                return instance.result.then(proceed);
            };

        }])
    .controller('SignupModalCtrl', ['$scope', 'PatientService',
        function ($scope, PatientService) {
            $scope.user = {};

            this.cancel = $scope.$dismiss;

            this.signup = function (signupForm) {
                if (signupForm.$valid) {
                    PatientService.signup($scope.user).$promise.then(function (response) {
                        if (response.result == 'OK') {
                            $scope.$close(response);
                        } else {
                            $scope.formErrors = true;
                        }
                    });
                }
            };
        }]);