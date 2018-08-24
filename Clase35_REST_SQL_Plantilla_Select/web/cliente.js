// Programando una clase en Javascript
class Notas {
    // Programando un metodo de una clase en Javascript
    static subir() {
        console.log('[..] Hola, martes con frio en buenos aires!!!');
        let valorPedido = "";
        let valorRespuesta = "";
// INPUT
        valorPedido = document.querySelector("#nota_titulo").value;
//1. Procesamiento
        valorRespuesta = valorPedido;
        //1.1 le envio un dato de parametro al Servidor    
        const traer = async () => {
            let persona = Notas.obtenerDatosDelFormularioCliente(); // obtengo OK, O tendria que lanzar Exception
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer",
                    {method: 'POST', body: personaStringJSON});
            //let datotexto = JSON.parse(await respuesta.text());
            let datotexto = await respuesta.text();
            // mostrar la respuesta del servidor
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
        //1.2 recibo respuesta del Servidor, tambien en algun dato de parametro
//2. OUTPUT    
        document.querySelector("#panelMsgContenido").innerHTML = valorRespuesta;
        console.log('[OK] Hola, martes con frio en buenos aires!!!');
    }

    static limpiar() {
        document.querySelector("#panelMsgContenido").innerHTML = "";
    }

    static actualizar() {
        console.log("[..] actualizando, Programando el Cliente Javascript");
        // Aqui los alumnos lograran consultar al Server!! Tarannn!
        let valorPedido = "";
        let valorRespuesta = "";
// INPUT
        valorPedido = document.querySelector("#nota_titulo").value;
//1. Procesamiento
        valorRespuesta = valorPedido;
        //1.1 le envio un dato de parametro al Servidor    
        const traer = async () => {
            let persona = Notas.obtenerDatosDelFormularioCliente(); // obtengo OK, O tendria que lanzar Exception
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer",
                    {method: 'PUT', body: personaStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            // mostrar la respuesta del servidor
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
        //1.2 recibo respuesta del Servidor, tambien en algun dato de parametro
//2. OUTPUT    
        document.querySelector("#panelMsgContenido").innerHTML = valorRespuesta;
        console.log("[OK] actualizando, Programando el Cliente Javascript");
    }
    static borrar() {
        console.log("[..] BORRAR(), Programando el Cliente Javascript");
        let valorPedido = "";
        let valorRespuesta = "";
// INPUT
        valorPedido = document.querySelector("#nota_titulo").value;
//1. Procesamiento
        valorRespuesta = valorPedido;
        //1.1 le envio un dato de parametro al Servidor    
        const traer = async () => {
            let persona = Notas.obtenerDatosDelFormularioCliente(); // obtengo OK, O tendria que lanzar Exception
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer?&parametro=" + personaStringJSON,
                    {method: 'DELETE'});
            let datotexto = JSON.parse(await respuesta.text());
            // mostrar la respuesta del servidor            
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
        //1.2 recibo respuesta del Servidor, tambien en algun dato de parametro
//2. OUTPUT    
        document.querySelector("#panelMsgContenido").innerHTML = valorRespuesta;
        console.log("[OK] BORRAR(), Programando el Cliente Javascript");
    }
    static consultar() {
        console.log("[..] Consultar(), Programando el Cliente Javascript");
        let valorPedido = "";
        let valorRespuesta = "";
// INPUT
        valorPedido = document.querySelector("#nota_titulo").value;
//1. Procesamiento
        valorRespuesta = valorPedido;
        //1.1 le envio un dato de parametro al Servidor    
        const traer = async () => {
            let persona = Notas.obtenerDatosDelFormularioCliente(); // obtengo OK, O tendria que lanzar Exception
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer?&parametro=" + personaStringJSON,
                    {method: 'GET'});
            let textoPlantilla = document.querySelector('#plantillaComidas').innerHTML;
            let datotexto = JSON.parse(await respuesta.text());
            // mostrar la respuesta del servidor
            document.querySelector('#panelResultados').innerHTML = eval( textoPlantilla );
            /// Caso de Mostrar en Tabla debajo de la lista!! 20180824 -----
            let tablaPlantilla = document.querySelector('#plantillaComidasTabla').innerHTML;
            document.querySelector('#panelResultados').innerHTML += eval( tablaPlantilla );
            
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
        //1.2 recibo respuesta del Servidor, tambien en algun dato de parametro
//2. OUTPUT    
        document.querySelector("#panelMsgContenido").innerHTML = valorRespuesta;
        console.log("[OK] Consultar(), Programando el Cliente Javascript");
    }

    static obtenerDatosDelFormularioCliente() {
        let persona = {};
        persona.titulo = document.querySelector("#nota_titulo").value;
        persona.descripcion = document.querySelector("#nota_descripcion").value;
        persona.precio = document.querySelector("#nota_precio").value;
        // 1. mas adelante agregare mas campos y mejorare este metodo.
        // 2. tambien verificare fechas validas, campos vacios, campos obligatorios
        //   2.1. error en campos lanzo exepcion.
        // 3. limpio los campos visualtes
        document.querySelector("#nota_titulo").value = "";
        document.querySelector("#nota_descripcion").value = "";
        return persona;
    }
}





