/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo2;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Circunferencia {
    double radio;
    static int validador1 = 1;
    public Circunferencia(double radio){
        this.radio=radio;
    }
    public Circunferencia(){
        this.radio=5;
    }
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void CalcularArea(){
        if(validador1==1){
            Ventana.jButton1.setText("Modificar");
            Ventana.jToggleButton1.setEnabled(false);
            JOptionPane.showMessageDialog(null, "El área es: "+Math.PI*Math.pow(radio, 2)+"");
            Ventana.campo.setEnabled(false);
            validador1++;
        }else if(validador1%2==0){
            validador1++;
            Ventana.limpiar.setEnabled(true);
            Ventana.campo.setEnabled(true);
            Ventana.jButton1.setText("Guardar");
        }else if(validador1%3==0){
            this.radio = Double.parseDouble(Ventana.campo.getText());
            JOptionPane.showMessageDialog(null, "El área es: "+Math.PI*Math.pow(radio, 2)+"");
            validador1=1;
            Ventana.jButton1.setText("Area");
            Ventana.jToggleButton1.setEnabled(true);
        }
        
    }
    
    public void CalcularPerimetro(){
        /**JOptionPane.showMessageDialog(null, "La circunferencia es: "+Math.PI*2*radio+"");
        Ventana.limpiar.setEnabled(true);**/
        if(validador1==1){
            Ventana.jToggleButton1.setText("Modificar");
            Ventana.jButton1.setEnabled(false);
            JOptionPane.showMessageDialog(null, "La circunferencia es: "+Math.PI*2*radio+"");
            Ventana.campo.setEnabled(false);
            validador1++;
        }else if(validador1%2==0){
            validador1++;
            Ventana.limpiar.setEnabled(true);
            Ventana.campo.setEnabled(true);
            Ventana.jToggleButton1.setText("Guardar");
        }else if(validador1%3==0){
            this.radio = Double.parseDouble(Ventana.campo.getText());
            JOptionPane.showMessageDialog(null, "La circunferencia es: "+Math.PI*2*radio+"");
            validador1=1;
            Ventana.jToggleButton1.setText("Perimetro");
            Ventana.jButton1.setEnabled(true);
        }
    }
    
    public void accionLimpiar(){
        Ventana.campo.setText("");
        Ventana.campo.requestFocus();
    }
}
