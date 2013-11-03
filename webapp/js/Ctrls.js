var smcApp_Controllers = angular.module('SCMApp_Controllers', ['ui.bootstrap']);

smcApp_Controllers.controller('SlideCtrl',['$scope',function($scope) {$scope.isCollapsed = true;}]);

smcApp_Controllers.controller('NewContactCtrl',['$scope','$http',function($scope,$http){
  $scope.contact={};
  $scope.contact.addresses=new Array;
  $scope.contact.addresses[0]={};
  $scope.contact.emails=new Array;
  $scope.contact.phoneNumbers={};
  $http.get('js/datas/countries.json').success(function(data) {
    $scope.countries = data;
  });
  $scope.saveContact=function(){
  	console.log($scope.contact);
  	$http.post('app/contact',$scope.contact);
  };

}]);
