import java.util.Scanner;

public class Olimpiada_8_3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite suas horas trabalhadas:");
        int horasTrabalhadas = scanner.nextInt();

        if (horasTrabalhadas > 40){
            int horasExtras = horasTrabalhadas - 40;
            double salarioExtra = 0;
            for (int hora = 1; hora <= horasExtras; hora++) {
                salarioExtra += 25;
            }
            double totalSalario = (40 * 15) + salarioExtra;
            System.out.println("Total a receber: " + totalSalario);
        }else {
            System.out.println("Total a receber: " + (horasTrabalhadas * 15));
        }
    }
}






