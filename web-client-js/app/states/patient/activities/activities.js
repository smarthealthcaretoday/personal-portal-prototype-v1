angular.module('personalPortal.patient.activities', [
    'ui.router',
    'ui.calendar',
    'googleApi',
    'ui.bootstrap',
    'personalPortal.patient.activities.addEvent'
])
    .config(function ($stateProvider, GoogleLoginProvider) {
        GoogleLoginProvider.configure({
            clientId: '8007417436-e925qu8nuj1qd9tsb49cs3c3dd3oik64.apps.googleusercontent.com',
            scopes: ['https://www.googleapis.com/auth/calendar']
        });

        $stateProvider.state('personalPortal.patient.activities', {
            url: '/activities',
            views: {
                '@personalPortal': {templateUrl: 'states/patient/activities/layout.html'},
                'header@personalPortal.patient.activities': {templateUrl: 'states/patient/activities/header.html'},
                '@personalPortal.patient.activities': {
                    templateUrl: 'states/patient/activities/activities.html',
                    controller: 'ActivitiesCtrl'
                }
            },
            resolve: {
                googleEvents: function (GoogleLogin, GoogleCalendar, $q, $rootScope) {
                    var deferred = $q.defer();

                    $rootScope.$on("googleCalendar:loaded", function () {
                        GoogleCalendar.listEvents(getListEventsRequestParams()).then(function (items) {
                            deferred.resolve(items);
                        });
                    });

                    GoogleLogin.login().then(function () {
                    })
                        .catch(function () {
                            console.error("Goole login failed");
                        });

                    return deferred.promise;
                }
            }
        });
    })
    .controller('ActivitiesCtrl', ['$scope', '$compile', 'uiCalendarConfig', 'googleEvents', 'GoogleCalendar', 'AddEventModal',
        function ($scope, $compile, uiCalendarConfig, googleEvents, GoogleCalendar, AddEventModal) {
            $scope.events = transformGoogleEvents(googleEvents);
            $scope.eventSource = [$scope.events];

            $scope.addEvent = function () {
                AddEventModal()
                    .then(function () {
                        GoogleCalendar.listEvents(getListEventsRequestParams())
                            .then(function (items) {
                                var newEvents = transformGoogleEvents(items);
                                $scope.eventSource = [$scope.events];

                                $scope.events.splice(0, $scope.events.length);
                                for(var i = 0; i < newEvents.length; ++i) {
                                    $scope.events.push(newEvents[i]);
                                }
                            });
                    })
                    .catch(function () {
                        console.error("Can't add event");
                    });
            }

            $scope.alertOnDrop = function (event, delta, revertFunc, jsEvent, ui, view) {
                $scope.alertMessage = ('Event Droped to make dayDelta ' + delta);
            };

            $scope.alertOnResize = function (event, delta, revertFunc, jsEvent, ui, view) {
                $scope.alertMessage = ('Event Resized to make dayDelta ' + delta);
            };

            $scope.eventRender = function (event, element, view) {
                //element.attr({'tooltip': event.title,
                //    'tooltip-append-to-body': true});
                //$compile(element)($scope);
            };

            $scope.eventClick = function (event, jsEvent, view) {
                alert(event.title);
            };

            $scope.uiConfig = {
                calendar: {
                    height: 450,
                    editable: true,
                    header: {
                        left: 'month agendaWeek agendaDay',
                        center: 'title',
                        right: 'today prev,next'
                    },
                    timeFormat: 'H:mm',
                    displayEventEnd: true,
                    axisFormat: 'HH:mm',
                    eventClick: $scope.eventClick,
                    eventDrop: $scope.alertOnDrop,
                    eventResize: $scope.alertOnResize,
                    eventRender: $scope.eventRender
                }
            };
        }
    ]);

function getListEventsRequestParams() {
    var start = new Date();
    start.setDate(1);

    var listEventsRequestParams = {
        'calendarId': 'primary',
        'timeMin': (start).toISOString(),
        'showDeleted': false,
        'singleEvents': true,
        'maxResults': 10,
        'orderBy': 'startTime'
    }

    return listEventsRequestParams;
}

function transformGoogleEvents(googleEvents) {
    var events = [];

    for (var i = 0; i < googleEvents.length; i++) {
        var event = {};
        event.id = googleEvents[i].id;
        event.title = googleEvents[i].summary;
        event.start = googleEvents[i].start.dateTime;
        event.end = googleEvents[i].end.dateTime;
        event.allDay = false;

        events.push(event);
    }

    return events;
};



