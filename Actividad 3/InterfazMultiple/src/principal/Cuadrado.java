/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Leandro
 */
public class Cuadrado {
    
    
   double lado ;
   
   
   Cuadrado(double lado){
       
       this.lado=lado;
       
       
   }
   
   
   double calcularArea(){
       return lado * lado;
       
   }
   
   double calcularPerimetro(){
       return (4*lado);
       
   }
    public static String Limpiar(){
        return "";
    
    }
}
