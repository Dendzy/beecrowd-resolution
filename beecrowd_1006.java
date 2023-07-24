import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; //Usada para representrar uma região geográfica

public class beecrowd_1006 {
    public static void main (String [] args) { //Sempre colocar o "public class Main"
       // Solução -
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = Double.parseDouble(leitor.nextLine());
        double B = Double.parseDouble(leitor.nextLine());
        double C = Double.parseDouble(leitor.nextLine());
        double media = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10.0;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
