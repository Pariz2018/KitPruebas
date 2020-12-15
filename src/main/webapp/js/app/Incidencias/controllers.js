app.controller("IncidenciasCtrl",
        ["$scope", "PlantaServices", "$routeParams","$filter"
                    , function ($scope, PlantaServices,$filter) {
                        BaseTableController.call(this, $scope, $filter);
                        $scope.items = PlantaServices.Incidencias.query($scope.Init);
                        $scope.Delete = function (incidencia) {
                            PlantaServices.Incidencias.delete({id: incidencia.id}, function () {
                                $scope.incidencias.pop(incidencia);
                            }, function () {
                            });
                        };
                    }
        ]);

app.controller("IncidenciasSaveCtrl",
        ["$scope", "PlantaServices", "$routeParams", "$location"
                    , function ($scope, PlantaServices, $routeParams, $location) {
                        $scope.incidencia = new PlantaServices.Incidencias();
                        if ($routeParams.IncidenciaID !== undefined)
                            $scope.incidencia.$get({id: $routeParams.IncidenciaID});
                        $scope.Save = function () {
                            $scope.incidencia.$save(function () {
                                if (!$routeParams.IncidenciaID)
                                    $location.path("/Incidencias/Edit/" + $scope.incidencia.id);
                            }, function () {

                            });
                        };
                        $scope.Update = function () {
                            $scope.incidencia.$update(function () {
                            }, function () {
                            });
                        };
                        $scope.Delete = function () {
                            $scope.incidencia.$delete(function () {
                                $location.path("/Incidencias");
                            }, function () {

                            });
                        };
                    }
        ]);
app.controller("MotoresCtrl",
        ["$scope", "PlantaServices", "$routeParams"
                    , function ($scope, PlantaServices) {
                        $scope.motores = PlantaServices.Motores.query();
                        $scope.Delete = function (motor) {
                            PlantaServices.Motores.delete({modelo: motor.modelo}, function () {
                                $scope.incidencias.pop(motor);
                            }, function () {
                            });
                        };
                    }
        ]);

app.controller("MotoresSaveCtrl",
        ["$scope", "PlantaServices", "$routeParams", "$location"
                    , function ($scope, PlantaServices, $routeParams, $location) {
                        $scope.motor = new PlantaServices.Motores();
                        if ($routeParams.modelo !== undefined)
                            $scope.motor.$get({modelo: $routeParams.modelo});
                        $scope.Save = function () {
                            $scope.motor.$save(function () {
                                if (!$routeParams.modelo)
                                    $location.path("/Motores/Edit/" + $scope.motor.id);
                            }, function () {

                            });
                        };
                        $scope.Update = function () {
                            $scope.motor.$update(function () {
                            }, function () {
                            });
                        };
                        $scope.Delete = function () {
                            $scope.motor.$delete(function () {
                                $location.path("/Motores");
                            }, function () {

                            });
                        };
                    }
        ]);
app.controller("UsuariosCtrl",
        ["$scope", "PlantaServices", "$routeParams"
                    , function ($scope, PlantaServices) {
                        $scope.usuarios = PlantaServices.Usuarios.query();
                        $scope.Delete = function (usuario) {
                            PlantaServices.Usuarios.delete({id: usuario.id}, function () {
                                $scope.usuario.pop(usuario);
                            }, function () {
                            });
                        };
                    }
        ]);

app.controller("UsuariosSaveCtrl",
        ["$scope", "PlantaServices", "$routeParams", "$location"
                    , function ($scope, PlantaServices, $routeParams, $location) {
                        $scope.usuario = new PlantaServices.Usuarios();
                        if ($routeParams.id !== undefined)
                            $scope.usuario.$get({id: $routeParams.id});
                        $scope.Save = function () {
                            $scope.usuario.$save(function () {
                                if (!$routeParams.id)
                                    $location.path("/Usuarios/Edit/" + $scope.usuario.id);
                            }, function () {

                            });
                        };
                        $scope.Update = function () {
                            $scope.usuario.$update(function () {
                            }, function () {
                            });
                        };
                        $scope.Delete = function () {
                            $scope.usuario.$delete(function () {
                                $location.path("/Usuarios");
                            }, function () {

                            });
                        };
                    }
        ]);

