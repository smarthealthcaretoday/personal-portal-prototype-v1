angular.module('personalPortal.patient.activities.addEvent', [
    'ui.bootstrap',
    'ui.bootstrap.datetimepicker',
    'googleApi'
])
    .service('AddEventModal', ['$modal',
        function ($modal) {
            return function () {
                var instance = $modal.open({
                    templateUrl: 'states/patient/activities/modal/add_event.html',
                    controller: 'AddEventModalCtrl',
                    controllerAs: 'AddEventModalCtrl'
                });

                return instance.result.then();
            };

        }])

    .controller('AddEventModalCtrl', ['$scope', '$rootScope', 'GoogleCalendar',
        function ($scope, $rootScope, GoogleCalendar) {
            var now = new Date();
            now.setMinutes(0);
            now.setSeconds(0);

            var end = new Date(now.getTime());
            end.setHours(now.getHours() + 1);

            $scope.event = {
                start: now,
                end: end
            };

            this.cancel = $scope.$dismiss;

            this.addEvent = function (addEventForm) {
                if (addEventForm.$valid) {
                    var newEvent = {
                        summary: $scope.event.summary,
                        location: $scope.event.location,
                        start: { dateTime: ($scope.event.start).toISOString()},
                        end: { dateTime: ($scope.event.end).toISOString()}
                    }

                    GoogleCalendar.createEvent({
                        calendarId: 'primary',
                        sendNotifications: true,
                        resource: newEvent
                    }).then(function(event) {
                        $scope.$close(event);

                    }, function(error) {
                        $scope.eventCreationError = error;
                    });
                }
            };

            $scope.dateTimepickerState = {
                startOpened: false,
                endOpened: false
            };

            $scope.openStart = function ($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.dateTimepickerState.startOpened = true;
            };

            $scope.openEnd = function ($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.dateTimepickerState.endOpened = true;
            };
        }]);