angular.module('personalPortal.patient.dashboard', [
        'personalPortal.patient.blank',
        'personalPortal.patient.profile',
        'personalPortal.patient.activities',
        'personalPortal.patient.activities.addEvent',
        'personalPortal.patient.landing',
        'personalPortal.patient.support',
        'personalPortal.patient.decisionSupport',
        'ui.router'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.dashboard', {
            url: '/dashboard',
            views: {
                '@personalPortal':{templateUrl: 'states/patient/dashboard/dashboard.html'}
            }
        });
    });