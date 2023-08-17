import java.util.Scanner;

public class Olimpiada_6_2_3 {
    public static void main(String[] args) {

        double totalSalario1 = 0;
        double totalnumerodeFilhos = 0;
        int quantidadedeHabitantes = 3;

        Scanner scanner = new Scanner(System.in);

        for (int habitantes = 1; habitantes <= quantidadedeHabitantes; habitantes++) {

            System.out.println(" digite o salario habitante 1 :");
            double salario = scanner.nextDouble();
           totalSalario1 += salario;



            System.out.println(" digite o numero de filhos 1 : ");
            double numerodeFilhos = scanner.nextDouble();
           totalnumerodeFilhos += numerodeFilhos;


        }

        double mediaSalario = totalSalario1 / quantidadedeHabitantes;
        double mediaFilhos = totalnumerodeFilhos / quantidadedeHabitantes;

        System.out.println(" os valores são " + "\n" + "media dos filhos = " + mediaFilhos
                + "\n" + "media do salario = " + mediaSalario);
    }
}
