import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","
import java.util.Objects; 
/* Não estava saindo no terminal as comparações de igualdade,
 * acabei usando esse import para comparar os valores quando iguais e me retornar a saída.
 */

public class beecrowd_1045 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double c = input.nextDouble();
        Double ajuda = 0.0;

        if (a > b && a > c) {
            if (b > c) {
            } else {
                ajuda = c;
                c = b;
                b = ajuda;
            }
        } else if (b >= a && b > c) {
            ajuda = a;
            a = b;
            b = ajuda;
            if (b > c){
            } else {
                ajuda = b;
                b = c;
                c = ajuda;
            }
        } else if (c >= a && c >= b) {
            ajuda = a;
            a = c;
            c = ajuda;
            if (c > b) {
                ajuda = b;
                b = c;
                c = ajuda;
            }
        } 

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == ((Math.pow(b,2) + Math.pow(c,2)))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a,2) > (Math.pow(b,2) + Math.pow(c,2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a,2) < (Math.pow(b,2) + Math.pow(c,2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
        } 
        if (Objects.equals(a, b) && Objects.equals(b, c)) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((Objects.equals(a, b) && !Objects.equals(a, c)) || (Objects.equals(b, c) && !Objects.equals(b, a)) || (Objects.equals(a, c) && !Objects.equals(a, b))) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
