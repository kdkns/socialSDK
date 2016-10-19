angularApp.controller('workOrderDetail', ['$scope', '$routeParams', function($scope, $routeParams) {

	$scope.workOrder = {id:$routeParams.id, rfqs:[{ id: 'REF-12345' , status: false} ]};
   
}]);