import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1003 { //Sempre colocar o "public class Main"
    public static void main (String [] args){
        // Solução -
        Scanner leitor = new Scanner(System.in);

        int A = Integer.parseInt(leitor.nextLine());
        int B = Integer.parseInt(leitor.nextLine());
        int soma = A + B;
        System.out.println("SOMA = " + soma);
    }
}