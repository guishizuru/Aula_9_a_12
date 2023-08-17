public class Olimpiada_12_4_3 {
    public static void main(String[] args) {

        int tamanhoTriangulo = 7;

        for (int coluna = 0; coluna < tamanhoTriangulo; coluna++) {
            for (int linha = 0; linha < tamanhoTriangulo; linha++) {
                if (linha < coluna){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
