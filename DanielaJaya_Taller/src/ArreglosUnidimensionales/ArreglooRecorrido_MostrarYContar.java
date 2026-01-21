package ArreglosUnidimensionales;

import java.util.Scanner;

/**
 * Problema: Con un arreglo de N enteros (cargado por teclado):
Mostrar todos los valores
Contar cuántos son pares y cuántos impares
Requisitos:
Mostrar al final: Pares: X, Impares: Y
 * @author Daniela
 */
public class ArreglooRecorrido_MostrarYContar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, par = 0, impar = 0;
        System.out.println("Deme el tamanio del arreglo");
        n = tcl.nextInt();
        int [] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            arreglo[i] = tcl.nextInt();
            System.out.println("Valor " + (i+1) + ": " + arreglo[i]);
        }
        System.out.println("VALORES");
        for (int i = 0; i < n; i++) { 
            if (arreglo[i]%2 == 0) {
                System.out.println(arreglo[i]+ ": es par");
                par++;
            } else {
                System.out.println(arreglo[i]+ ": es impar");
                impar++;
            }
        }
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}

/*
run:
Deme el tamanio del arreglo
10
Valor 1: 4
Valor 2: 8
Valor 3: 1
Valor 4: 9
Valor 5: 10
Valor 6: 10
Valor 7: 8
Valor 8: 7
Valor 9: 9
Valor 10: 9
VALORES
4: es par
8: es par
1: es impar
9: es impar
10: es par
10: es par
8: es par
7: es impar
9: es impar
9: es impar
Pares: 5
Impares: 5
*/
