
package enumeraciones;

/**
 *
 * @author milla
 */
public enum DiasSemana {
    
    //al ser constantes, debemos ponerle en mayusculas 
    LUNES (true),//aqui ya esta hecho el enum 
    MARTES (true) ,
    MIERCOLES (true),
    JUEVES (true),
    VIERNES (true),
    SABADO (false),
    DOMINGO (false);
    
    
    
    
    private boolean laborable;
    
    //los constructors tienen que ser privados no
    //pueden ser publicos
    private DiasSemana (boolean laborable){
        this.laborable= laborable;
    }
}
