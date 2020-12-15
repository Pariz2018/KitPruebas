var Routes = ['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/Incidencias', {
                    templateUrl: '/KitsPruebas/templates/Incidencias/Index.html',
                    controller: 'IncidenciasCtrl'
                }).
                when('/Incidencias/Edit/:IncidenciaID', {
                    templateUrl: '/KitsPruebas/templates/Incidencias/Edit.html',
                    controller: 'IncidenciasSaveCtrl'
                }).
                when('/Incidencias/Create', {
                    templateUrl: '/KitsPruebas/templates/Incidencias/Edit.html',
                    controller: 'IncidenciasSaveCtrl'
                }).
                otherwise({
                    redirectTo: '/Pruebas'
                });
    }];
app.config(Routes);