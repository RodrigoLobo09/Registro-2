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
public class EjeClassVeterinaria {
    
  public static final String veterinario = "Dr. Rendon"; 
  private int age ;
  private String animal;
  private String consult;
  private String nomMascota;
  
  public static String monMascota(){
    return "Moncho";
}
   public static String tipoAnimal(){
    return "perro";
}  
   public static int edadMascota(){
    return 7;
}
   public static String motivoConsul(){
    return "trago un hueso";
} 
   public String getnomMascota(){
    return nomMascota;
}
public void setnomMascota (String nomMascota){
    this.nomMascota= nomMascota;
}
  public String getAnimal(){
    return animal;
}
public void setAnimal (String animal){
    this.animal= animal;
}
public int getAge(){
    return age;
}
public void setAge (int age){
    this.age= age;
}

  public String getConsult(){
    return consult;
}
public void setConsult (String consult){
    this.consult= consult;
}
}
