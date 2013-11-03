var smcApp_Controllers = angular.module('SCMApp_Controllers', ['ui.bootstrap']);
//controller for the sliding panel connection
smcApp_Controllers.controller('SlideCtrl',['$scope',function($scope) {$scope.isCollapsed = true;}]);

/*Controller of the create contact Page*/
smcApp_Controllers.controller('NewContactCtrl',['$scope','$http',function($scope,$http){
  $scope.contact={};
  $scope.contact.addr=new Array; // we create a new array in prevision to add multiple addresses
  $scope.contact.addr[0]={};
  $scope.contact.emails=new Array; // idem but for emails
  $scope.contact.phones={};
  $http.get('js/datas/countries.json').success(function(data) {
    $scope.countries = data;
  });
  $scope.saveContact=function(){
  	console.log($scope.contact);
  	$http.post('/contact',$scope.contact)
  }

}]);
//Controller for the contact list
smcApp_Controllers.controller('ContactListCtrl',['$scope','$http',function($scope,$http){

$http.get('/contact').success(function(data){
$scope.contactList=data;
});
}])

