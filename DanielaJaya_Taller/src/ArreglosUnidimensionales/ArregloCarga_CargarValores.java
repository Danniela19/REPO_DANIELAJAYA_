package ArreglosUnidimensionales;

import java.util.Random;
import java.util.Scanner;

/**
 * Problema: Solicite N (1..50). Cree un arreglo de N enteros y cargue valores por teclado.
Requisitos:
Validar N en rango.
Al finalizar, mostrar Carga completada
 * @author Daniela
 */
public class ArregloCarga_CargarValores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamanio del arreglo: ");
        n = tcl.nextInt();
        while (n < 1 || n > 50) {
            System.out.print("Ingrese el tamaño del arreglo (1..50): ");
            n = tcl.nextInt();
        }
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = tcl.nextInt();
        }

        System.out.println("Carga completada");
    }
}

/*
run:
Ingrese el tamanio del arreglo: 19
Valor 1: 2
Valor 2: 3
Valor 3: 5
Valor 4: 6
Valor 5: 7
Valor 6: 9
Valor 7: 3
Valor 8: 7
Valor 9: 5
Valor 10: 6
Valor 11: 1
Valor 12: 2
Valor 13: 4
Valor 14: 5
Valor 15: 7
Valor 16: 8
Valor 17: 97
Valor 18: 4
Valor 19: 4
Carga completada
*/