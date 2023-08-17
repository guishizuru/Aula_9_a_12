
public class Olimpiada_13_5_1 {
    public static void main(String[]args) {
        final int altura = 5;
        final int profundidade = 5;
        String[][] matriz = new String[altura][profundidade];

        for (int linhas = 0; linhas < profundidade; linhas++) {
            for (int colunas = 0; colunas < altura; colunas++) {
                if (colunas % 2 != 0 ){
                    matriz[linhas][colunas] = "t";
                }else {
                    matriz[linhas][colunas] = " ";
                }
                System.out.print("[" + matriz[linhas][colunas] + "]");
            }
            System.out.println(" ");
        }
    }
}

