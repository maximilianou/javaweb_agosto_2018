


class Distribuidora {

  static ofertar(){
    console.log('[..] Programando en Javascript en Buenos Aires');
   
//    document.querySelector("#panelMsg").innerHTML += "Algo! ";

    document.querySelector("#panelMsg").innerHTML 
      += document.querySelector("#golosina_titulo").value
      + document.querySelector("#golosina_descripcion").value;

    document.querySelector("#golosina_titulo").value = "";
    document.querySelector("#golosina_descripcion").value = "";
//    alert(12345678);
    
    console.log('[OK] Programando en Javascript en Buenos Aires');
  }
  
}




