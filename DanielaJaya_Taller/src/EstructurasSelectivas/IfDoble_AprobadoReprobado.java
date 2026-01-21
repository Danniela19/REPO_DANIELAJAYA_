package EstructurasSelectivas;

import java.util.Scanner;

/**
 * Problema: Ingrese una nota final (0–100).
Si la nota es >= 70, muestre Aprobado; caso contrario, Reprobado.
 * @author Daniela
 */
public class IfDoble_AprobadoReprobado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota;
        System.out.print("Ingrese la nota final (0-100): ");
        nota = tcl.nextInt();
        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida");
        } else {
            if (nota >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}

/*
run:
Ingrese la nota final (0-100): 85
Aprobado
*/

/*
run:
Ingrese la nota final (0-100): 60
Reprobado
*/

/*
run:
Ingrese la nota final (0-100): 120
Nota invalida
*/