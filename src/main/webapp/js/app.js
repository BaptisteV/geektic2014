var app = angular.module("geektic", ['ngRoute']);

/*
app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});
*/

app.controller('SearchCtrl', function($scope, $http){
	$http.get('/api/hobbies').success(function(hobbies){
		$scope.hobbies = hobbies;
	});
});


app.config(function ($routeProvider){
	$routeProvider.when('/', {
		templateUrl : 'chercher.html'
	});
});


app.config(function ($routeProvider){
	$routeProvider.when('/search', {
		templateUrl : 'searchGeek.html',
		controller : 'SearchCtrl'
	});
});


