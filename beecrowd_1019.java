import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1019 { //Sempre colocar o "public class Main"
    public static void main(String[] args) {
        // Solução -
        Scanner leitor = new Scanner(System.in);

        int cont_horas = 0;
        int cont_minutos = 0;
        int cont_segundos = 0;
        int segundos = Integer.parseInt(leitor.nextLine());
        while (segundos != 0) {
            if (segundos >= 3600){
                segundos = segundos - 3600;
                cont_horas++;
            } else if (segundos >= 60) {
                segundos = segundos - 60;
                cont_minutos++;
            } else {
                cont_segundos = segundos;
                segundos = 0;
        }
    }
        System.out.println(cont_horas + ":" + cont_minutos + ":" + cont_segundos);
    }
}
