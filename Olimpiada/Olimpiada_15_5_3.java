public class Olimpiada_15_5_3 {
    public static void main(String [] args){
        final int tamanhodaMatrizLinha = 8;
        final int tamanhodaMatrizColuna = 8;

        String [][] matriz = new String[tamanhodaMatrizLinha][tamanhodaMatrizColuna];

        for(int linha = 0; linha < tamanhodaMatrizColuna; linha++){
            for (int coluna = 0;coluna < tamanhodaMatrizLinha; coluna++){
                if((coluna + linha) % 2 == 0) {
                    matriz[linha][coluna] = "w";
                }else {
                    matriz[linha][coluna] = "b";
                }
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }

    }

}
