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
public class Eje1InterfaceMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Ejer1TestInter testinter = new Ejer1TestInter();
     System.out.println("La nota del la primera prueba es de :"+testinter.nota1(80));
     System.out.println("La nota del la segunda prueba es de : " + testinter.nota2(92));
     System.out.println("La nota del la tercera prueba es de : "+ testinter.nota3(100));
     System.out.println("El promedio de tus notas es de :" + testinter.promedio_notas(80, 92,100));
    }
    
}
