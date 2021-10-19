/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author milla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List <String> miLista = new ArrayList<>();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        

        for (Object elem: miLista){
            
            System.out.println(elem);
        }
        
        //-------------------------------------------------
        miLista.forEach(elem -> {
            System.out.println("exp = " + elem);
                    });
        
        
         //-------------------------------------------------
        
        Map <String,String> miMap = new HashMap();
        //vamos a meter un valor en un map
        miMap.put("valo1", "Yesenia");
        miMap.put("valo2", "Laura");
        miMap.put("valo3", "Carla");
        miMap.put("valo4", "Carla");
        //ahora voy a leer los valores de los elementos que meti
        //he hecho el casteo
        String nombre =(String)miMap.get("valor4");
        System.out.println(nombre);
        
                imprimir(miMap.keySet());
                System.out.println("");
                imprimir(miMap.values());
        
    }
    //vamos a declararnos un metodo estatico 
    public static void imprimir(Collection coleccion){
        
         coleccion.forEach(elem -> {
            System.out.println("exp = " + elem);
                    });
    }
    
}
