package com.ayiescuela.operaciones;

public class Operaciones {
    
    public static int suma(int x, int y) {
        return x + y;
    }

    public static int multiplicacion(int x, int y) {
        return x * y;
    }

    public static int resta(int x, int y) {
        return x - y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static int sumaMultiple(int[] numeros) {
        int resultado = 0;
        for (int numero: numeros) {
            resultado += numero;
        }
        return resultado;   
    }

    public static int multiplicacionMultiple(int[] numeros) {
        int resultado = 1;
        for (int numero: numeros) {
            resultado *= numero;
        }
        return resultado;   
    }

    public static int restaMultiple(int[] numeros) {
        int resultado = numeros[0];
        for (int numero: numeros) {
            resultado -= numero;
        }
        return resultado;   
    }


}


