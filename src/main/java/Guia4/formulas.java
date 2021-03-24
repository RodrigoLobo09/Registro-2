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
public class formulas extends OperacionesEje1{
  
    @Override
public int areacuadrado (int a, int b){
    return a * b;
}
        @Override
public int perimetrocuadrado (int a, int b, int c, int d){
    return a + b + c + d;
}
        @Override
public int areatriangulo (int a, int b){
    return (a * b)/2;
}
        @Override
public int perimetrotringulo (int a, int b, int c){
    return a + b + c;
}
}