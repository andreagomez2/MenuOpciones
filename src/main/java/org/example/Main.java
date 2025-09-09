package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Programa para crear un ciclo
        //crear un menu de opciones
        Integer opcionSeleccionada = 0;
        while (opcionSeleccionada != 5) {
            System.out.println("menu de opciones");
            System.out.println("*****************");
            System.out.println("➕digita 1 para sumar");
            System.out.println("➖digita 2 para restar");
            System.out.println("❌digita 3 para multiplicar");
            System.out.println("➗digita 5 para dividir");
            System.out.println("➡ digita 5 para SALIR DEL PROGRAMA");
            Scanner leerTeclado = new Scanner(System.in);
            System.out.println("seleccione una opcion porfavor:☺");
            opcionSeleccionada = leerTeclado.nextInt();

            //evaluando caminos segun la opcion del usuario:
            if (opcionSeleccionada == 1) {
                System.out.println("sumando");
            } else if (opcionSeleccionada == 2) {
                System.out.println("restando..");
            } else if (opcionSeleccionada == 3) {
                System.out.println("multiplicando");
            } else if (opcionSeleccionada == 4) {
                System.out.println("dividiendo");
            } else if (opcionSeleccionada == 5) {
                System.out.println("saliendo..");
            } else {
                System.out.println("opcion invalida..");
            }
        }
    }
}
