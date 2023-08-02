import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","

public class beecrowd_1014 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução - 
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x = Integer.parseInt(leitor.nextLine());
        double y = Double.parseDouble(leitor.nextLine());

        double consumo_medio = x / y;
        System.out.printf("%.3f km/l\n", consumo_medio);
    }
}
