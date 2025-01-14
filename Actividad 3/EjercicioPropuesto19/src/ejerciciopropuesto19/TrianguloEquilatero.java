/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto19;

/**
 *
 * @author Leandro
 */
public class TrianguloEquilatero {
    int lado; //Atributo que define el lado del triangulo
    TrianguloEquilatero(int lado) {
        this.lado= lado;
    }
    double calcularArea(){
        return (Math.pow(lado,2)*(Math.sqrt(3)))/4;
        
    }
    double hipo(){
        return ((lado*Math.sqrt(3)))/2;
        
    }
    double perimetro(){
        return ((lado*3));
    }
}
