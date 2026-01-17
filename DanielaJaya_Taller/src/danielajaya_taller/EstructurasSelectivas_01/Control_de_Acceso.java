
package danielajaya_taller.EstructurasSelectivas_01;

import java.util.Scanner;

/**
 *
 * @author MALEX
 */
public class Control_de_Acceso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();
        if (edad <= 0) {
            System.out.println("Edad invalida");
        }
        if (edad >= 18) {
            System.out.println("Acceso permitido");
        }
    }
}

/*
run:
Ingrese la edad: 18
Acceso permitido
*/
