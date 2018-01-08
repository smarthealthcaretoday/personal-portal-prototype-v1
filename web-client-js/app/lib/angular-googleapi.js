angular.module('googleApi', [])
    .value('version', '0.1')

    .service('GoogleApiBuilder', ['$q',
        function ($q) {
            this.loadClientCallbacks = [];

            this.build = function (requestBuilder, responseTransformer) {
                return function (args) {
                    var deferred = $q.defer();
                    var response;
                    request = requestBuilder(args);
                    request.execute(function (resp, raw) {
                        if (resp.error) {
                            deferred.reject(resp.error);
                        } else {
                            response = responseTransformer ? responseTransformer(resp) : resp;
                            deferred.resolve(response);
                        }

                    });
                    return deferred.promise;

                }
            };

            this.afterClientLoaded = function (callback) {
                this.loadClientCallbacks.push(callback);
            };

            this.runClientLoadedCallbacks = function () {
                for (var i = 0; i < this.loadClientCallbacks.length; i++) {
                    this.loadClientCallbacks[i]();
                }
            };
    }])

    .service('GoogleCalendar', ['GoogleApiBuilder', '$rootScope',
        function (GoogleApiBuilder, $rootScope) {
            var self = this;
            var itemExtractor = function (resp) {
                return resp.items;
            };

            GoogleApiBuilder.afterClientLoaded(function () {
                gapi.client.load('calendar', 'v3', function () {
                    self.listEvents = GoogleApiBuilder.build(gapi.client.calendar.events.list, itemExtractor);
                    self.listCalendars = GoogleApiBuilder.build(gapi.client.calendar.calendarList.list, itemExtractor);
                    self.createEvent = GoogleApiBuilder.build(gapi.client.calendar.events.insert);
                    $rootScope.$broadcast('googleCalendar:loaded')
                });
            });
    }])

    .provider('GoogleLogin', [
        function () {

            this.configure = function (conf) {
                this.config = conf;
            };

            this.$get = function ($q, GoogleApiBuilder, $rootScope) {
                var config = this.config;
                var deferred = $q.defer();
                return {
                    login: function () {
                        gapi.auth.authorize({
                            client_id: config.clientId,
                            scope: config.scopes,
                            immediate: false
                        }, this.handleAuthResult);

                        return deferred.promise;
                    },

                    handleClientLoad: function () {
                        gapi.auth.init(function () {});
                        window.setTimeout(checkAuth, 1);
                    },

                    checkAuth: function () {
                        gapi.auth.authorize({client_id: clientId, scope: scopes, immediate: true}, this.handleAuthResult);
                    },

                    handleAuthResult: function (authResult) {
                        if (authResult && !authResult.error) {
                            var data = {};
                            $rootScope.$broadcast('google:authenticated', authResult);
                            GoogleApiBuilder.runClientLoadedCallbacks();
                            deferred.resolve(data);
                        } else {
                            deferred.reject(authResult.error);
                        }
                    },
                }
            };
    }]);