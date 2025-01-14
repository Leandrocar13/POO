/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Leandro
 */
public class Empleado {
    public static double CalcularSalarioMensual(double SBPH,double NHT){
        double SalarioMensual;
        
        SalarioMensual= SBPH*NHT;
            if (SalarioMensual > 450000){
                return SalarioMensual;
            }
            else {
                return 0;
            }
    }
    public static String set_Nombre (String nombre){
        return nombre;
    }
    
}
