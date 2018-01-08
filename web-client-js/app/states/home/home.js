angular.module('personalPortal.home', [
    'personalPortal.signup',
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.home', {
            url: '/',
            controller: 'HomeCtrl',
            templateUrl: 'states/home/home.html'
        });
    })
    .controller('HomeCtrl', ['$scope', '$state', 'SignupModal',
        function ($scope, $state, SignupModal) {
            $scope.login = function () {
                $state.go('personalPortal.patient.dashboard');
            }

            $scope.signup = function () {
                SignupModal()
                    .then(function () {
                        return $state.go('personalPortal.patient.profile.general');
                    })
                    .catch(function () {
                        return $state.go('personalPortal.home');
                    });
            }
        }]);