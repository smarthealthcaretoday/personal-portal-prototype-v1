angular.module('personalPortal.patient.blank', [
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.blank', {
            url: '/blank',
            views: {
                '@personalPortal':{templateUrl: 'states/patient/blank/blank.html'}
            }
        });
    });