import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1046 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Scanner input = new Scanner(System.in);

        String [] horas = input.nextLine().split(" ");

        int hora_inicial = Integer.parseInt(horas [0]);
        int hora_final = Integer.parseInt(horas[1]);
        int hora_de_jogo = 0;

        if (hora_inicial > hora_final) {
            hora_de_jogo = (24 - (hora_inicial - hora_final));
            System.out.println("O JOGO DUROU " +hora_de_jogo + " HORA(S)");
        } else if (hora_final > hora_inicial) {
            hora_de_jogo = hora_final - hora_inicial;
            System.out.println("O JOGO DUROU " +hora_de_jogo + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}