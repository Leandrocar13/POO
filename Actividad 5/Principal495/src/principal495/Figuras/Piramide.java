/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal495.Figuras;

/**
 *
 * @author Leandro
 */
public class Piramide extends FigurasGeometricas {
    
    private double base;
    private double altura;
    private double apotema;
    
    
    public Piramide (double base, double altura, double apotema){
        this.base=base;
        this.altura=altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
        
    }
    public double calcularVolumen(){
        double volumen =(Math.pow(base,2)*altura)/3;
        return volumen;
    }
    public double calcularSuperficie(){
        double areaBase=Math.pow(base,2);
        double areaLado = 2*base*apotema;
        return areaBase + areaLado;
    }
    
}
