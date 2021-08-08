package com.company;

//Importamos la Libreria para leer entrada de Teclado
import java.util.Scanner;

public class menuCalculator {
    //Metodo del Menu
    public static void menu(){

        //Area de Declaracion
        int option = 0;
        Scanner in = new Scanner(System.in);

        //Ciclo para menu
        do{
            System.out.println("" +
                    "   _____      _            _       _             \n" +
                    "  / ____|    | |          | |     | |            \n" +
                    " | |     __ _| | ___ _   _| | __ _| |_ ___  _ __ \n" +
                    " | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\n" +
                    " | |___| (_| | | (__| |_| | | (_| | || (_) | |   \n" +
                    "  \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
                    "                           @author: JuanVasUMG   ");
            System.out.println("\nBienvendo al Programa calculator\n");
            System.out.println("Calculos Basicos:\t\t\t\t\tCalculos Avanzados:\n" +
                    " 1.Suma\t\t\t\t\t\t\t\t5.Raiz Cuadrada\n" +
                    " 2.Resta\t\t\t\t\t\t\t6.Potencia\n" +
                    " 3.Multiplicacion\t\t\t\t\t7.Seno\n" +
                    " 4.Division\t\t\t\t\t\t\t8.Coseno\n" +
                    " \t\t\t\t\t\t\t\t\t9.Tangente\n" +
                    "\t\t\t10. Salir del Programa\n");
            System.out.println("Elije una de las Opciones : ");
            option = in.nextInt(); //Entrada de Teclado

            switch(option){
                case 1 :
                    calculationsBasic.sum();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }

                case 2 :
                    calculationsBasic.subtract();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 3 :
                    calculationsBasic.multiply();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 4 :
                    calculationsBasic.divide();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 5 :
                    calculationsAdvacend.squareRoot();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 6 :
                    calculationsAdvacend.power();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 7 :
                    calculationsAdvacend.sen();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 8 :
                    calculationsAdvacend.cosine();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 9 :
                    calculationsAdvacend.tangent();
                    if(returnMenu.backMenu()){
                        break;
                    } else {
                        option = 10;
                        break;
                    }
                case 10 : System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Esta opcion no existe");

            }
        }while (option!=10);
    }
}
