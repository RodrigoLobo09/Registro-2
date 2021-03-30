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
public class EjerParcticaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        System.out.print ("Introduce un numero; ");
        n1= Entrada.entero();
      
       if(n1%2==0)
           System.out.print ("tu numero es par ");
       else
           System.out.print ("tu numero es impar");
    
    }
    
}
