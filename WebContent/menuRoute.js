
angularApp
.config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.
                when('/workOrders', {
                    templateUrl: 'workorder/WorkOrderList.jspf'
                }).
                when('/workOrderDetail/:id', {
                    templateUrl: 'workorder/WorkOrderDetail.jspf'
                }).
                when('/rfqDetail/:id', {
                    templateUrl: 'rfq/RFQDetail.jspf'
                }).
                otherwise({
                    redirectTo: '/'
                });
        }]);
