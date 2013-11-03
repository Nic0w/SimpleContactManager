var smcApp_Controllers = angular.module('SCMApp_Controllers', ['ui.bootstrap']);

smcApp_Controllers.controller('SlideCtrl',['$scope',function($scope) {$scope.isCollapsed = true;}]);

smcApp_Controllers.controller('NewContactCtrl',['$scope','$http',function($scope,$http){
  $http.get('js/datas/countries.json').success(function(data) {
    $scope.countries = data;
    console.log($scope.countries);
    $scope.country= $scope.countries[0];
  });
}]);
