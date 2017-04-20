/**
 * Created by xdcao on 2017/4/19.
 */
actionApp.controller('ViewController',['$rootScope','$scope','$http',function ($rootScope, $scope, $http) {
    $scope.$on('$viewContentLoaded',function () {
        console.log('页面加载完成');
    });
    $scope.search=function () {
        personName=$scope.personName;
        $http.get('search',{
            params:{personName:personName}
        }).success(function (data) {
            $scope.person=data;
        });
    };
}]);