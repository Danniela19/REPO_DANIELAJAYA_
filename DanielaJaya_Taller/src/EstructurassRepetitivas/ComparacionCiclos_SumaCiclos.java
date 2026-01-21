package EstructurassRepetitivas;

import java.util.Scanner;

/**
 * ComparacionCiclos.java – Suma de 1..N con 3 ciclos
Problema: Ingrese un entero N (>=1). Calcule la suma 1+2+...+N usando:
while
do-while
for
Muestre los tres resultados y verifique que coinciden.

Requisitos:

Validación de N (>=1).
Mostrar:
Suma con while: ...
Suma con do-while: ...
Suma con for: ...
Si no coinciden (no debería ocurrir), mostrar Revisar implementación
 * @author Daniela
 */
public class ComparacionCiclos_SumaCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, i, sumaWhile, sumaDoWhile, sumaFor;
        System.out.println("Ingrese un numero");
        n = tcl.nextInt();
       
        sumaWhile = 0;
        i = 1;
        while (i <= n) {
            sumaWhile += i;
            i++;
        }
        sumaDoWhile = 0;
        i = 1;
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= n);
        sumaFor = 0;
        for (i = 1; i <= n; i++) {
            sumaFor += i;
        }        
        System.out.println("Suma While: " + sumaWhile);
        System.out.println("Suma Do While: " + sumaDoWhile);
        System.out.println("Suma For: " + sumaFor);

        if (sumaWhile != sumaDoWhile || sumaWhile != sumaFor) {
            System.out.println("Revisar implementación");
        }
    }
}

/*
run:
Ingrese un numero
3
Suma While: 6
Suma Do While: 6
Suma For: 6
*/