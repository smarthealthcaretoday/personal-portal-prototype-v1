angular.module('personalPortal.contact', [
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.contact', {
            url: '/contact',
            templateUrl: 'states/contact/contact.html'
        });
    });