import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class cinconumeros {
    public static void main(String[] args) {
        float[] numeros = new float[5];

        Scanner sc =new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.println("Introduzca un número: ");
            numeros[i] = sc.nextInt();


        }
        for (int i = 0; i < 1 ; i++) {
            System.out.println(numeros[4]);
            System.out.println(numeros[3]);
            System.out.println(numeros[2]);
            System.out.println(numeros[1]);
            System.out.println(numeros[0]);
        }

    }

}
