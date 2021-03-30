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
public class EjerPracticaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
System.out.println ("  _______   _______    _______");
System.out.println (" |       | |       |  |       |");
System.out.println (" |   1   | |   2   |  |   3   |");
System.out.println (" |---0---| |---0---|  |---0---|");
System.out.println (" |_______| |_______|  |_______|");

 int poke;
        System.out.print("Introduce el numero de pokebola que quieres elegir:");
        poke=Entrada.entero();
        switch(poke){
            case 1:
                 System.out.println(" Has elegido la pokebola con Bulbasaur");
            break;
             case 2:
                 System.out.println("Has elegido la pokebola con Charmander");
            break;
             case 3:
                 System.out.println("Has elegido la pokebola con Squirtle");
            break;
             default:
                System.out.print("ERROR");
         break;
                
        }
    }
    
}
