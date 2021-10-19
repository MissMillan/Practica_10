package enumeraciones;

import java.util.Scanner;

/**
 *
 * @author milla
 */
public class Enumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana : ");
        String dia = sn.next();

        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());

        switch (diaS) {
            case LUNES:
                System.out.println("El dia " + diaS.name() + " es laborable ");
                break;

            case MARTES:

                System.out.println("El dia " + diaS.name() + " es laborable ");
                break;

            case MIERCOLES:
                System.out.println("El dia " + diaS.name() + " es laborable ");
                break;

            case JUEVES:
                System.out.println("El dia " + diaS.name() + " es laborable ");
                break;

            case VIERNES:
                System.out.println("El dia " + diaS.name() + " es laborable ");
                break;

            case SABADO:
                System.out.println("El dia " + diaS + " no es laborable ");
                break;

            case DOMINGO:

                System.out.println("El dia " + diaS + " no es laborable ");
                break;

            default:
                System.out.println("El dia es incorrecto");

        }
        
        
        //---------------------------------------------
        System.out.println("Los continentes son : "+ Continentes.AMERICA);
    }

}
