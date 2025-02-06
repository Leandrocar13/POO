package Principal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Leandro
 */

public class Notas {
    double [] listaNotas;
    public Notas (){
      listaNotas = new double [5];
    }
    double calcularPromedio(){
        double suma =0;
        for (int i = 0; i < listaNotas.length;i++){
            suma = suma+listaNotas[i];
            
        }
        return (suma/5);
    }
     double calcularDesviacion(){
        double prom = calcularPromedio();
        double suma = 0;
        for (int i=0;i<listaNotas.length;i++){
            suma += Math.pow(listaNotas[i]-prom,2);

        }


        return Math.sqrt(suma/5);
    }
    double calcularmayor(){
        double mayor = listaNotas[0];
        for (int i=0;i<listaNotas.length;i++){
            if(listaNotas[i]> mayor){
                mayor= listaNotas[i];
            }
        }
        return mayor;
    }
        
        double calcularMenor(){
        double menor = listaNotas[0];
        for (int i=0;i<listaNotas.length;i++){
            if(listaNotas[i]< menor){
                menor= listaNotas[i];
            }
        }
        return menor;
    }
    
    
}
