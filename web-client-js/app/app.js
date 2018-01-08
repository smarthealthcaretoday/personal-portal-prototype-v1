'use strict';

var personalPortalApp = angular.module('personalPortal', [
    'personalPortal.home',
    'personalPortal.about',
    'personalPortal.services',
    'personalPortal.contact',
    'personalPortal.patient',
    'personalPortal.patient.dashboard',
    'personalPortal.admin',
    'personalPortal.login',
    'personalPortal.signup',
    'personalPortal.changePassword',
    'personalPortal.forgotPassword',
    'personalPortalDirectives',
    'ui.router',
    'angular-jwt',
    'angular-storage'
]);

personalPortalApp.constant('BACKEND_PORT', '8080');
personalPortalApp.constant('BACKEND_ROOT', '/');

personalPortalApp.config(function ($stateProvider, $urlRouterProvider, jwtInterceptorProvider, $httpProvider) {
    $urlRouterProvider.otherwise('/');

    jwtInterceptorProvider.tokenGetter = function (store) {
        return store.get('jwt');
    }

    $httpProvider.interceptors.push('jwtInterceptor');

    $stateProvider
        .state('personalPortal', {
            abstract: true,
            url: '',
            views: {
                '@': {templateUrl: 'index.html'},
                'menu@personalPortal': {
                    templateUrl: 'partials/menu.html',
                    controller: 'MenuCtrl'
                },
                'footer@personalPortal': {templateUrl: 'partials/footer.html'}
            },
            data: {
                requireLogin: false
            }
        })
})
    .controller('MenuCtrl', ['$scope', '$rootScope', 'store', '$state', 'ChangePasswordModal',
        function ($scope, $rootScope, store, $state, ChangePasswordModal) {
            $scope.getCurrentUser = function () {
                if(typeof $rootScope.currentUser !== 'undefined') {

                    return $rootScope.currentUser;
                } else {

                    return false;
                }
            };

            $scope.logout = function () {
                delete $rootScope.currentUser;
                store.remove('jwt');
                $state.go('personalPortal.home');
            }

            $scope.changePassword = function () {
                return ChangePasswordModal();
            }

            $scope.isCurrentUserAdmin = function () {
                if(typeof $rootScope.currentUser !== 'undefined') {

                    return $rootScope.currentUser.role == 'ADMIN';
                } else {

                    return false;
                }
            }
        }
    ])
    .run(function ($rootScope, $state, $location, store, jwtHelper, LoginModal, BACKEND_PORT, BACKEND_ROOT) {
        store.remove('jwt');

        $rootScope.baseBackendUrl = $location.protocol() + '://' + $location.host()+ ':' + BACKEND_PORT + BACKEND_ROOT;

        $rootScope.today = new Date();

        $rootScope.dateOptions = {
            showWeeks: false,
            formatYear: 'yy',
            startingDay: 1
        };
        $rootScope.timeOptions = {
            showMeridian: false
        };

        $rootScope.$on('$stateChangeStart', function (e, toState, toParams) {
            if (toState.data && toState.data.requireLogin) {
                if (!store.get('jwt') || jwtHelper.isTokenExpired(store.get('jwt'))) {
                    e.preventDefault();
                    LoginModal()
                        .then(function () {
                            return $state.go(toState.name, toParams);
                        })
                        .catch(function () {
                            return $state.go('personalPortal.home');
                        });
                } else {
                    if (toState.data.roles) {
                        if ($.inArray($rootScope.currentUser.role, toState.data.roles) == -1) {
                            e.preventDefault();
                            return $state.go('personalPortal.patient.dashboard');
                        }
                    }
                }
            }
        });
    })
    .directive('datepickerPopup', function (){
        return {
            restrict: 'EAC',
            require: 'ngModel',
            link: function(scope, element, attr, controller) {
                //remove the default formatter from the input directive to prevent conflict
                controller.$formatters.shift();
            }
        }
    })
;

var personalPortalDirectives = angular.module('personalPortalDirectives', [
    'ui.bootstrap.datetimepicker',
    'personalPortalServices'
]);
