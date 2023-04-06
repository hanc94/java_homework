package com.cmc.directorio.entidades;

public class AdminTelefono {

    public void activarMensajeria(Telefono tel){

        if(tel.getOperadora() == "movi"){
            tel.setTieneWhatsapp(true);
        }

    }
    public int contarMovi(Telefono [] tel){
        int nMovi=0;
        for(int i=0;i<tel.length;i++){
            if(tel[i].getOperadora() == "movi"){
                nMovi = nMovi +1;
            }
        }
        return nMovi;
    }
    public int contarClaro(Telefono [] tel){
        int nClaro=0;
        for(int i=0;i<tel.length;i++){
            if(tel[i].getOperadora() == "claro"){
                nClaro = nClaro +1;
            }
        }
        return nClaro;
    }
}
