package ArreglosUnidimensionales;

import java.util.Scanner;

/**
 * Problema: Con un arreglo de N enteros (cargado por teclado), calcular:
Mayor
Menor
Promedio (double)
Requisitos:

Validar N (1..50).
Mostrar resultados con 2 decimales en el promedio.
 * @author Daniela
 */
public class ArregloProcedimiento_EstadisticasBasicas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n = 0;
        double promedio;
        while (n < 1 || n > 50) {
            System.out.print("Ingrese el tamanio del arreglo (1..50): ");
            n = tcl.nextInt();
        }
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = tcl.nextInt();
        }
        int mayor = arreglo[0];
        int menor = arreglo[0];
        int suma = 0;
        
        for (int i = 0; i < n; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
            suma += arreglo[i];
        }

        promedio = (double) suma / n;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}

/*
run:
Ingrese el tamanio del arreglo (1..50): 15
Valor 1: 3
Valor 2: 2
Valor 3: 5
Valor 4: 6
Valor 5: 7
Valor 6: 8
Valor 7: 9
Valor 8: 0
Valor 9: 1
Valor 10: 2
Valor 11: 4
Valor 12: 7
Valor 13: 5
Valor 14: 4
Valor 15: 2
Mayor: 9
Menor: 0
Promedio: 4,33
*/
