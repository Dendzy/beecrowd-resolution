import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1008 { //Sempre colocar o "public class Main"
    public static void main (String [] args) { 
        // Solução - 
        Scanner leitor = new Scanner(System.in);

        int num = Integer.parseInt(leitor.nextLine());
        int hora = Integer.parseInt(leitor.nextLine());
        double valorHoraTrabalhada = Double.parseDouble(leitor.nextLine());
        double salario = hora * valorHoraTrabalhada;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);


    }
}
