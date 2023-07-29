import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1074 { //Sempre colocar o "public class Main"
    public static void main(String [] args) {
        // Solução - 
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());
        for (int i = 0; i < N; i++){
            int numero = Integer.parseInt(leitor.nextLine());
            
            if (numero == 0) {
                System.out.println("NULL");
            }
            else if (numero %2 == 0) {
                if (numero > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else if (numero %2 != 0) {
                if (numero > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            

        }

    }
}