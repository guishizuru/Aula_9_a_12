import java.util.Scanner;

public class Olimpiada_7_3_1 {
    public static void main(String[] args) {
        String usuario;
        String senha;
        boolean usuarioEstahLogado = false;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" digite seu USUÁRIO :");
            usuario = scanner.next();


            System.out.println("digite sua SENHA :");
            senha = scanner.next();

            if (usuario.equals("adm") && senha.equals("123")) {
                usuarioEstahLogado = true;
            } else {
                System.out.println("USUÁRIO OU SENHA INCORRETOS "
                        + "\n--------------------------");
            }
            contador++;

        } while (!usuarioEstahLogado && contador < 3);


            if (usuarioEstahLogado) {
                System.out.println("login realizado com sucesso"
                        + "\n--------------------------");
            } else {
                System.out.println("CONTA BLOQUEADA" +
                        "\n--------------------------");
            }
        }
    }
