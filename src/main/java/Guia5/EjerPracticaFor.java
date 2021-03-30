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
public class EjerPracticaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for (int i=10;i>=0;i-=1)
         if(i%2==0)
           System.out.println (i+" par ");
       else
           System.out.println (i+" impar");
    }
    
}
