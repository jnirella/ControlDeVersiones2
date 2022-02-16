/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author jnire
 */
public class Exercici1_FunctionTraining {
    public static void main(String[] args) {
    int numeros[] = {8,6,2,7,3,16,5,98,23,4,12,10,13,19};
    int numeros2[]={24,3,2,8,9,3,4,788,8,8,888};
    mostrarNumeros(numeros);
    mostrarNumeros(numeros2);
    }
    
    public static void mostrarNumeros(int array[]){
    int num=0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        
       
    }
    
}

