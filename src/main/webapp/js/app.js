var app = angular.module("geektic", ['ngRoute']);

/*
app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});
*/

app.controller('SearchCtrl', function($scope, $http, $location){
	$http.get('/api/hobbies').success(function(hobbies){
		$scope.hobbies = hobbies;
	});
	$scope.search = function(selectedGender, selectedHobby){
		var tab=[];
		if(selectedGender){
			tab.push("gender=" + selectedGender);
		}
		if(selectedHobby){
			tab.push("hobby=" + selectedHobby);
		}
		
		$location.url("/result?" + tab.join("&"))
	}
});

app.controller('ResultCtrl', function($scope, $http, $routeParams){
	$http.get('/api/result', {params: $routeParams}).success(function(geeks){
		$scope.geeks = geeks;
	});
});


app.config(function ($routeProvider){
	$routeProvider.when('/', {
		templateUrl : 'chercher.html'
	});
	$routeProvider.when('/search', {
		templateUrl : 'searchGeek.html',
		controller : 'SearchCtrl'
	});
	$routeProvider.when('/result', {
		templateUrl : 'geekList.html',
		controller : 'ResultCtrl'
	});
});

