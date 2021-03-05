package com.ayiescuela;

import com.ayiescuela.operaciones.Operaciones;
import com.ayiescuela.operaciones.Pedir;

import java.util.Scanner;

/**
 * Hello world!
 */

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de operaciones simples.");
        menu();
    }

    public static void menu() {
        int opcion = 0;  // se recomienda usar int, actualmente con las capacidades de memoria no hay mucha diferencia en usar int.
        imprimirOpcionesMenu(); // extraje las opciones en un metodo.
        while (opcion != 5) {
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            scanner.nextLine(); // esto se aplica en caso de que se presione enter sin escribir ningún número
            switch (opcion) {
                case 1: {
                    int[] numeros;
                    numeros = Pedir.pedirNumeros();
                    System.out.println(Operaciones.suma(numeros[0], numeros[1]));
                    break;
                }
                case 2: {
                    int[] numeros;
                    numeros = Pedir.pedirNumeros();
                    System.out.println(Operaciones.resta(numeros[0], numeros[1]));
                    break;
                }
                case 3: {
                    int[] numeros;
                    numeros = Pedir.pedirNumeros();
                    System.out.println(Operaciones.multiplicacion(numeros[0], numeros[1]));
                    break;
                }
                case 4:
                    Pedir.pedirDivision();
                    break;

                case 5:
                    menuMultiple();
                    break;

                case 6:
                    System.out.println("Gracias por utilizar nuestra calculadora.");
                    break;

                default:
                    System.out.println("Opcion inválida.");
                    break;
            }
        }
    }

    public static void menuMultiple() {
        int opcion = 0;
        imprimirOpcionesMenuMultiple();
        while (opcion != 4) {
            Scanner scanner = new Scanner(System.in);
            opcion = Byte.parseByte(scanner.nextLine());
            scanner.close();
            switch (opcion) {
                case 1: {
                    int[] numeros;
                    numeros = Pedir.pedirMuchosNumeros();
                    System.out.println(Operaciones.sumaMultiple(numeros));
                    break;
                }

                case 2: {
                    int[] numeros;
                    numeros = Pedir.pedirMuchosNumeros();
                    System.out.println(Operaciones.restaMultiple(numeros));
                    break;
                }

                case 3: {
                    int[] numeros;
                    numeros = Pedir.pedirMuchosNumeros();
                    System.out.println(Operaciones.multiplicacionMultiple(numeros));
                    break;
                }

                default:
                    break;
            }
        }
    }

    public static void imprimirOpcionesMenu() {
        System.out.println("-------");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("5) En caso de requerir operaciones multiples.");
        System.out.println("6) Salir");
        System.out.println("-------");
        System.out.println("Ingrese una opcion: ");
    }

    public static void imprimirOpcionesMenuMultiple() {
        System.out.println("-------");
        System.out.println("1) Suma Multiple");
        System.out.println("2) Resta Multiple");
        System.out.println("3) Multiplicacion Multiple");
        System.out.println("4) Salir");
        System.out.println("-------");
        System.out.println("Ingrese una opcion: ");
    }

}
