var smcApp_Controllers = angular.module('SCMApp_Controllers', ['ui.bootstrap']);
//controller for the sliding panel connection
smcApp_Controllers.controller('SlideCtrl',['$scope',function($scope) {$scope.isCollapsed = true;}]);

/*Controller of the create contact Page*/
smcApp_Controllers.controller('NewContactCtrl',['$scope','$http','$rootScope',function($scope,$http,$rootScope){
	$scope.contact={};
	$scope.contact.addresses=new Array;
	$scope.contact.addresses[0]={};
	$scope.contact.emails=new Array; // idem but for emails
	$scope.contact.phoneNumbers={};
	$http.get('js/datas/countries.json').success(function(data) {
		$scope.countries = data;
	});
	$scope.saveContact=function(){
		console.log($scope.contact);
		$http.post('app/contact',$scope.contact);
		$rootScope.$broadcast('reloadContactList');//force the contact list to reload
	};

}]);
//Controller for the contact list
smcApp_Controllers.controller('ContactListCtrl',['$scope','$http',function($scope,$http){
	$scope.contactList= new Array;
	$http.get('app/contact').success(function(datas){
		$scope.contactList=datas;
		console.log("datas : "+datas);
		console.log("contactList : "+$scope.contactList);
	}).
	error(function(){ console.log("Error")});
//	this function is called when the controller receive an event reloadContactList
	$scope.$on('reloadContactList', function () {
		$http.get('app/contact').success(function(datas){
			$scope.contactList=datas;
		});
	});
}]);
smcApp_Controllers.controller('ContactShowCtrl',['$scope','$http',function($scope,$http){


}]);

