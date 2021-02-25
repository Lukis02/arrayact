
import java.util.Scanner;
public class Tabladias {


    public static void main(String[] args) {
        System.out.println("Introduzca el número del mes del año");
        Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            int[] meses = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println(meses[numero - 1]);

    }
}
