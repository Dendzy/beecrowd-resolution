import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1042 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
                System.out.println(num1);
                if (num2 < num3) {
                    System.out.println(num2);
                    System.out.println(num3);
                } else {
                    System.out.println(num3);
                    System.out.println(num2);
            }
        } else if (num2 < num1 && num2 < num3){
                System.out.println(num2);
                if (num1 < num3) {
                    System.out.println(num1);
                    System.out.println(num3);
                } else {
                    System.out.println(num3);
                    System.out.println(num1);
                }    
        } else {
            System.out.println(num3);
            if (num2 < num1) {
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }
        System.out.println("");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}