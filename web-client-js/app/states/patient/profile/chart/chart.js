angular.module('personalPortal.patient.profile.chart', [
        'ui.router',
        'ui.bootstrap',
        'personalPortalServices',
        'n3-line-chart'
    ])
    .config(function ($stateProvider) {
        $stateProvider.state('personalPortal.patient.profile.chart', {
            url: '/chart',
            views: {
                '@personalPortal.patient.profile': {
                    templateUrl: 'states/patient/profile/chart/chart.html',
                    controller: 'ChartCtrl'
                }
            }
        });
    })
    .controller('ChartCtrl', ['$scope', 'PatientService',
        function ($scope, PatientService) {
            $scope.patientBPServiceFunction = PatientService.getPatientBPMeasurements;
            $scope.patientBPChartSeries = [
                {
                    y: 'value1',
                    label: 'Diastolic',
                    color: '#FF9900',
                    type: 'area'
                },
                {
                    y: 'value2',
                    label: 'Systolic',
                    type: 'area',
                    color: '#33CC66'
                }
            ];

            $scope.patientWeightServiceFunction = PatientService.getPatientWeightMeasurements;
            $scope.patientWeightChartSeries = [
                {
                    y: 'value1',
                    label: 'Weight',
                    color: '#33CC66'
                }
            ];

            $scope.patientBOServiceFunction = PatientService.getPatientBOMeasurements;
            $scope.patientBOChartSeries = [
                {
                    y: 'value1',
                    label: 'Weight',
                    color: '#33CC66'
                }
            ];

            $scope.patientHRServiceFunction = PatientService.getPatientHRMeasurements;
            $scope.patientHRChartSeries = [
                {
                    y: 'value1',
                    label: 'Weight',
                    color: '#33CC66'
                }
            ];
        }]);