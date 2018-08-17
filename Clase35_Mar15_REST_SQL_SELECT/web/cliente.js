class Distribuidora {
    static obtenerParametrosDelFormularioCliente() {
        console.log('[..] Distribuidora.obtenerParametrosDelFormularioCliente() !! ');
        let golosina = {};
        golosina.titulo = document.querySelector("#golosina_titulo").value;
        golosina.descripcion = document.querySelector("#golosina_descripcion").value;
        golosina.precio = document.querySelector("#golosina_precio").value;
        // verificar que los campos son correctos, fechas, no vacios
        // Si No valida Correctamente, lanzar Excepcion
        // Limpieza del Formulario 
        document.querySelector("#golosina_titulo").value = "";
        document.querySelector("#golosina_descripcion").value = "";
        console.log('[OK] Distribuidora.obtenerParametrosDelFormularioCliente() !! ');
        return golosina;
    }
    static ofertar() {
        console.log('[..] Distribuidora.ofertar() Programando en Javascript en Buenos Aires');
        let valorRespuesta = "";
        let valorPedido = "";
// 1. INPUT
        valorPedido = document.querySelector("#golosina_titulo").value + document.querySelector("#golosina_descripcion").value;
// 2. PROCESAMIENTO
        valorRespuesta = " -- " + valorPedido + " -- ";
        const traer = async () => {
            let golosina = Distribuidora.obtenerParametrosDelFormularioCliente();
            let golosinaStringJSON = JSON.stringify(golosina);
            let respuesta = await fetch("GolosinaServer",
                    {method: 'POST', body: golosinaStringJSON});
            //let datotexto = JSON.parse(await respuesta.text());
            let datotexto = await respuesta.text(); // solo ahora por mostrar bruto texto
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
// 3. OUTPUT
        document.querySelector("#panelMsg").innerHTML = valorRespuesta;
        console.log('[OK] Distribuidora.ofertar() Programando en Javascript en Buenos Aires');
    }
    static actualizar() {
        console.log('[..] ACTUALIxando en Buenos Aires');
        let valorRespuesta = "";
        let valorPedido = "";
// 1. INPUT
        valorPedido = document.querySelector("#golosina_titulo").value + document.querySelector("#golosina_descripcion").value;
// 2. PROCESAMIENTO
        valorRespuesta = " -- " + valorPedido + " -- ";
        const traer = async () => {
            let golosina = Distribuidora.obtenerParametrosDelFormularioCliente();
            let golosinaStringJSON = JSON.stringify(golosina);
            let respuesta = await fetch("GolosinaServer",
                    {method: 'PUT', body: golosinaStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
// 3. OUTPUT
        document.querySelector("#panelMsg").innerHTML = valorRespuesta;
        console.log('[OK] ACTUALIxando en Buenos Aires');
    }
    static borrar() {
        console.log('[..] Borrando en Buenos Aires');
        let valorRespuesta = "";
        let valorPedido = "";
// 1. INPUT
        valorPedido = document.querySelector("#golosina_titulo").value + document.querySelector("#golosina_descripcion").value;
// 2. PROCESAMIENTO
        valorRespuesta = " -- " + valorPedido + " -- ";
        const traer = async () => {
            let golosina = Distribuidora.obtenerParametrosDelFormularioCliente();
            let golosinaStringJSON = JSON.stringify(golosina);
            let respuesta = await fetch("GolosinaServer",
                    {method: 'DELETE', body: golosinaStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
// 3. OUTPUT
        document.querySelector("#panelMsg").innerHTML = valorRespuesta;
        console.log('[OK] Borrando en Buenos Aires');
    }
    static consultar() {
        console.log('[..] ConSullTar en Buenos Aires');
        let valorRespuesta = "";
        let valorPedido = "";
// 1. INPUT
        valorPedido = document.querySelector("#golosina_titulo").value + document.querySelector("#golosina_descripcion").value;
// 2. PROCESAMIENTO
        valorRespuesta = " -- " + valorPedido + " -- ";
        const traer = async () => {
            let golosina = Distribuidora.obtenerParametrosDelFormularioCliente();
            let golosinaStringJSON = JSON.stringify(golosina);
            let respuesta = await fetch("GolosinaServer?&parametro=" + golosinaStringJSON,
                    {method: 'GET'});
            let datotexto = JSON.parse(await respuesta.text());
            let plantilla = document.querySelector('#plantillaGolosina').innerHTML;
            document.querySelector('#panelResultados').innerHTML = eval( plantilla );
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
// 3. OUTPUT
        document.querySelector("#panelMsg").innerHTML = valorRespuesta;
        console.log('[OK] ConSullTar en Buenos Aires');
    }

}



