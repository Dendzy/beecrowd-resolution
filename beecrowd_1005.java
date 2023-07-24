import java.util.Scanner;
import java.util.Locale; 

public class beecrowd_1005 {
    public static void main (String [] args) { //Sempre colocar o "public class Main"
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
