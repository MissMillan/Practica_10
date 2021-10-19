
package enumeraciones;

/**
 *
 * @author milla
 */
public enum Continentes {
    
    AFRICA(56, 7),
    EUROPA(32,8),
    ASIA(44,2),
    AMERICA(22,33),
    OCEANIA(12,55);
    //si no tengo nada mas como en dias 
    //declaro las variables que necesito
    private final int numPaises;
    private int habitantes;
    //para los enumerados necesitamos el constructor
    private Continentes(int numPaises, int habitantes) {
        this.numPaises = numPaises;
    }

    public int getNumPaises() {
        return numPaises;
    }
    
    
}
