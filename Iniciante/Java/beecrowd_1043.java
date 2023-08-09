import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","

public class beecrowd_1043 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        boolean triangulo = false;

        if (num1 + num2 > num3 || num2 + num3 > num1 || num1 + num3 > num2) {
            if (num1 + num2 == num3 || num2 + num3 == num1 || num1 + num3 == num2) {
                triangulo = false;
            } else {
                triangulo = true;
            }
        }

        if (triangulo == true) {
            double perimetro = num1 + num2 + num3;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        } else if (triangulo == false) {
            double area = ((num1 + num2) * num3) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
