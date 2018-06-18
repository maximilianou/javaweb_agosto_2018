
class Util{
    static cargarListado(plantilla, datos, idresultado){
        let listado = datos;
        let vista = document.querySelector(plantilla).innerHTML;
        document.querySelector(idresultado).innerHTML = eval(vista);
    }
}

Util.cargarListado(
        '#plantillaListado', 
     [
         {"id": 1111, "nombre": "Ingles I", "precio": 5000},
         {"id": 3333, "nombre": "Ingles II", "precio": 5000},
         {"id": 8888, "nombre": "Ingles III", "precio": 15000}], 
   "#panelPromos" );
   
Util.cargarListado(
        '#plantillaListado', 
     [
      {"id": 99, "nombre": "Prog II", "precio": 25000},
      {"id": 11, "nombre": "Prog III", "precio": 5000},
      {"id": 22, "nombre": "Prog IV", "precio": 15000}
     ], 
   "#panelLocal" );
   
Util.cargarListado(
        '#plantillaListado', 
     [
      {"id": 111, "nombre": "Paradigma Funciona I", "precio": 5000},
      {"id": 444, "nombre": "Paradigma Objetos", "precio": 5000},
      {"id": 555, "nombre": "Paradigma RElacional", "precio": 15000}
     ], 
   "#panelRemoto" );



