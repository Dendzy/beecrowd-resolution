import java.util.Scanner;

public class beecrowd_1011 {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);

        Double raio = Double.parseDouble(leitor.nextLine());
        Double pi = 3.14159;
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3); 
        // Math.pow faz a potência de um número (a) elevado ao número (b)
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
