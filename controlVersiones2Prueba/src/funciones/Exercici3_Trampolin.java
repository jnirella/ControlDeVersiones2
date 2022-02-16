/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

public class Exercici3_Trampolin {

    public static void main(String[] args) {
        float[] notas = new float[6];
        Scanner scan = new Scanner(System.in);
        boolean controlador = true;
        
        for (int i = 0; i < notas.length; i++) {
            controlador = true;
            do {
                System.out.println("Introduce la nota del juez numero " + i);
                notas[i] = scan.nextFloat();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("nota no valdia, prueba de nuevo.");
                } else {
                    controlador = false;
                }
            } while (controlador);           
             
        }

    }

    public static float notaFinal(float notas[]) {
        float aux = 0.0f;
        boolean control = true;
        float result = 0.0f;
        do {
            for (int j = 1; j < notas.length; j++) {
                if (notas[j] < notas[j - 1]) {
                    aux = notas[j];
                    notas[j] = notas[j - 1];
                    notas[j - 1] = aux;
                    control = false;
                }

            }
        } while (control = false);

        result = (notas[2] + notas[3] + notas[4]) * 2.3f;

        return result;
    }
}
