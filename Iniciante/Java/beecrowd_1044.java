import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1044 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Scanner input = new Scanner(System.in);

        String numeros[] = input.nextLine().split(" ");

        int num1 = Integer.parseInt(numeros[0]);
        int num2 = Integer.parseInt(numeros[1]);

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}