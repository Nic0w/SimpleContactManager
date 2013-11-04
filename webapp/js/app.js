angular.module('SCMApp_Controllers',['ui.bootstrap']);

var SCMApp = angular.module('SCMApp', ['SCMApp_Controllers']);

SCMApp.config(['$routeProvider',function($routeProvider) {
	$routeProvider.
  when('/new', {
		templateUrl: 'views/contacts/create.html',
		controller: 'NewContactCtrl'
	}).
    when('/contact/:id', {
    templateUrl: 'views/contacts/read.html',
    controller: 'ContactShowCtrl'
  }).
	otherwise({
		redirectTo: ''
	});
}]);