app.controller("ClientesCtrl",
        ["$scope", "PlantaServices", "$routeParams"
                    , function ($scope, PlantaServices) {
                        $scope.clientes = PlantaServices.Clientes.query();
                        $scope.Delete = function (cliente) {
                            PlantaServices.Clientes.delete({id: cliente.id}, function () {
                                $scope.cliente.pop(cliente);
                            }, function () {
                            });
                        };
                    }
        ]);

app.controller("ClientesSaveCtrl",
        ["$scope", "PlantaServices", "$routeParams", "$location"
                    , function ($scope, PlantaServices, $routeParams, $location) {
                        $scope.cliente = new PlantaServices.Clientes();
                        if ($routeParams.id !== undefined)
                            $scope.cliente.$get({id: $routeParams.id});
                        $scope.Save = function () {
                            $scope.cliente.$save(function () {
                                if (!$routeParams.id)
                                    $location.path("/Clientes/Edit/" + $scope.cliente.id);
                            }, function () {

                            });
                        };
                        $scope.Update = function () {
                            $scope.cliente.$update(function () {
                            }, function () {
                            });
                        };
                        $scope.Delete = function () {
                            $scope.cliente.$delete(function () {
                                $location.path("/Clientes");
                            }, function () {

                            });
                        };
                    }
        ]);

app.controller("KitsPruebasCtrl",
        ["$scope", "PlantaServices", "$routeParams"
                    , function ($scope, PlantaServices) {
                        $scope.kits = PlantaServices.KitsPruebas.query();
                        $scope.Delete = function (kit) {
                            PlantaServices.KitsPruebas.delete({id: kit.id}, function () {
                                $scope.kit.pop(kit);
                            }, function () {
                            });
                        };
                    }
        ]);

app.controller("KitsPruebasSaveCtrl",
        ["$scope", "PlantaServices", "$routeParams", "$location"
                    , function ($scope, PlantaServices, $routeParams, $location) {
                        $scope.kit = new PlantaServices.KitsPruebas();
                        if ($routeParams.id !== undefined)
                            $scope.kit.$get({id: $routeParams.id});
                        $scope.Save = function () {
                            $scope.kit.$save(function () {
                                if (!$routeParams.id)
                                    $location.path("/KitsPruebas/Edit/" + $scope.kit.id);
                            }, function () {

                            });
                        };
                        $scope.Update = function () {
                            $scope.kit.$update(function () {
                            }, function () {
                            });
                        };
                        $scope.Delete = function () {
                            $scope.kit.$delete(function () {
                                $location.path("/KitsPruebas");
                            }, function () {

                            });
                        };
                    }
        ]);

app.controller("UbicacionesCtrl",
        ["$scope", "PlantaServices", "$routeParams"
                    , function ($scope, PlantaServices) {
                        $scope.ubicaciones = PlantaServices.Ubicaciones.query();
                        $scope.Delete = function (ubicacion) {
                            PlantaServices.Ubicaciones.delete({id: ubicacion.id}, function () {
                                $scope.ubicacion.pop(ubicacion);
                            }, function () {
                            });
                        };
                    }
        ]);

app.controller("UbicacionesSaveCtrl",
        ["$scope", "PlantaServices", "$routeParams", "$location"
                    , function ($scope, PlantaServices, $routeParams, $location) {
                        $scope.ubicacion = new PlantaServices.Ubicaciones();
                        if ($routeParams.id !== undefined)
                            $scope.ubicacion.$get({id: $routeParams.id});
                        $scope.Save = function () {
                            $scope.ubicacion.$save(function () {
                                if (!$routeParams.id)
                                    $location.path("/Ubicaciones/Edit/" + $scope.ubicacion.id);
                            }, function () {

                            });
                        };
                        $scope.Update = function () {
                            $scope.ubicacion.$update(function () {
                            }, function () {
                            });
                        };
                        $scope.Delete = function () {
                            $scope.ubicacion.$delete(function () {
                                $location.path("/Ubicaciones");
                            }, function () {

                            });
                        };
                    }
        ]);