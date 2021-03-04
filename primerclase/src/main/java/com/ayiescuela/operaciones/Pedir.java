package com.ayiescuela.operaciones;

import java.util.Scanner;

public class Pedir {
    public static int[] pedirNumeros() {
        System.out.println("Ingrese los números que desea operar:");
        int[] numeros = new int[2];
        numeros[0] = numeros();
        numeros[1] = numeros();
        return numeros;
    }

    public static int numeros() {
        System.out.println("Ingrese número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }
    
    public static int[] pedirMuchosNumeros() {
        int cantidad = 0;
        System.out.println("Ingrese la cantidad de números que desea operar: ");
        cantidad = numeros();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = numeros();
        }
        return numeros;
    }
    public static void pedirDivision() {
        System.out.println("Ingrese los números que desea dividir:");
        int numero1 = numeros();
        int numero2 = numeros();
        while (numero2 == 0) {
            System.out.println("Recuerde que no es posible dividir por 0. Intente de nuevo:");
            numero2 = numeros();
        }
        System.out.println(Operaciones.division(numero1, numero2));
    }

}
