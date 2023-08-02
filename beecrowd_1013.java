import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1013 { 
    public static void main (String [] args) { //Sempre colocar o "public class Main"
        // Solução - 
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int maior_AB = (a + b + Math.abs(a - b)) / 2;
        int o_maior = (maior_AB + c + Math.abs(maior_AB - c)) / 2;

        System.out.println(o_maior + " eh o maior");
    } 
}
