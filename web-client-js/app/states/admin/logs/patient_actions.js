angular.module('personalPortal.admin.patientActions', [
        'personalPortal.admin.patientActions',
        'ui.router',
        'ui.bootstrap',
        'smart-table',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.admin.patientActions', {
            url: '/patient-actions',
            views: {
                '@personalPortal': {
                    templateUrl: 'states/admin/logs/patient_actions.html',
                    controller: 'PatientActionsCtrl'
                }
            },
            resolve:{
                patientActions : function(PatientActionsService) {
                    return PatientActionsService.getAllActions();
                }
            }
        });
    })
    .controller('PatientActionsCtrl', ['$scope', 'patientActions',
        function ($scope, patientActions) {

            $scope.patientActions = patientActions;

        }]);