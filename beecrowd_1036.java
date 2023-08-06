import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","

public class beecrowd_1036 { //Sempre colocar o "public class Main"
    public static void main(String [] args) {
        // Solução -
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        String numeros [] = input.nextLine().split(" ");

        Double a = Double.parseDouble(numeros[0]);
        Double b = Double.parseDouble(numeros[1]);
        Double c = Double.parseDouble(numeros[2]);

        double delta = Math.sqrt((b * b) - (4 * a * c));
 
        Double r1 = (-b + delta) / (2 * a);
        Double r2 = (-b - delta) / (2 * a);

        Double raiz_negativa = Math.sqrt(Math.pow(b,2) - (4 * a * c));

        if (a == 0 || Double.isNaN(raiz_negativa)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}
