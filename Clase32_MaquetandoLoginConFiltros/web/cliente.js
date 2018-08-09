class Registro {
    
    static agregar(){
        console.log("[..] Registro agregar()");
        
        // tomar usuario y password del panel de registro
        // mandarselo al server, envio al servidor
        // recibir del server el OK, avisar
        // recibir del server el ERROR, avisar

        const traer = async() => {
            let registro = {};
            registro.nombre = document.querySelector("#reg_nombre").value;
            registro.clave = document.querySelector("#reg_clave").value;
            let registroStringJSON = JSON.stringify(registro);
            let respuesta = await fetch("RegistroServer",
                    {method: 'POST', body: registroStringJSON,
             /*credentials: 'include'  */
              credentials: 'same-origin' 
            });
            //let datotexto = JSON.parse(await respuesta.text());
            let datotexto = await respuesta.text();
            document.querySelector('#panelMsgOK').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMsgERROR").innerHTML = 'ERROR: ' + ex.message;
                });
        
        
        console.log("[OK] Registro agregar()");
    }
}

class Encuentro { 
    
    static ingresar(){
        console.log("[..] Encuentro ingresar()");
        
        // tomar iusuar oy pass del panel de lgin
        // enviarlos al que ingrese en session el usuairo
        // luego avisar que el flaco/a esta logueada/o/s
        

                const traer = async() => {
            let encuentro = {};
            encuentro.nombre = document.querySelector("#login_nombre").value;
            encuentro.clave = document.querySelector("#login_clave").value;
            let encuentroStringJSON = JSON.stringify(encuentro);
            let respuesta = await fetch("EncuentroServer",
                    {method: 'POST', body: encuentroStringJSON,
              /*credentials: 'include'  */
              credentials: 'same-origin'                   
            });
            //let datotexto = JSON.parse(await respuesta.text());
            let datotexto = await respuesta.text();
            document.querySelector('#panelMsgOKLogin').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMsgERROR").innerHTML = 'ERROR: ' + ex.message;
                });

        
        console.log("[OK] Encuentro ingresar()");
    }
    static irA( urlDondeIr ){

                const traer = async() => {
            let encuentro = {};
            encuentro.nombre = document.querySelector("#login_nombre").value;
            encuentro.clave = document.querySelector("#login_clave").value;
            let encuentroStringJSON = JSON.stringify(encuentro);
            let respuesta = await fetch( urlDondeIr, 
            {method: 'GET',
             /*credentials: 'include'  */
              credentials: 'same-origin' 
            });            
            let datotexto = await respuesta.text();
            document.querySelector('#panelMsgOKAcceso').innerHTML = datotexto;
        };
        traer()
                .catch(ex => {
                    document.querySelector("#panelMsgERROR").innerHTML = 'ERROR: ' + ex.message;
                });
        
        
    }
    
}

