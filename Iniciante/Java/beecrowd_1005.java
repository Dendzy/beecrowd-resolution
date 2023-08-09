import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; //Usada para representrar uma região geográfica

public class beecrowd_1005 { //Sempre colocar o "public class Main"
    public static void main (String [] args) { 
       // Solução -
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = Double.parseDouble(leitor.nextLine());
        double B = Double.parseDouble(leitor.nextLine());
        double media = ((A * 3.5) + (B * 7.5)) / 11.0;
        System.out.printf("MEDIA = %.5f\n", media);
        // Não façam a burrice de esquecer o \n nesse print, que dará errado.
    }
}
