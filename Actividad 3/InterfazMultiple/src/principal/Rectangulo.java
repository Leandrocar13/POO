/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Leandro
 */
public class Rectangulo {
    double base;
    double altura;
    
    Rectangulo(double base, double altura){
        this.altura=altura;
        this.base = base;
        
    }
    
    
    double calcularArea (){
        
        return base*altura;
        
    }
    
    double calcularPerimetro(){
        
        return (2*base)+(2*altura);
        
    }
     public static String Limpiar(){
        return "";
    
    }
}

