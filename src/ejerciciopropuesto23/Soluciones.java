/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto23;

/**
 *
 * @author Leandro
 */
public class Soluciones {
    double A,B,C;
   public static double CalcularEcuacion1(double A,double B,double C){
   
     return ((-1)*B + (Math.sqrt(Math.pow(B, 2)-4*A*C )))/(2*A);
    }
    public static double CalcularEcuacion2(double A,double B,double C){
   
     return ((-1)*B - (Math.sqrt(Math.pow(B, 2)-4*A*C )))/(2*A);
    }
}
