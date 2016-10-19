angularApp.controller('rfqDetail', ['$scope', '$routeParams', function($scope, $routeParams) {

	$scope.rfq = {id:$routeParams.id, status: false,
	              lineItems: [{ partNumber:'123ABC', description:'Screw', price:'120.43'}]
	 };
   
}]);