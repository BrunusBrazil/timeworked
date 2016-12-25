var module = angular.module('personModule');


     module.service('personService', ['Restangular',function(Restangular){
		
		function getPerson(id){
			return  Restangular.one('Person', id).get();
		}
		
		return  {
				getPerson:getPerson
		}
		
	}]);


