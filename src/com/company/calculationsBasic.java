package com.company;

//Importamos la Libreria para leer entrada de Teclado
import java.util.Scanner;

public class calculationsBasic {

    //Metodo Suma
    public static void sum(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tS U M A _ D E _ 2 _ N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();

        //Operacion de Suma
        result = dato1 +  dato2;

        //Mostrar resultado
        System.out.println("El resultado de la suma es: " + result);
    }

    //Metodo Resta
    public static void subtract(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tR E S T A _ D E _ 2 _ N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();

        //Operacion de Resta
        result = dato1 -  dato2;

        //Mostrar resultado
        System.out.println("El resultado de la Resta es: " + result);
    }

    //Metodo Multiplicacion
    public static void multiply(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tM U L T I P L I C A C I O N _ D E _ 2 _ N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();

        //Operacion de Multiplicacion
        result = dato1 *  dato2;

        //Mostrar resultado
        System.out.println("El resultado de la Multiplicacion es: " + result);
    }

    //Metodo Division
    public static void divide(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tD I V I S I O N _ D E _ 2 _ N U M E R O S");
        System.out.println("Ingrese Su Primer Dato: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese Su Segundo Dato: ");
        dato2 = in.nextInt();

        //Operacion de Division
        result = dato1 /  dato2;

        //Mostrar resultado
        System.out.println("El resultado de la Division es: " + result);
    }
}
