personalPortalDirectives.directive('chartWithDatePicker', [
    '$rootScope',
    '$filter',

    function ($rootScope, $filter) {
        function loadData ($scope, endDate) {
            if(!angular.isUndefined(endDate)) {
                $scope.endDate = endDate;
                $scope.endDate.setHours(23, 59, 59);
                $scope.startDate = angular.copy($scope.endDate);
                $scope.startDate.setHours(0, 0, 0);
            }

            if($scope.period === 'MONTH') {
                $scope.startDate.setDate($scope.endDate.getDate());
                $scope.startDate.setMonth($scope.endDate.getMonth() - 1);
                $scope.labelFormat = 'dd/MM';
                $scope.squashDayMeasurements = true;
            } else if($scope.period === 'WEEK') {
                $scope.startDate.setMonth($scope.endDate.getMonth());
                $scope.startDate.setDate($scope.endDate.getDate() - 7);
                $scope.labelFormat = 'dd/MM';
                $scope.squashDayMeasurements = true;
            } else if ($scope.period === 'DAY') {
                $scope.startDate.setMonth($scope.endDate.getMonth());
                $scope.startDate.setDate($scope.endDate.getDate());
                $scope.labelFormat = 'HH:mm';
                $scope.squashDayMeasurements = false;
            }

            $scope.loadDataServiceFunction($rootScope.currentUser.id,
                    $scope.startDate.getTime(),
                    $scope.endDate.getTime(),
                    $scope.squashDayMeasurements)
                .$promise.then(
                        function (response) {
                            if(response.values.length == 0) {
                                $scope.dataFound = false;
                                $scope.isLoading = false;
                                return;
                            } else if (response.values.length == 1) {
                                response.values.unshift({date: $scope.startDate, value1: 0, value2: 0});
                                response.values.push({date: $scope.endDate, value1: 0, value2: 0});
                            }

                            $scope.dataFound = true;
                            $scope.chartData = response.values;
                            $scope.isLoading = false;
                        });
        };

        return {
            restrict: 'E',
            scope: {
                loadDataServiceFunction: "=loadDataServiceFunction",
                chartSeries: '=chartSeries'
            },
            templateUrl: 'directive/chart_with_date_picker/chart_with_date_picker.html',
            link: function ($scope, element, attrs) {
                $scope.isLoading = true;
                $scope.dataFound = false;
                $scope.period = 'WEEK';

                loadData($scope, new Date());

                $scope.datepickerState = {
                    endDateOpened: false
                };

                $scope.openEndDate = function ($event) {
                    $event.preventDefault();
                    $event.stopPropagation();

                    $scope.datepickerState.endDateOpened = true;
                };

                $scope.$watch('endDate', function (newValue, oldValue) {
                    if(!$scope.isLoading) {
                        loadData($scope, newValue);
                    }
                });

                $scope.onPeriodSelected = function () {
                    loadData($scope)
                };

                $scope.chartOptions = {
                    lineMode: 'cardinal',
                    tooltip: {
                        formatter: function(x, y, series) {
                            return $filter('date')(x, 'dd/MM/yyyy HH:mm') + ' - ' + y;
                        }
                    },
                    axes: {
                        x: {
                            key: 'date',
                            type: 'date',
                            labelFunction: function (date) {
                                return $filter('date')(date, $scope.labelFormat);
                            }
                        }
                    },
                    series: $scope.chartSeries
                };
            }
        };
    }]);