/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto10;


public class Pago {
    
        double pat;
        double es;
        double pagmat=50000;
        
        Pago (double pat, double es, double pagmat) {
            this.pat=pat;
            this.es =es;
            this.pagmat=pagmat;
            
        }
        double valor_a_pagar(){
            
            if ((pat > 2000000) && (es>3)){
                pagmat =pagmat + 0.03 * pat;
                
            }
            return pagmat;
            
            
        }
     public double ObtenerInscripcion (double inscripcion ){
        return inscripcion; 
     }
     public String ObtenerNombre(String nombre){
        return nombre;
        
    }
     
      public static String LimpiarCampo (){
        return "";
      }
      
    
}
