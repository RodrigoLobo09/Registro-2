/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author Lenovo
 */
public class EjerPracticaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n1;
        System.out.println("Adivina el numero del 1 - 5 : ");
        n1=Entrada.entero();
        while (n1!=4)
        {
             System.out.print("El numero: "+n1);
              System.out.print( "  no era el correcto");
               System.out.println("  sigue intentando elege otro numero: ");
             n1=Entrada.entero();
        }
            System.out.println("has adivinado el numero"); 
    }
    
}
