import java.util.Scanner;

public class Olimpiada_5_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println(" digite o primeiro numero :");
        numero1 = scanner.nextInt();

        System.out.println(" digite o segundo numero : ");
        numero2 = scanner.nextInt();

        System.out.println(" o valor maior é " + numeroMaior(numero1, numero2));
    }
    public static int numeroMaior(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else{
            return numero2;
        }
    }
}

