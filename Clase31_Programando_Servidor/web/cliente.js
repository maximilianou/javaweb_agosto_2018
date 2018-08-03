class Distribuidora {

    static ofertar() {
        console.log('[..] Programando en Javascript en Buenos Aires');

        let valorRespuesta = "";
        let valorPedido = "";

// 1. INPUT
        valorPedido = document.querySelector("#golosina_titulo").value
                + document.querySelector("#golosina_descripcion").value;

// 2. PROCESAMIENTO

        valorRespuesta = " -- " + valorPedido + " -- ";
        const traer = async () => {
            let golosina = {};
            golosina.titulo = document.querySelector("#golosina_titulo").value;
            golosina.descripcion = document.querySelector("#golosina_descripcion").value;
            let golosinaStringJSON = JSON.stringify( golosina );
            let respuesta = await fetch("GolosinaServer",
                    {method: 'POST', body: golosinaStringJSON});
            let datotexto = JSON.parse(await respuesta.text());
            document.querySelector('#panelResultados').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMensajes").innerHTML = 'ERROR: ' + ex.message;
                });




// 3. OUTPUT
        document.querySelector("#panelMsg").innerHTML = valorRespuesta;


        // Limpieza del Formulario
        document.querySelector("#golosina_titulo").value = "";
        document.querySelector("#golosina_descripcion").value = "";

        console.log('[OK] Programando en Javascript en Buenos Aires');
    }

}



