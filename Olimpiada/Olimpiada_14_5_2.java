public class Olimpiada_14_5_2 {
    public static void main(String[] args) {
        final int tamanhoDoVetor = 5;
        int[] vetor = new int[tamanhoDoVetor];
        vetor[0] = -12;
        vetor[1] = 96;
        vetor[2] = 18;
        vetor[3] = -27;
        vetor[4] = 53;
        int temporaria = 0;

        for (int i = 0 ; i < tamanhoDoVetor; i++) {
            for(int j = 0; j < ((tamanhoDoVetor - 1) + 1 ) - 1; j++){
               if(vetor[j] > vetor[j + 1] ){
                 temporaria = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor [j + 1] = temporaria;
                }
            }
        }
        for(int y= 0; y < tamanhoDoVetor; y++ ){
            System.out.println(" vetor : " + vetor[y]);
        }

    }
}

