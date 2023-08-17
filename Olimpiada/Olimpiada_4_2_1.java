import java.util.Scanner;

public class Olimpiada_4_2_1 {
    public static void main(String[]args){
        double metros;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" digite o tamanho em metros quadrados de sua residencia :");
        metros = scanner.nextDouble();

        Double IPTU = metros * 12;
        System.out.println(" o IPTU em pratas é : " + IPTU);

    }
}
