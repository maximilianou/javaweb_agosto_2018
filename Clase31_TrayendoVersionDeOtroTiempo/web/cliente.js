class Reposteria {
  
  static publicar(){
    console.log('[..] Buenos Aires Programando Online!!');

    /*
    var variableViejaForma =  [ 44 , 88 ];// VIEJO
    let variableLocal = "2";
    let objetoJSON = { "nombre": "Roberto" }; // new Object();
    const variableConstanteNoDebesCambiarElCopntenido = objetoJSON;
    //variableConstanteNoDebesCambiarElCopntenido = []; // MAL
    variableConstanteNoDebesCambiarElCopntenido.nombre = "Mario";
    objetoJSON = { "precio": 55000 } ;
    */    


    // INPUT, obtener las variables
    let producto = {}; // defino un Ojbeto para tomar lso parametros
    producto.titulo = document.querySelector('#producto_titulo').value;
    producto.descripcion = document.querySelector('#producto_descripcion').value;
    
    // 1. Enviar los parametros de INPUT al Servidro
    //   convetirlo a un formato que lo entienda el servidor y cliente
    //   Formatod e la comunicacion Client/Server es en JSON 
      
      
    // 2. Respuesta (cambiada) del Servidor mostrarla en pantalla
    //   vendra en el formato que entienda el servidor y cliente
    //   Formatod e la comunicacion Client/Server es en JSON 

        
    // OUTPUT, mostrarlas visualmante
    document.querySelector('#panelMensaje').innerHTML 
            += producto.titulo + ", " + producto.descripcion;
    
    
    console.log('[OK] Buenos Aires Programando Online!!');
  }
  
}




