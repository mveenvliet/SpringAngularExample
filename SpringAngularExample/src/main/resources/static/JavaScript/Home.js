var app = angular.module('app', []);

app.controller('controller', function($scope, $http, $location) {
	$scope.Testfunction = function() {
		$scope.text = "Test 123";
		console.log("button pressed")
		var config = {
			headers : {
				'Accept' : 'application/json'
			}
		}
		var data = {
			number : 1
		}
		$.get("Test", data, config).then(
			function(response) {

				console.log(response.data);
				console.log(response);
				
			},
			function error(response) {
				console.log(response);
				$scope.postResultMessage = "Error with status: "
				+ response.statusText;
			});
	}
});