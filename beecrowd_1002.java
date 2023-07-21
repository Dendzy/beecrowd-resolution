import java.util.Scanner;
import java.io.IOException;

public class beecrowd_1002 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        Double raio = Double.parseDouble(leitor.nextLine());
        Double pi = 3.14159;
        Double area = pi * (raio * raio);
        System.out.printf("A=%.4f\n", area);

    }
}
