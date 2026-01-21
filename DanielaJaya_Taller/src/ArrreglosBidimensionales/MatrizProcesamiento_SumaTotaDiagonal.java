package ArrreglosBidimensionales;

import java.util.Scanner;

/**
 * Problema: Con una matriz f x c:
Calcular suma total de elementos
Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal
Requisitos:

Si no es cuadrada, mostrar Diagonal no aplica
 * @author Daniela
 */
public class MatrizProcesamiento_SumaTotaDiagonal {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c;
        System.out.print("Ingrese filas: ");
        f = tcl.nextInt();
        System.out.print("Ingrese columnas: ");
        c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        int sumaTotal = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("Suma total de los elementos: " + sumaTotal);
        if (f == c) {
            int sumaDiagonal = 0;
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }
}

/*
run:
Ingrese filas: 4
Ingrese columnas: 4
Ingrese valor [0][0]: 3
Ingrese valor [0][1]: 6
Ingrese valor [0][2]: 7
Ingrese valor [0][3]: 8
Ingrese valor [1][0]: 9
Ingrese valor [1][1]: 2
Ingrese valor [1][2]: 3
Ingrese valor [1][3]: 4
Ingrese valor [2][0]: 9
Ingrese valor [2][1]: 0
Ingrese valor [2][2]: 1
Ingrese valor [2][3]: 2
Ingrese valor [3][0]: 3
Ingrese valor [3][1]: 4
Ingrese valor [3][2]: 5
Ingrese valor [3][3]: 6
Suma total de los elementos: 72
Suma de la diagonal principal: 12
*/
