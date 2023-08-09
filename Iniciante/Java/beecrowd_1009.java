import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1009 { //Sempre colocar o "public class Main"
    public static void main (String [] args){
        // Solução - 
        Scanner leitor = new Scanner(System.in);
        
        String nome_vendedor = leitor.nextLine();
        Double salario_fixo = Double.parseDouble(leitor.nextLine());
        Double vendas = Double.parseDouble(leitor.nextLine());

        Double comissao = (vendas * 0.15) + salario_fixo;
        System.out.printf("TOTAL = R$ %.2f\n", comissao);
    }
    
}
