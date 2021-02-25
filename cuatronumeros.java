import java.util.ArrayList;
import java.util.Scanner;
public class cuatronumeros {

    public static void main(String[] args) {
        int[] numeros = new int[4];
        double auxMedia = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca un numero: ");
            numeros[i] = sc.nextInt();
            auxMedia += numeros[i];
        }
        System.out.println("La media es: " + auxMedia/4);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
    }
}


