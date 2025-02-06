/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal495.Figuras;

/**
 *
 * @author Leandro
 */
public class Cilindro extends FigurasGeometricas {
    
    private double radio;
    private double altura;
    
    public Cilindro(double radio,double altura) {
    this.radio= radio;
    this.altura= altura;
    this.setSuperficie(calcularSuperficie());
    this.setVolumen(calcularVolumen());
    
}
    public double calcularVolumen(){
        double volumen = Math.PI*altura * Math.pow(radio, 2);
        return volumen;
        
    }
    public double calcularSuperficie(){
        double areaLadoA=2*Math.PI*radio*altura;
        double areaLadoB=2*Math.PI*Math.pow(radio, 2);
        return areaLadoA + areaLadoB;
    }
    
}
