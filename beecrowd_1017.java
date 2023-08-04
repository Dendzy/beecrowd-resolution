import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.


public class beecrowd_1017 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Scanner leitor = new Scanner(System.in);
        
        Double km_por_litro = 12.0;
        int tempo_gasto = Integer.parseInt(leitor.nextLine());
        int velocidade_media = Integer.parseInt(leitor.nextLine());

        Double distancia_percorrida = (double) (velocidade_media * tempo_gasto );
        Double gasto_gasolina = distancia_percorrida / km_por_litro;

        System.out.printf("%.3f\n", gasto_gasolina);
    }
}
