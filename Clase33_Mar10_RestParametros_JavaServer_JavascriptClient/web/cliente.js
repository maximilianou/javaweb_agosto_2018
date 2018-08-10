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
            let persona = {};
            persona.titulo = document.querySelector("#nota_titulo").value;
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer",
                    {method: 'POST', body: personaStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            // limpio los campos visualtes
            document.querySelector("#nota_titulo").value = "";
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
            let persona = {};
            persona.titulo = document.querySelector("#nota_titulo").value;
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer",
                    {method: 'PUT', body: personaStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            // limpio los campos visualtes
            document.querySelector("#nota_titulo").value = "";
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
            let persona = {};
            persona.titulo = document.querySelector("#nota_titulo").value;
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer?&parametro=" + personaStringJSON,
                    {method: 'DELETE'});
            let datotexto = JSON.parse(await respuesta.text());
            // limpio los campos visualtes
            document.querySelector("#nota_titulo").value = "";
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
            let persona = {};
            persona.titulo = document.querySelector("#nota_titulo").value;
            let personaStringJSON = JSON.stringify(persona);
            let respuesta = await fetch("NotaServer?&parametro=" + personaStringJSON,
                    {method: 'GET'});
            let datotexto = JSON.parse(await respuesta.text());
            // limpio los campos visualtes
            document.querySelector("#nota_titulo").value = "";
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
        console.log("[OK] Consultar(), Programando el Cliente Javascript");
    }

}





