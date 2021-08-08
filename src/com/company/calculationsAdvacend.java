package com.company;

//Importamos la Libreria para leer entrada de Teclado
import java.util.Scanner;

public class calculationsAdvacend {
    //Metodo Raiz Cuadrada
    public static void squareRoot(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tR A I Z _ C U A D R A D A");
        System.out.println("Ingrese un Dato: ");
        dato = in.nextInt();

        //Operacion de Raiz Cuadrada
        result = Math.sqrt(dato);

        //Mostrar resultado
        System.out.println("El resultado de la Raiz Cuadrada es: " + result);
    }

    //Metodo Potencia
    public static void power(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato1 = 0;
        double dato2 = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tP O T E N C I A");
        System.out.println("Ingrese el Dato Base: ");
        dato1 = in.nextInt();
        System.out.println("Ingrese el Dato Exponente: ");
        dato2 = in.nextInt();

        //Operacion de Potencia
        result = Math.pow(dato1, dato2);

        //Mostrar resultado
        System.out.println("El resultado de la Potencia es: " + result);
    }

    //Metodo Seno
    public static void sen(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tS E N O");
        System.out.println("Ingrese un Dato: ");
        dato = in.nextInt();

        //Operacion del Seno
        dato = Math.toRadians(dato); //Convertimos el dato a Radianes
        result = Math.sin(dato);

        //Mostrar resultado
        System.out.println("El resultado del Seno es: " + result);
    }

    //Metodo Coseno
    public static void cosine(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tC O S E N O");
        System.out.println("Ingrese un Dato: ");
        dato = in.nextInt();

        //Operacion del Coseno
        dato = Math.toRadians(dato); //Convertimos el dato a Radianes
        result = Math.cos(dato);

        //Mostrar resultado
        System.out.println("El resultado del Coseno es: " + result);
    }

    //Metodo Tangente
    public static void tangent(){
        Scanner in = new Scanner(System.in);
        //Declaracion de Variables
        double dato = 0;
        double result = 0;

        //Peticion de datos
        System.out.println("\tT A N G E N T E");
        System.out.println("Ingrese un Dato: ");
        dato = in.nextInt();

        //Operacion del Tangente
        dato = Math.toRadians(dato); //Convertimos el dato a Radianes
        result = Math.tan(dato);

        //Mostrar resultado
        System.out.println("El resultado del Tangente es: " + result);
    }
}
