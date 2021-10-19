/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

import excepciones.OperacionExcepciones;

/**
 *
 * @author milla
 */
public class artimetica {
    
    
    //lo declaramos dentro del metodo para llamar a la clase
    public static int division(int numerador, int denominador) throws OperacionExcepciones{

        //esto es para llamar 
    if(denominador ==0){
        throw new OperacionExcepciones("Division entre cero ");
    }
    
    return numerador / denominador;
    }
}
