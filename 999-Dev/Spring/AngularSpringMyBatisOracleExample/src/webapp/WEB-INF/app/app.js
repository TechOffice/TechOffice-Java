var app = angular.module("app", [ 'ui.router', 'ngRoute', 'oc.lazyLoad', 
                                  'ngAnimate', 'ngSanitize', 'ui.bootstrap',
                                  'ui.grid']);

app.config(function($provide, $stateProvider, $locationProvider, $routeProvider, $ocLazyLoadProvider, $urlRouterProvider) {
	
	$urlRouterProvider.otherwise('/');
	

	// 
	$stateProvider.state({
		name: "main",
		url: "/",
		resolve: {
			load: function($ocLazyLoad){
				return $ocLazyLoad.load({
					files : ['directive/form/datepicker.js', 
					         'directive/common/viewMode.js',
					         'service/gridService.js']
				});
			}
		}
	});


	$stateProvider.state({
		name: "main.test",
		url: "test",
		templateUrl: "template/test.html",
		controller: 'TestController',
		resolve: {
			load: function($ocLazyLoad){
				return $ocLazyLoad.load({
					files: ['controller/testController.js']
				});
			}
		}
	});
	
	$stateProvider.state({
		name: "main.test1",
		url: "test1",
		template: "<div>test 1</div>",
		controller: 'HomeController',
		resolve: {
			load: function($ocLazyLoad){
				return $ocLazyLoad.load({
					files: ['controller/homeController.js']
				});
			}
		}
	});
	
	$stateProvider.state({
		name: "main.test2",
		url: "test2",
		template: "<div>test 2</div>",
		controller: 'HomeController',
		resolve: {
			load: function($ocLazyLoad){
				return $ocLazyLoad.load({
					files: ['controller/homeController.js']
				});
			}
		}
			
	});
	

	
});

app.run(function($ocLazyLoad, $templateCache, $http, $urlRouter, $q, $rootScope){	
	
})