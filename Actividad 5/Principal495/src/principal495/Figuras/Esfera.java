/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal495.Figuras;

/**
 *
 * @author Leandro
 */
public class Esfera extends FigurasGeometricas {
    
    private double radio;
    
    public Esfera(double radio){
        this.radio=radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
                
    }
    public double calcularVolumen(){
        double volumen = 1.33 * Math.PI*Math.pow(this.radio,3);
        return volumen;
        
    }
    public double calcularSuperficie (){
        double superficie = 4 + Math.PI*Math.pow(this.radio,2);
        return superficie;
        
    }
    
}
