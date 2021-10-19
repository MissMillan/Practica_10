/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;
import static aritmetica.artimetica.division;
/**
 *
 * @author milla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        
        int res = 0;
        
      //por que no se puede dividir un numero entre 0
    
     try   {
           res = division(10,0);
     }catch(Exception e){//estoy manejando la exception , en caso de que me de el errro
         e.printStackTrace(System.out);
     }finally{
         //da igual si tengo excepcion o no, siempre se va a ejecutar
         System.out.println("Siempre estoy");
     }
    
    }
    
}
