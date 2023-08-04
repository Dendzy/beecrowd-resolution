import java.util.Scanner;

public class beecrowd_1018 {
    public static void main(String [] args) {
        
        Scanner leitor = new Scanner(System.in);

        int cedula = Integer.parseInt(leitor.nextLine());
        int cont_cedula_100 = 0;
        int cont_cedula_50 = 0;
        int cont_cedula_20 = 0;
        int cont_cedula_10 = 0;
        int cont_cedula_5 = 0;
        int cont_cedula_2 = 0;
        int cont_cedula_1 = 0;
        
        System.out.println(cedula);
        
        while (cedula >= 100) {
            cedula = cedula - 100;
            cont_cedula_100++;
        }
        
        while (cedula >= 50) {
            cedula = cedula - 50;
            cont_cedula_50++;
        }
        while (cedula >= 20) {
            cedula = cedula - 20;
            cont_cedula_20++;
        }
        while (cedula >= 10) {
            cedula = cedula - 10;
            cont_cedula_10++;
        }
        while (cedula >= 5) {
            cedula = cedula - 5;
            cont_cedula_5++;
        }
        while (cedula >= 2) {
            cedula = cedula - 2;
            cont_cedula_2++;
        }
        while (cedula >= 1) {
            cedula = cedula - 1;
            cont_cedula_1++;
        }

        System.out.println(cont_cedula_100 + " nota(s) de R$ 100,00");
        System.out.println(cont_cedula_50 + " nota(s) de R$ 50,00");
        System.out.println(cont_cedula_20 + " nota(s) de R$ 20,00");
        System.out.println(cont_cedula_10 + " nota(s) de R$ 10,00");
        System.out.println(cont_cedula_5 + " nota(s) de R$ 5,00");
        System.out.println(cont_cedula_2 + " nota(s) de R$ 2,00");
        System.out.println(cont_cedula_1 + " nota(s) de R$ 1,00");
    }
}
