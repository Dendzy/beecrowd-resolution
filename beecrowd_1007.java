import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1007{
    public static void main (String[] args) { //Sempre colocar o "public class Main"
        // Solução -
        Scanner leitor = new Scanner(System.in);
        
        int A = Integer.parseInt(leitor.nextLine());
        int B = Integer.parseInt(leitor.nextLine());
        int C = Integer.parseInt(leitor.nextLine());
        int D = Integer.parseInt(leitor.nextLine());
        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = " + diferenca);
    }
}