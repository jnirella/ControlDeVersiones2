/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

public class Exercici2_Hemoglobina {

    public static void main(String[] args) {
        int edad = 0;
        String sexe = "";
        double hemoglobina = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Que edad tienes?");
        edad = scan.nextInt();
        System.out.println("Eres Hombre (H) o Mujer (M) ?");
        sexe = scan.next();
        switch (sexe) {
            case "M":
                sexe = "mujer";
                break;
            case "m":
                sexe = "mujer";
                break;
            case "Mujer":
                sexe = "mujer";
                break;
            case "mujer":
                sexe = "mujer";
                break;
            case "H":
                sexe = "hombre";
                break;
            case "h":
                sexe = "hombre";
                break;
            case "Hombre":
                sexe = "hombre";
                break;
            case "hombre":
                sexe = "hombre";
                break;
        }
        System.out.println("Cual es tu nivel de hemoglobina?");
        hemoglobina = scan.nextDouble();
        anemia(hemoMin(edad, sexe), hemoMax(edad, sexe), hemoglobina);

    }

    public static double hemoMax(int edad, String sex) {
        double hemoMax = 0.0;
        if (edad <= 1) {
            System.out.println("Edad <1 año. Nivel hemoglobina max 15%");
            hemoMax = 15.0;
        }
        if (edad > 1 && edad <= 15) {
            System.out.println("Edad entre 1 y 15 años. Nivel hemoglobina max 15.5%");
            hemoMax = 15.5;
        }
        if (edad > 15 && sex == "mujer") {
            System.out.println("Edad superior a 15 años Mujere. Nivel hemoglobina max 16%");
            hemoMax = 16.0;
        }
        if (edad > 15 && sex == "hombre") {
            System.out.println("Edad superior a 15 años Hombre. Nivel hemoglobina max 18%");
            hemoMax = 18.0;
        }
        return hemoMax;
    }

    public static double hemoMin(int edad, String sex) {
        double hemoMin = 0.0;
        if (edad <= 1) {
            System.out.println("Edad <1 año. Nivel hemoglobina min. 11%");
            hemoMin = 11.0;
        }
        if (edad > 1 && edad <= 15) {
            System.out.println("Edad entre 1 y 15 años. Nivel hemoglobina min. 11.5%");
            hemoMin = 11.5;
        }
        if (edad > 15 && sex == "mujer") {
            System.out.println("Edad superior a 15 años Mujere. Nivel hemoglobina min. 12%");
            hemoMin = 12.0;
        }
        if (edad > 15 && sex == "hombre") {
            System.out.println("Edad superior a 15 años Hombre. Nivel hemoglobina min. 14%");
            hemoMin = 14.0;
        }
        return hemoMin;
    }

    public static void anemia(double hemoMin, double hemoMax, double hemoActual) {
        if (hemoActual > hemoMin && hemoActual < hemoMax) {
            System.out.println("No teienes anemia!");
        } else {
            System.out.println("Tienes anemia!");
        }
    }
}
