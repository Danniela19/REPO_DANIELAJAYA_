
package EstructurassRepetitivas;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class While_ValidacionContrasenia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraCorrecta = "utpl";
        String contraIngresada = "";
        int intentos = 0;

        while (!contraIngresada.equals(contraCorrecta)) {
            System.out.print("Ingrese la contrasenia: ");
            contraIngresada = sc.nextLine();
            intentos++;
        }
        System.out.println("Acceso concedido en " + intentos + " intento(s)");
    }
}

/*
run:
Ingrese la contrasenia: abc
Ingrese la contrasenia: 123
Ingrese la contrasenia: utpl
Acceso concedido en 3 intento(s)
*/