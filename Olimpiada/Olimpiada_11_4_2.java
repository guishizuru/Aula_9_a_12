public class Olimpiada_11_4_2 {

    public static double euclidiana(double entradaA_1, double entradaA_2, double entradaB_1, double entradaB_2) {


        double euclidiana = Math.pow((entradaA_1 - entradaA_2),2.0) + Math.pow((entradaB_1 - entradaB_2), 2.0);


        return Math.sqrt(euclidiana);
    }
    public static void  main (String[]args){
        double entradaA_1 = 7;
        double entradaA_2 = 3;
        double entradaB_1 = 3;
        double entradaB_2 = 5;

        System.out.println("Resultado" + euclidiana(entradaA_1,entradaA_2,entradaB_1,entradaB_2));
    }

}