
/* If you're feeling fancy you can add interactivity 
    to your site with Javascript */

// prints "hi" in the browser's dev tools console


class Reposteria {
  
  static publicar(){
    console.log('[..] Buenos Aires Programando Online!!');
    
    //alert(12345678);
    
//    document.querySelector('#panelMensaje').innerHTML += "Algo! ";
//    document.querySelector('section > h3').innerHTML = "Algo! ";
    //alert( document.querySelector('#panelMensaje')    );
    //alert( document.querySelector('#producto_tit') );
    
    document.querySelector('#panelMensaje').innerHTML 
      += document.querySelector('#producto_titulo').value
      + document.querySelector('#producto_descripcion').value;
    
    
    console.log('[OK] Buenos Aires Programando Online!!');
  }
  
}




