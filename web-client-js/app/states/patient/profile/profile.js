angular.module('personalPortal.patient.profile', [
        'personalPortal.patient.profile.general',
        'personalPortal.patient.profile.medicalData',
        'personalPortal.patient.profile.healthStatement',
        'personalPortal.patient.profile.selfHealthCheck',
        'personalPortal.patient.profile.chart',
        'personalPortal.patient.profile.notes',
        'personalPortal.patient.profile.ihealth',
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile', {
            abstract: true,
            url: '/profile',
            views: {
                '@personalPortal':{templateUrl: 'states/patient/profile/layout.html'},
                'header@personalPortal.patient.profile': { templateUrl: 'states/patient/profile/header.html' },
                'sideMenu@personalPortal.patient.profile': { templateUrl: 'states/patient/profile/side_menu.html' }
            }
        });
    });