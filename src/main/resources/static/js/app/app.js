var app = angular.module('timeworked',['personModule','ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/person',{
            templateUrl: '/views/person.html',
            controller: 'PersonController'
        })
        .otherwise(
            { templateUrl: '/views/home.html'}
        );

  });