package EstructurasSelectivas;

import java.util.Scanner;

/**
 * Problema: Ingrese un puntaje (0–100) y clasifique:
90–100: Excelente
70–89: Bueno
0–69: En proceso
 * @author Daniela
 */
public class IfAnidado_ClasificacionPorRango {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int puntaje;
        System.out.print("Ingrese el puntaje (0-100): ");
        puntaje = tcl.nextInt();
        if (puntaje >= 90 && puntaje <= 100) {
            System.out.println("Excelente");
        } else if (puntaje >= 70 && puntaje <= 89) {
            System.out.println("Bueno");
        } else if (puntaje >= 0 && puntaje <= 69) {
            System.out.println("En proceso");
        } else {
            System.out.println("Puntaje invalido (fuera de rango)");
        }
    }
}

/*
run:
Ingrese el puntaje (0-100): 95
Excelente
*/

/*
run:
Ingrese el puntaje (0-100): 75
Bueno
*/

/*
run:
Ingrese el puntaje (0-100): 40
En proceso
*/

/*
run:
Ingrese el puntaje (0-100): 120
Puntaje invalido (fuera de rango)
*/