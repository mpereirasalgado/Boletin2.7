
package boletin2.pkg7;

import java.util.Scanner;

/**@author Micael*/
public class Boletin27 
{
    public static void main(String[] args) 
    {
        float n, i, t;
        System.out.println("Calculo de renta mensual\nIntroducir datos:\n\t-Nomina:");
        Scanner dato = new Scanner(System.in);
        n=dato.nextFloat();
        System.out.println("\t-Interes anual en % :");
        i=dato.nextFloat();
        System.out.println("Introducir numero de años por el que se concede el prestamo:");
        t=dato.nextFloat();
        System.out.println("Renta mensual de "+((n*(i/100)*t)/1200));
    }
    
}
