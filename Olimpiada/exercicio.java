import java.util.Random;

/*Desenvolva um programa que contenha 2 vetores de 10 posições
* Cada vetor deve ser preenchido aleatóriamente.
*
* Após isso, crie um terceiro vetor onde às casas pares serão
* a soma dos valores no mesmo indices dos outros 2, e as impares a subtração.
*
* Ao final, imprima os 3 vetores, na primeira linha o vetor1 e assim suscetivamente.
* */
public class exercicio {
    public static void main(String[] args) {
        final int tamanhoVetor = 3;

        int[] vetor1 = new int[tamanhoVetor];
        int[] vetor2 = new int[tamanhoVetor];
        Random random = new Random();
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor1[i] = random.nextInt(100);
            vetor2[i] = random.nextInt(100);
        }
        int[] vetor3 = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            if (i % 2 != 0) {
                vetor3[i] = vetor1[i] - vetor2[i];
            } else {
                vetor3[i] = vetor1[i] + vetor2[i];
            }
            System.out.println();
        }
        for (int imprimir = 0; imprimir < tamanhoVetor; imprimir++) {
            System.out.print("| vetor 1: " + vetor1[imprimir]);
        }
        System.out.print("\n");
        for (int imprimir = 0; imprimir < tamanhoVetor; imprimir++) {
            System.out.print("| vetor 2: " + vetor2[imprimir]);
        }
        System.out.print("\n");
        for (int imprimir = 0; imprimir < tamanhoVetor; imprimir++) {
            System.out.print("| vetor 3: " + vetor3[imprimir]);
        }
    }
}


