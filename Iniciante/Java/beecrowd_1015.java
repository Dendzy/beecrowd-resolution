import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","

public class beecrowd_1015 { //Sempre colocar o "public class Main"
    public static void main(String[] args) {
        // Solução -
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String[] ponto1 = leitor.nextLine().split(" ");
        String[] ponto2 = leitor.nextLine().split(" ");

        Double x1 = Double.parseDouble(ponto1[0]);
        Double y1 = Double.parseDouble(ponto1[1]);
        Double x2 = Double.parseDouble(ponto2[0]);
        Double y2 = Double.parseDouble(ponto2[1]);

        Double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("%.4f\n", distancia);
    }
}
