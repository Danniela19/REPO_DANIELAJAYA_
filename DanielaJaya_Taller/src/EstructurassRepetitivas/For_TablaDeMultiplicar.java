package EstructurassRepetitivas;

import java.util.Scanner;

/**
 * Problema: Solicite un número entero n y muestre su tabla del 1 al 12.
Requisitos:
Usar for.
Validar que n sea positivo.
 * @author Daniela
 */
public class For_TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero");
        n = tcl.nextInt();
        System.out.println("TABLA DEL " + n);
        for (int i = 1; i <= 12 && n > 0; i++) {
            System.out.println(n + "*" + i + " = " + (n*i));
        }
    }
}

/*
run:
Ingrese un numero
9
TABLA DEL 9
9*1 = 9
9*2 = 18
9*3 = 27
9*4 = 36
9*5 = 45
9*6 = 54
9*7 = 63
9*8 = 72
9*9 = 81
9*10 = 90
9*11 = 99
9*12 = 108
*/