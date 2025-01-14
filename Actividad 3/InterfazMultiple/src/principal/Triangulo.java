/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Leandro
 */
public class Triangulo {
    double base;
    double altura;
    String Tipo;
    
    
    
    
    public Triangulo (double base, double altura){
        this.base=base;
        this.altura= altura;
        
        
        
    }
        
    
    double calcularArea(){
        return (base*altura)/2;
        
        
    }
    
    double calcularPerimetro(){
        return (base + altura + calcularHipotenusa());
        
        
    }
    double calcularHipotenusa(){
        return Math.pow(base*base + altura*altura,0.5);
        
    }
   String determinarTipoTriangulo(){
       if((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa()))
           return "Es un triangulo rectangualo";
       else if  ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
           return "Es un triangulo escaleno";
       else 
           return "Es un triangulo isoceles";
   
         }
    public static String Limpiar(){
        return "";
    
    }
}
