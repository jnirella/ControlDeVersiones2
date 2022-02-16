/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

public class Ejercicio_5_Temperaturas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float temperaturaMes[] = {10.0f, 12.8f, 11.9f, 14.3f, 19.4f, 20.1f, 25.0f, 25.5f, 21.7f, 16.4f, 14.7f, 9.3f, 0.0f};
        float tempMaxMin[];
        tempMaxMin = new float[2];

        tempMaxMin = tempAltayBaja(temperaturaMes);
        temperaturaMes[12]=tempMediaAño(temperaturaMes);

        System.out.println("La temperatura más alta durante el año ha sido " + (tempMaxMin[0]) + " siendo el mes de " + (mesCalido(temperaturaMes)));
        System.out.println("La temperatura más baja durante el año ha sido " + (tempMaxMin[1]) + " siendo el mes de " + (mesFrio(temperaturaMes)));
        System.out.println("La temperatura media del año ha sido de " + temperaturaMes[12]);
    }
//comentario de prueba
    //Calcula temperatura media de todo el año
    public static float tempMediaAño(float temperaturaMes[]) {
        float acumulador = 0.0f;
        for (int i = 0; i < temperaturaMes.length - 1; i++) {
            acumulador = acumulador + temperaturaMes[i];
        }
        return (float)acumulador / 12;
    }

    //Calcual temperatura mas alta y mas baja
    public static float[] tempAltayBaja(float temperaturas[]) {
        float tempMaxMin[] = {0.0f, 100.f};
        //Calcuala temperatura mas alta y la guarda en la posicion 0 del array temSuperiorInferior 
        float auxTempAlta = 0.0f;
        for (int i = 0; i < temperaturas.length - 1; i++) {
            if (temperaturas[i] > tempMaxMin[0]) {
                tempMaxMin[0] = temperaturas[i];
            }
        }
        //Calcula temperatura mas baja y la guarda en la posicion 1 del array tempSuperiorInferior  
        for (int i = 0; i < temperaturas.length - 1; i++) {
            if (temperaturas[i] < tempMaxMin[1]) {
                tempMaxMin[1] = temperaturas[i];
            }
        }
        return tempMaxMin;
    }

    //que mes ha sido el mas calido?//
    public static String mesCalido(float temperaturas[]) {
        int mesCalido = 0;
        String mesMasCalido = "";
        float tempSuperior = temperaturas[0];

        for (int i = 0; i < temperaturas.length - 1; i++) {
            if (temperaturas[i] > tempSuperior) {
                tempSuperior = temperaturas[i];
                mesCalido = i;
            }
        }
        switch (mesCalido) {
            case 0:
                mesMasCalido = "Enero";
                break;
            case 1:
                mesMasCalido = "Febrero";
                break;
            case 2:
                mesMasCalido = "Marzo";
                break;
            case 3:
                mesMasCalido = "Abril";
                break;
            case 4:
                mesMasCalido = "Mayo";
                break;
            case 5:
                mesMasCalido = "Junio";
                break;
            case 6:
                mesMasCalido = "Julio";
                break;
            case 7:
                mesMasCalido = "Agosto";
                break;
            case 8:
                mesMasCalido = "Septiembre";
                break;
            case 9:
                mesMasCalido = "Octubre";
                break;
            case 10:
                mesMasCalido = "Noviembre";
                break;
            case 11:
                mesMasCalido = "Diciembre";
                break;

        }
        return mesMasCalido;
    }

    //que mes ha sido el mas frio?
    public static String mesFrio(float temperaturas[]) {
        int mesFrio = 0;
        String mesMasFrio = "";
        float tempInferior = 100.0f;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < tempInferior) {
                tempInferior = temperaturas[i];
                mesFrio = i;
            }
        }
        switch (mesFrio) {
            case 0:
                mesMasFrio = "Enero";
                break;
            case 1:
                mesMasFrio = "Febrero";
                break;
            case 2:
                mesMasFrio = "Marzo";
                break;
            case 3:
                mesMasFrio = "Abril";
                break;
            case 4:
                mesMasFrio = "Mayo";
                break;
            case 5:
                mesMasFrio = "Junio";
                break;
            case 6:
                mesMasFrio = "Julio";
                break;
            case 7:
                mesMasFrio = "Agosto";
                break;
            case 8:
                mesMasFrio = "Septiembre";
                break;
            case 9:
                mesMasFrio = "Octubre";
                break;
            case 10:
                mesMasFrio = "Noviembre";
                break;
            case 11:
                mesMasFrio = "Diciembre";
                break;

        }
        return mesMasFrio;
    }

}
