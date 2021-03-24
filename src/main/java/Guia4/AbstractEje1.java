/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

/**
 *
 * @author Lenovo
 */
public class AbstractEje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         formulas prueba = new formulas();
     System.out.println("El area del rectangulo es : "+prueba.areacuadrado(5, 8));
     System.out.println("La perimetro del rectangulo es : "+prueba.perimetrocuadrado(8,8,5,5));
     System.out.println("La area del triangulo es : "+prueba.areatriangulo(6, 3));
     System.out.println("La perimetro del triangulo es : "+prueba.perimetrotringulo(5 , 4 , 3));
    }
    
}
