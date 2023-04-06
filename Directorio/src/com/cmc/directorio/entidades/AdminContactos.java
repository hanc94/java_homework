package com.cmc.directorio.entidades;

public class AdminContactos {

    public Contacto buscarMasPesado(Contacto c1,Contacto c2){
        if(c1.getPeso()> c2.getPeso()){
            return c1;
        }else{
            return c2;
        }
    }
    public boolean compararOperadoras(Contacto c1,Contacto c2){
        return c1.getTelefono().getOperadora() == c2.getTelefono().getOperadora();
    }
    public void activarUsuario(Contacto c){
        if(c.getTelefono().isTieneWhatsapp()){
            c.setActivo(true);
        }
    }
}
