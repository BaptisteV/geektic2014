var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});
/*
app.config(function ($routeProvider){
	$routeProvider.when('/');
	controller : 'ButtonCtrl';
});
*/