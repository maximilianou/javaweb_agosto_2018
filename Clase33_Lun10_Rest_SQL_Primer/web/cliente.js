class Reposteria {

    static publicar() {
        console.log('[..] Buenos Aires Programando Online!!');
        // INPUT, obtener las variables
        // 1. Enviar los parametros de INPUT al Servidro
        //   convetirlo a un formato que lo entienda el servidor y cliente
        //   Formatod e la comunicacion Client/Server es en JSON 
        const traer = async() => {
            let producto = {}; // defino un Ojbeto para tomar lso parametros
            producto.titulo = document.querySelector('#producto_titulo').value;
            producto.descripcion = document.querySelector('#producto_descripcion').value;

            let productoStringJSON = JSON.stringify(producto);
            alert("ENVIA EL CLIENTE: " + productoStringJSON);
            let respuesta = await fetch("MesaDulce",
                    {method: 'POST', body: productoStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            alert("ENVIA EL SERVER: " + datotexto);

        // OUTPUT, mostrarlas visualmante DATO LOCAL
        document.querySelector('#panelMensaje').innerHTML
                += producto.titulo + ", " + producto.descripcion;

        // OUTPUT, mostrarlas visualmante DATO del SERVIDOR
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
        // 2. Respuesta (cambiada) del Servidor mostrarla en pantalla
        //   vendra en el formato que entienda el servidor y cliente
        //   Formatod e la comunicacion Client/Server es en JSON 
        console.log('[OK] Buenos Aires Programando Online!!');
    }
    
    
    static actualizar(){
        console.log('[..] Buenos Aires Programando Online!! ACTUALZIAR');
        
        const traer = async() => {
            let producto = {}; // defino un Ojbeto para tomar lso parametros
            producto.titulo = document.querySelector('#producto_titulo').value;
            producto.descripcion = document.querySelector('#producto_descripcion').value;

            let productoStringJSON = JSON.stringify(producto);
            alert("ENVIA EL CLIENTE: " + productoStringJSON);
            let respuesta = await fetch("MesaDulce",
                    {method: 'PUT', body: productoStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            alert("ENVIA EL SERVER: " + datotexto);

        // OUTPUT, mostrarlas visualmante DATO LOCAL
        document.querySelector('#panelMensaje').innerHTML
                += producto.titulo + ", " + producto.descripcion;

        // OUTPUT, mostrarlas visualmante DATO del SERVIDOR
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
        
        
        console.log('[OK] Buenos Aires Programando Online!! ACTUALZIAR');
    }

    static borrar(){
        console.log('[..] Buenos Aires Programando Online!! BORRAR');

        const traer = async() => {
            let producto = {}; // defino un Ojbeto para tomar lso parametros
            producto.titulo = document.querySelector('#producto_titulo').value;
            producto.descripcion = document.querySelector('#producto_descripcion').value;

            let productoStringJSON = JSON.stringify(producto);
            alert("ENVIA EL CLIENTE: " + productoStringJSON);
            let respuesta = await fetch("MesaDulce?&" + productoStringJSON,
                    {method: 'DELETE'});
            let datotexto = JSON.parse(await respuesta.text());
            alert("ENVIA EL SERVER: " + datotexto);

        // OUTPUT, mostrarlas visualmante DATO LOCAL
        document.querySelector('#panelMensaje').innerHTML
                += producto.titulo + ", " + producto.descripcion;

        // OUTPUT, mostrarlas visualmante DATO del SERVIDOR
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
        
        
        console.log('[OK] Buenos Aires Programando Online!! BORRAR');
    }
    static consultar(){
        console.log('[..] Buenos Aires Programando Online!! CONSULTAR');
        const traer = async() => {
            let producto = {}; // defino un Ojbeto para tomar lso parametros
            producto.titulo = document.querySelector('#producto_titulo').value;
            producto.descripcion = document.querySelector('#producto_descripcion').value;

            let productoStringJSON = JSON.stringify(producto);
            alert("ENVIA EL CLIENTE: " + productoStringJSON);
            let respuesta = await fetch("MesaDulce?&" + productoStringJSON,
                    {method: 'GET'});
            let datotexto = JSON.parse(await respuesta.text());
            alert("ENVIA EL SERVER: " + datotexto);

        // OUTPUT, mostrarlas visualmante DATO LOCAL
        document.querySelector('#panelMensaje').innerHTML
                += producto.titulo + ", " + producto.descripcion;

        // OUTPUT, mostrarlas visualmante DATO del SERVIDOR
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });
      
        console.log('[OK] Buenos Aires Programando Online!! CONSULTAR');
    }

}






