import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","

public class beecrowd_1012 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução - 
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Double A = Double.parseDouble(leitor.next());
        Double B = Double.parseDouble(leitor.next());
        Double C = Double.parseDouble(leitor.next());
        Double pi = 3.14159;

        Double area_triangulo = (A * C) / 2;
        Double area_circulo = pi * Math.pow(C, 2);
        Double area_trapezio = ((A + B) * C) / 2;
        Double area_quadrado = Math.pow(B, 2);
        Double area_retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", area_triangulo);
        System.out.printf("CIRCULO: %.3f\n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f\n", area_trapezio);
        System.out.printf("QUADRADO: %.3f\n", area_quadrado);
        System.out.printf("RETANGULO: %.3f\n", area_retangulo);
    }
}
