
package EstructurasSelectivas;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class IfSimple_ControlAcceso {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese la edad: ");
        edad = tcl.nextInt();
        if (edad >= 18) {
            System.out.println("Acceso permitido");
        }
        if (edad <= 0) {
            System.out.println("Edad invalida");
        }
    }
}

/*
run:
Ingrese la edad: 18
Acceso permitido
*/
