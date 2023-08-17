public class Olimpiada_10_4_1 {
    public static double hipotenusa(double calculo1, double calculo2) {
        double calcularQuadradoDoCateto1 = Math.pow(calculo1, 2.0);
        double calcularQuadradoDoCateto2 = Math.pow(calculo2, 2.0);

        double hipotenusa = (calcularQuadradoDoCateto1 + calcularQuadradoDoCateto2) ;

        return Math.sqrt(hipotenusa);
    }

    public static void main(String[] args) {
       double cateto1 = 6;
       double cateto2 = 8;

        double soma = (hipotenusa(cateto1,cateto2));
        System.out.println(soma);
    }
}
