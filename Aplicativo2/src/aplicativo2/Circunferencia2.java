/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo2;

/**
 *
 * @author Usuario
 */
public class Circunferencia2 {
    double radio;
    static int validador1 = 1;
    public Circunferencia2(double radio){
        this.radio=radio;
    }
    public Circunferencia2(){
        this.radio=5;
    }
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public void calcularArea(){
        Ventana2.rsultado.setText("<html>El Area es: "+Math.PI*radio*radio+"<html>");
    }
    public void calcularPerimetro(){
        Ventana2.rsultado.setText("<html>El perimetro es: "+Math.PI*2*radio+"<html>");
    }
}
