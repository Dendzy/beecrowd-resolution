import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.

public class beecrowd_1020 { //Sempre colocar o "public class Main"
    public static void main (String[] args) {
        // Solução -
        Scanner leitor = new Scanner(System.in);

        int cont_anos = 0;
        int cont_meses = 0;
        int cont_dias = 0;

        int dias = Integer.parseInt(leitor.nextLine());

        while (dias != 0) {
            if (dias >= 365){
                dias = dias - 365;
                cont_anos++;
            } else if (dias >= 30) {
                dias = dias - 30;
                cont_meses++;
            } else {
                cont_dias = dias;
                dias = 0;
        }
    }
        System.out.println(cont_anos + " ano(s)");
        System.out.println(cont_meses + " mes(es)");
        System.out.println(cont_dias + " dia(s)");
    }
}
