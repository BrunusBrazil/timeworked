var module = angular.module('personModule');

module.controller('PersonController',['$scope','personService',function PersonController($scope, personService){
    
	$scope.getPersonById  = function (){
		personService.getPerson('12').then(function (person) {
			$scope.person = person;
		});
	}
	
	$scope.create = function (person){
		personService.create(person).then(function (person) {
			$scope.person = person;
		});
		
	}
	
}]);


