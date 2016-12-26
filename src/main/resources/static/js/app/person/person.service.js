var module = angular.module('personModule');

     module.service('personService', ['Restangular',function(Restangular){
		
    	 var base = Restangular.all('Person/');

    	function create(person){
			return  base.post(person);
		}
		
		return  {
				create:create
		}
		
	}]);


