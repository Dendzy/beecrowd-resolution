import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1002 { //Sempre colocar o "public class Main"
    public static void main(String [] args){
        // Solução -
        Scanner leitor = new Scanner(System.in);

        Double raio = Double.parseDouble(leitor.nextLine());
        Double pi = 3.14159;
        Double area = pi * (raio * raio);
        System.out.printf("A=%.4f\n", area);
    }
}
