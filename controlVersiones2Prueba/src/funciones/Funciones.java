
package funciones;
import java.util.Scanner;
public class Funciones {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int base=0,exponent=0;
       String frase="";
       char letra;
        System.out.println("Escribe una frase");
        frase=scan.nextLine();
        frase=frase.toLowerCase();
        
        System.out.println("Que letra quieres que se contabilice?");
        letra=scan.next().charAt(0);
        
        
        System.out.println("La letra "+letra+" aparece "+(contarLetrasFrase(frase,letra))+" veces");
        
       
    }
    public static int contarLetrasFrase(String frase, char letra){
    int contadorLetra=0;
    char aux;
    for (int i = 0; i < frase.length(); i++) {

            aux = frase.charAt(i);
            if (aux == letra)
                contadorLetra++;
        }
    return contadorLetra;
    }
}
