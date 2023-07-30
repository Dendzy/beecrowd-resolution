import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1134 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução - 
        Scanner leitor = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int i = Integer.parseInt(leitor.nextLine());
        while (i != 4) {
            if (i == 1) { 
                alcool++;
            } 
            else if (i == 2) {
                gasolina++;
            }
            else if (i == 3) {
                diesel++;
            }
            i = Integer.parseInt(leitor.nextLine());
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
