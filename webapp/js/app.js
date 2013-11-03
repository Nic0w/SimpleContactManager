angular.module('SCMApp_Controllers',['ui.bootstrap']);

var SCMApp = angular.module('SCMApp', ['SCMApp_Controllers']);
 
SCMApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/new', {
        templateUrl: 'views/contacts/create.html',
        controller: 'NewContactCtrl'
      }).
      when('/contacts/:id', {templateUrl: 'views/contacts/show.html', controller: 'ContactViewCtrl'}).
      //when('/contacts/:id/edit', {templateUrl: 'views/contacts/create.html', controller: 'EditContactCtrl'}).
      otherwise({
        redirectTo: ''
      });
  }]);