
var app = angular.module('app', []);

app.controller('controller', function($scope) {
	$scope.Testfunction = function() {
		$scope.text = "Test 123";
		var config = {
			headers : {
				'Accept' : 'application/json'
			}
		}
		var data = {
			number : 1
		};
		$
			.get("Test", data, config).then(
			function(response) {
				var table = document
					.getElementById("inventarisTbody");

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