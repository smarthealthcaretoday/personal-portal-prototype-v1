angular.module('personalPortal.admin', [
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.admin', {
            abstract: true,
            url: '/admin',
            data: {
                requireLogin: true,
                roles: ['ADMIN']
            }
        });
    });