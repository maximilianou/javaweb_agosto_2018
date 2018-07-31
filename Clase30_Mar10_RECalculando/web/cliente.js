// Programando una clase en Javascript
class Notas{
  // Programando un metodo de una clase en Javascript
  static subir(){

    console.log('[..] Hola, martes con frio en buenos aires!!!');

    document.querySelector("#panelMsgContenido").innerHTML
        += document.querySelector( "#nota_titulo" ).value;

    document.querySelector( "#nota_titulo" ).value = "";
    
/*    
    document.querySelector("#panelMsg").innerHTML
        += "Mensaje desde el Codigo, DATO!!";
*/
/*
    document.querySelector("section > h1").innerHTML
        += "Mensaje desde el Codigo, DATO!!";
*/
    
    
//    alert('Huy, Aca se detiene el Programa y puedo Verificar Variables y Valores');
    
    console.log('[OK] Hola, martes con frio en buenos aires!!!');

  }

  static limpiar(){
    document.querySelector("#panelMsgContenido").innerHTML = "";
  }
  
}





