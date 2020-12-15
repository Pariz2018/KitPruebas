var Routes = ['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/Incidencias', {
                    templateUrl: '/KitPruebas/templates/Incidencias/Index.html',
                    controller: 'IncidenciasCtrl'
                }).
                when('/Incidencias/Edit/:IncidenciaID', {
                    templateUrl: '/KitPruebas/templates/Incidencias/Edit.html',
                    controller: 'IncidenciasSaveCtrl'
                }).
                when('/Incidencias/Create', {
                    templateUrl: '/KitPruebas/templates/Incidencias/Create.html',
                    controller: 'IncidenciasSaveCtrl'
                }).
                otherwise({
                    redirectTo: '/Pruebas'
                });
    }];
app.config(Routes);