/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author Lenovo
 */
public class MainClassVet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   System.out.println("El veterinario de turno es : "+EjeClassVeterinaria.veterinario);
   
   
   
     System.out.println("El nombre de la mascota es: "+EjeClassVeterinaria.monMascota());
     System.out.println("El tipo de animal es : "+EjeClassVeterinaria.tipoAnimal());
     System.out.println("La edad de la mascota es de : "+EjeClassVeterinaria.edadMascota());
     System.out.println("El motivo de la consulta es : "+EjeClassVeterinaria.motivoConsul());
     
     
     EjeClassVeterinaria gato = new    EjeClassVeterinaria();
       gato.setnomMascota("Agata");
       System.out.println("El nombre de la mascota es : "+gato.getnomMascota());
       gato.setAnimal("gato");
       System.out.println("El tipo de animal es : "+gato.getAnimal());
       gato.setAge(6);
       System.out.println("La edad es de : "+gato.getAge());
       gato.setConsult("no quiere comer");
       System.out.println("El motivo de la consulta : "+gato.getConsult());
       
          if (gato instanceof EjeClassVeterinaria){
               System.out.println("En efecto gato es una intancia de EjeClassVeterinaria");
        }else{
             System.out.println("El gato  no es una intancia de EjeClassVeterinaria");
        }
    }
 
}
