/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto18;

public class Nomina {
    double nhtm;
    double vht;
    double retencion;
    
    Nomina(double nhtm, double vht, double retencion){
        this.nhtm = nhtm;
        this.retencion=retencion;
        this.vht=vht;
        
    }
    
    
    
    double calcularSalrioBruto(){
        return nhtm*vht;
    }
    double calcularSalrioNeto(){
        return (nhtm*vht)*(1-(retencion/100));
    }
}
