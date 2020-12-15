var services = ["PlantaServices",
    ["$resource", function ($resource) {
            var urlApiBase = "/KitPruebas/api/";
            var api = {};
            api.Plantas = $resource(urlApiBase + "Planta/:noSerie", {}, {
                On: {method: 'get', url: urlApiBase + "Planta/On/:id"},
                Off: {method: 'get', url: urlApiBase + "Planta/Off/:id"}
            });
            api.Carriles = $resource(urlApiBase + "Cariles/:id", {}, {
                update: {method: 'PUT'}
            });
            api.KitsPruebas = $resource(urlApiBase + "Cariles/:id", {}, {
                update: {method: 'PUT'}
            });
            api.Ubicaciones = $resource(urlApiBase + "Ubicaciones/:id", {}, {
                update: {method: 'PUT'}
            });
            api.Motores = $resource(urlApiBase + "Motores/:modelo", {}, {
                update: {method: 'PUT'},
                get: {method: 'GET', url: urlApiBase + "Motores/Get"}
            });
            api.Ensambles = $resource(urlApiBase + "Prueba/:id", {}, {});
            api.Pruebascontrol = $resource(urlApiBase + "Pruebacontrol/:id", {}, {});
            api.Instalacion = $resource(urlApiBase + "Instalacion/:id", {}, {
                update: {method: 'PUT'}
            });
            api.Pruebas = $resource(urlApiBase + "Pruebas/:id", {}, {
                GetValues: {url: urlApiBase + 'Planta/GetValues/:id/:seg/:ite/:equipo'},
                Valores: {url: urlApiBase + "Planta/Valores/:id"},
                update: {method: 'PUT'},
                Lecturas: {url: urlApiBase + "Pruebas/Lecturas/:id", isArray: true},
                Autoriza: {method: 'POST', url: urlApiBase + "Pruebas/Autoriza/:id"},
                Rechaza: {method: 'POST', url: urlApiBase + "Pruebas/Rechaza/:id"},
                Control: {method: 'POST', url: urlApiBase + "Pruebacontrol"}
            });
            api.Incidencias = $resource(urlApiBase + "Incidencias/:id", {}, {
                update: {method: 'PUT'}
            });
            api.Usuarios = $resource(urlApiBase + "Usuarios/:id", {}, {
                update: {method: 'PUT'}
            });
            api.Clientes = $resource(urlApiBase + "Clientes/:id", {}, {
                update: {method: 'PUT'}
            });
            return api;
        }]];
app.factory(services[0], services[1]);
