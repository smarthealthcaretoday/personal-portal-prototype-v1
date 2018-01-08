angular.module('personalPortal.patient.profile.notes', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.notes', {
            url: '/notes',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/notes/notes.html',
                    controller: 'NotesCtrl'
                }
            },
            resolve: {
                notes: function (PatientService, $rootScope) {
                    return PatientService.loadNotes($rootScope.currentUser.id);
                }
            }
        });
    })
    .controller('NotesCtrl', ['$scope', 'notes', 'PatientService', '$rootScope',
        function ($scope, notes, PatientService, $rootScope) {
            $scope.notes = notes;

            $scope.save = function (patientNotes) {
                if (!$scope.notes.patientId) {
                    $scope.notes.patientId = $rootScope.currentUser.id;
                }
                PatientService.saveNotes($scope, patientNotes);
            }
        }]);