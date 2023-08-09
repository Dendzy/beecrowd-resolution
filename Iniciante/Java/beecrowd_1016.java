import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1016 { //Sempre colocar o "public class Main"
    public static void main (String[] args) {
        // Solução -
        Scanner leitor = new Scanner(System.in);

        int distancia = Integer.parseInt(leitor.nextLine());

        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");
    }
}
