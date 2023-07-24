import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1004 {
    public static void main (String [] args) { //Sempre colocar o "public class Main"
        // Solução -
        Scanner leitor = new Scanner(System.in);
    
        int A = Integer.parseInt(leitor.nextLine());
        int B = Integer.parseInt(leitor.nextLine());
        int produto = A * B;
        System.out.println("PROD = " + produto);
    }
    
}
