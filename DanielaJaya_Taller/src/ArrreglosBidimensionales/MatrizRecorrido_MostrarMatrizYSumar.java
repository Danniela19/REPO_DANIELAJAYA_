package ArrreglosBidimensionales;

import java.util.Scanner;

/**
 * Problema: Con una matriz f x c (cargada por teclado):
Mostrar la matriz en formato de tabla
Calcular la suma de cada fila y mostrarla
Requisitos:

Formato sugerido:
Fila 1 -> suma = ...
Fila 2 -> suma = ...
 * @author Daniela
 */
public class MatrizRecorrido_MostrarMatrizYSumar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f = 0, c = 0;
        System.out.print("Ingrese cantidad de filas: ");
        f = tcl.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        c = tcl.nextInt();
        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("\nMATRIZ:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSUMA POR FILAS:");
        for (int i = 0; i < f; i++) {
            int suma = 0;
            for (int j = 0; j < c; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + " -> suma = " + suma);
        }
    }
}

/*
run:
Ingrese cantidad de filas: 4
Ingrese cantidad de columnas: 4
Ingrese valor [0][0]: 1
Ingrese valor [0][1]: 4
Ingrese valor [0][2]: 6
Ingrese valor [0][3]: 7
Ingrese valor [1][0]: 8
Ingrese valor [1][1]: 9
Ingrese valor [1][2]: 6
Ingrese valor [1][3]: 0
Ingrese valor [2][0]: 1
Ingrese valor [2][1]: 2
Ingrese valor [2][2]: 3
Ingrese valor [2][3]: 4
Ingrese valor [3][0]: 3
Ingrese valor [3][1]: 2
Ingrese valor [3][2]: 5
Ingrese valor [3][3]: 8

MATRIZ:
1	4	6	7	
8	9	6	0	
1	2	3	4	
3	2	5	8	

SUMA POR FILAS:
Fila 1 -> suma = 18
Fila 2 -> suma = 23
Fila 3 -> suma = 10
Fila 4 -> suma = 18
*/

