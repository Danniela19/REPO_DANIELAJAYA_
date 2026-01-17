
package danielajaya_taller.Estructuras_Repetitivas;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class WhileBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contraCorrecta = "utpl";
        String contraIngresada = "";
        int intentos = 0;

        while (!contraIngresada.equals(contraCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            contraIngresada = sc.nextLine();
            intentos++;
        }
        System.out.println("Acceso concedido en " + intentos + " intento(s).");
    }
}
/**
 * run:
Ingrese la contrase�a: abc
Ingrese la contrase�a: hoy
Ingrese la contrase�a: si
Ingrese la contrase�a: ok
Ingrese la contrase�a: utpl
Acceso concedido en 5 intento(s).
 */