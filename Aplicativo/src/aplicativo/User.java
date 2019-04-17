/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo;


/**
 *
 * @author Usuario
 */
public class User {
    String nombre;
    String clave;
    static boolean validador=true;
    public User(String nombre, String clave){
        this.nombre=nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void buttonAceptar(){
        Ventana.fillPassword.setEditable(false);
        Ventana.fillPassword.setEnabled(false);
        Ventana.fillUser.setEditable(false);
        Ventana.fillUser.setEnabled(false);
        Ventana.jButton1.setEnabled(false);
        validador=false;
        Ventana.campo.setText("<html>El usuario: "+nombre+" tiene la clave: "+clave+".<html>");
    }
    public void buttonModificar(){
        if(validador==false){
            Ventana.fillPassword.setEditable(true);
            Ventana.fillPassword.setEnabled(true);
            Ventana.fillUser.setEditable(true);
            Ventana.fillUser.setEnabled(true);
            Ventana.jButton2.setText("Guardar");
            validador=true;
        }else{
            this.nombre = Ventana.fillUser.getText();
            this.clave = Ventana.fillPassword.getText();
            Ventana.campo.setText("<html>El usuario tiene los siguientes datos actualizados<html>");
        }
    }
}
