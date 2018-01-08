angular.module('personalPortal.patient', [
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient', {
            abstract: true,
            url: '/patient',
            data: {
                requireLogin: true,
                roles: ['PATIENT', 'ADMIN']
            }
        });
    });