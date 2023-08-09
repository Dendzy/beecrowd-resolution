import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","

public class beecrowd_1038 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String valor_entrada[] = input.nextLine().split(" ");

        int codigo = Integer.parseInt(valor_entrada[0]);
        int quantidade = Integer.parseInt(valor_entrada[1]);

        if (codigo == 1) {
            Double preco = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (codigo == 2) {
            Double preco = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (codigo == 3) {
            Double preco = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (codigo == 4) {
            Double preco = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f\n", preco);
        } else if (codigo == 5) {
            Double preco = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f\n", preco);
        }
    }
}
