class MientrasTanto {

    static agregarTemporal() {
        let encuentro = {};
        encuentro.nombre = document.querySelector("#tmp_nombre").value;
        encuentro.clave = document.querySelector("#tmp_clave").value;
        let encuentroStringJSON = JSON.stringify(encuentro);
        // guardar
        sessionStorage.setItem("usuario", encuentroStringJSON );
    }
    static verTemporal() {
        // recuperar
        let encuentroStringJSON = sessionStorage.getItem("usuario");
        //JSON.parse(encuentroStringJSON);
        document.querySelector('#panelMsgOKTemporal').innerHTML = encuentroStringJSON;
    }
    static agregarPermanente() {
        let encuentro = {};
        encuentro.nombre = document.querySelector("#prm_nombre").value;
        encuentro.clave = document.querySelector("#prm_clave").value;
        let encuentroStringJSON = JSON.stringify(encuentro);
        // guardar
        localStorage.setItem("usuario", encuentroStringJSON );
    }
    static verPermanente() {
        // recuperar
        let encuentroStringJSON = localStorage.getItem("usuario");
        //JSON.parse(encuentroStringJSON);
        document.querySelector('#panelMsgOKPermanente').innerHTML = encuentroStringJSON;
    }

}
