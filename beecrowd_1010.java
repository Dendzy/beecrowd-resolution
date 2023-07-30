import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","
public class beecrowd_1010 { //Sempre colocar o "public class Main"
    public static void main (String [] args){
        // Solução -
        int codigo_peca1;
        int quantidade_peca1;
        double valor_unitario_peca1;

        int codigo_peca2;
        int quantidade_peca2;
        double valor_unitario_peca2;

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        codigo_peca1 = leitor.nextInt();
        quantidade_peca1 = leitor.nextInt();
        valor_unitario_peca1 = leitor.nextDouble();

        codigo_peca2 = leitor.nextInt();
        quantidade_peca2 = leitor.nextInt();
        valor_unitario_peca2 = leitor.nextDouble();

        double total_peca1 = quantidade_peca1 * valor_unitario_peca1;
        double total_peca2 = quantidade_peca2 * valor_unitario_peca2;
        double valor_total = total_peca1 + total_peca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor_total);
        }
    } 

