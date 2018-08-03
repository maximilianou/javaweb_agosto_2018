// Programando una clase en Javascript
class Notas{
  // Programando un metodo de una clase en Javascript
  static subir(){

    console.log('[..] Hola, martes con frio en buenos aires!!!');

    let valorPedido = "";
    let valorRespuesta = "";
// INPUT
    valorPedido = document.querySelector( "#nota_titulo" ).value;

    document.querySelector( "#nota_titulo" ).value = "";

//1. Procesamiento
    valorRespuesta = valorPedido;
   //1.1 le envio un dato de parametro al Servidor    
   
   //1.2 recibo respuesta del Servidor, tambien en algun dato de parametro
   
//2. OUTPUT    
    document.querySelector("#panelMsgContenido").innerHTML = valorRespuesta;
    
    console.log('[OK] Hola, martes con frio en buenos aires!!!');

  }

  static limpiar(){
    document.querySelector("#panelMsgContenido").innerHTML = "";
  }
  
}





