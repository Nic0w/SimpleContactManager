angular.module('SCMApp_Controllers',['ui.bootstrap']);

var SCMApp = angular.module('SCMApp', ['SCMApp_Controllers']);

SCMApp.config(['$routeProvider',function($routeProvider) {
	$routeProvider.
  when('/new', {
		templateUrl: 'views/contacts/contact_forms.html',
		controller: 'NewContactCtrl'
	}).
    when('/contact/:id', {
    templateUrl: 'views/contacts/read.html',
    controller: 'ContactShowCtrl'
  }).
        when('/contact/:id/edit', {
    templateUrl: 'views/contacts/contact_forms.html',
    controller: 'ContactEditCtrl'
  }).
	otherwise({
		redirectTo: ''
	});
}]);