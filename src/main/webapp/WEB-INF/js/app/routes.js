var Routes = ['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/NuevaPrueba', {
                    templateUrl: '/KitsPruebas/templates/Ensamble/Nueva.html',
                    controller: 'EnsambleController'
                }).
                when('/Pruebas', {
                    templateUrl: '/KitsPruebas/templates/Ensamble/Pruebas.html',
                    controller: 'PruebasCtrl'
                }).
                when('/Pruebas/:PruebaID', {
                    templateUrl: '/KitsPruebas/templates/Ensamble/Prueba.html',
                    controller: 'PruebaCtrl'
                }).
                when('/PruebaSinCarga/:EnsambleID', {
                    templateUrl: '/KitsPruebas/templates/PruebaSinCarga.html',
                    controller: 'PruebaSinCargaController'
                }).
                when('/PruebaSinCargaView/:EnsambleID/:PruebaID', {
                    templateUrl: '/KitsPruebas/templates/PruebaSinCargaView.html',
                    controller: 'PruebaSinCargaCtrl'
                }).
                when('/PruebaConCargaView/:EnsambleID/:PruebaID', {
                    templateUrl: '/KitsPruebas/templates/PruebaConCargaView.html',
                    controller: 'PruebaSinCargaCtrl'
                }).
                when('/PruebaConCarga/:EnsambleID', {
                    templateUrl: '/KitsPruebas/templates/PruebaConCarga.html',
                    controller: 'PruebaConCargaController'
                }).
                when('/PruebaConCargaSubita/:EnsambleID', {
                    templateUrl: '/KitsPruebas/templates/PruebaConCargaSubita.html',
                    controller: 'PruebaConCargaSubitaCtrl'
                }).
                when('/Motores', {
                    templateUrl: '/KitsPruebas/templates/Motores/Index.html',
                    controller: 'MotoresCtrl'
                }).
                when('/Motores/Edit', {
                    templateUrl: '/KitsPruebas/templates/Motores/Edit.html',
                    controller: 'MotoresSaveCtrl'
                }).
                when('/Motores/Create', {
                    templateUrl: '/KitsPruebas/templates/Motores/Create.html',
                    controller: 'MotoresSaveCtrl'
                }).
                when('/PruebaControl/:EnsambleID', {
                    templateUrl: '/KitsPruebas/templates/PruebaControl.html',
                    controller: 'PruebaControlCtrl'
                }).
                when('/PruebaControlView/:EnsambleID/:PruebaID', {
                    templateUrl: '/KitsPruebas/templates/PruebaControlView.html',
                    controller: 'PruebaControlViewCtrl'
                }).
                when('/Usuarios', {
                    templateUrl: '/KitsPruebas/templates/Usuarios/Index.html',
                    controller: 'UsuariosCtrl'
                }).
                when('/Usuarios/Edit/:id', {
                    templateUrl: '/KitsPruebas/templates/Usuarios/Edit.html',
                    controller: 'UsuariosSaveCtrl'
                }).
                when('/Usuarios/Create', {
                    templateUrl: '/KitsPruebas/templates/Usuarios/Create.html',
                    controller: 'UsuariosSaveCtrl'
                }).
                when('/Ubicaciones', {
                    templateUrl: '/KitsPruebas/templates/Ubicaciones/Index.html',
                    controller: 'UbicacionesCtrl'
                }).
                when('/Ubicaciones/Edit/:id', {
                    templateUrl: '/KitsPruebas/templates/Ubicaciones/Edit.html',
                    controller: 'UbicacionesSaveCtrl'
                }).
                when('/Ubicaciones/Create', {
                    templateUrl: '/KitsPruebas/templates/Ubicaciones/Create.html',
                    controller: 'UbicacionesSaveCtrl'
                }).
                otherwise({
                    redirectTo: '/'
                });
    }];
app.config(Routes);