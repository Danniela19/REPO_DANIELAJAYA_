package ArrreglosBidimensionales;

import java.util.Scanner;

/**
 * Problema: Solicite filas f (1..10) y columnas c (1..10). 
 * Cree una matriz f x c de enteros y llénela por teclado.
Requisitos:
Validar rangos.
Al finalizar, mostrar Matriz cargada
 * @author Daniela
 */
public class MatrizCarga_CrearyLlenarMatriz {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f, c;
        System.out.print("Ingrese la cantidad de filas: ");
        f = tcl.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        c = tcl.nextInt();
        int matriz[][] = new int [f][c];
        if (f < 1 || f > 10 || c < 1 || c > 10) {
            System.out.println("Valores no validos");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor de [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        System.out.println("Matriz Cargada");
        }
    }

/*
run:
Ingrese la cantidad de filas: 5
Ingrese la cantidad de columnas: 5
Ingrese el valor de [0][0]: 3
Ingrese el valor de [0][1]: 5
Ingrese el valor de [0][2]: 6
Ingrese el valor de [0][3]: 7
Ingrese el valor de [0][4]: 8
Ingrese el valor de [1][0]: 9
Ingrese el valor de [1][1]: 1
Ingrese el valor de [1][2]: 2
Ingrese el valor de [1][3]: 3
Ingrese el valor de [1][4]: 4
Ingrese el valor de [2][0]: 5
Ingrese el valor de [2][1]: 19
Ingrese el valor de [2][2]: 2
Ingrese el valor de [2][3]: 4
Ingrese el valor de [2][4]: 5
Ingrese el valor de [3][0]: 6
Ingrese el valor de [3][1]: 6
Ingrese el valor de [3][2]: 5
Ingrese el valor de [3][3]: 4
Ingrese el valor de [3][4]: 7
Ingrese el valor de [4][0]: 8
Ingrese el valor de [4][1]: 9
Ingrese el valor de [4][2]: 1
Ingrese el valor de [4][3]: 2
Ingrese el valor de [4][4]: 5
Matriz Cargada
*/