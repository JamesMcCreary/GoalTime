(function () {
    'use strict';
    
    angular
        .module('myApp')
        .config(config);
    
    function config($locationProvider, $routeProvider){
        $locationProvider.hashPrefix('!');
        $routeProvider.otherwise({redirectTo: '/Views/view1'});
    };
})();