angular.module('personalPortal.about', [
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.about', {
            url: '/about',
            templateUrl: 'states/about/about.html'
        });
    });