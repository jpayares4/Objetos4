/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.awt.Color;

/**
 *
 * @author Payares
 */
public class Password {
    private String Tamaño;
    private String contraseña;

    public Password(String Tamaño, String contraseña) {
        this.Tamaño = Tamaño;
        this.contraseña = contraseña;
    }

    public String getLongitud() {
        return Tamaño;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(String longitud) {
        this.Tamaño = longitud;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Password NivelDeSeguridad() {
        Password p;
        String longitud;
        String Contraseña;

        Tamaño = this.Tamaño;
        contraseña = this.contraseña;

        if (Integer.parseInt(Tamaño) >= 1 && Integer.parseInt(Tamaño) < 6) {
            Tamaño="La Contraseña No es segura ";
        }else if(Integer.parseInt(Tamaño) ==0){
            Tamaño="";
        }else{
            Tamaño="La Contraseña Es Segura";
        } 
        p = new Password(Tamaño, contraseña);
        return p;
    }
    
    public void CambioDeContraseña(String contraseña){
        this.contraseña=contraseña;
    }

    public Password SeguridadContraseñaColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
