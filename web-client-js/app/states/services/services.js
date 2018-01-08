angular.module('personalPortal.services', [
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.services', {
            url: '/services',
            templateUrl: 'states/services/services.html'
        });
    });