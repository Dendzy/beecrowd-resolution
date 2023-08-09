import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1035 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Scanner input = new Scanner(System.in);

        String numeros [] = input.nextLine().split(" ");

        int a = Integer.parseInt(numeros[0]); 
        int b = Integer.parseInt(numeros[1]);
        int c = Integer.parseInt(numeros[2]);
        int d = Integer.parseInt(numeros[3]);

        if (b > c && d > a && (c+d) > (a+b) && c >= 0 && d >=0 && a %2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
