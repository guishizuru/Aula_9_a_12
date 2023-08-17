import java.util.Scanner;

public class Olimpiada_3_1_3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double altura;
        System.out.println(" digite sua altura");
        altura = scanner.nextDouble();
        double peso ;
        System.out.println(" digite seu peso ");
        peso = scanner.nextDouble();



        double IMC =  peso / (altura * altura);
            System.out.println("resultado : " + IMC);

            if(IMC <= 18.5){
                System.out.println("você se encontra no estado de MAGREZA");
            }else if(IMC >= 18.5 && IMC <= 24.9){
                System.out.println("você se encontra no estado NORMAL");
            }else if(IMC >= 25.0 && IMC <= 29.9){
                System.out.println("você se encontra no estado de SOBREPESO");
            }else if(IMC >= 30.0 && IMC <= 39.9){
                System.out.println("você se encontra no estado de OBESIDADE");
            }else if (IMC >= 40.0){
            System.out.println("você se encontra com OBESIDADE GRAVE ");
        }

    }

}
