import java.util.Scanner; //LEMBRE DE IMPORTAR O SCANNER PARA AS ENTRADAS DO USUÁRIO.
import java.util.Locale; // IMPORTAR PARA USAR O "." AO INVÉS DAS ","
import java.text.DecimalFormat; // Deu alguns erros pra mim no beecrowd, usei esse método pra ajudar.

public class beecrowd_1040 { //Sempre colocar o "public class Main"
    public static void main (String [] args) {
        // Solução -
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");

        Float nota1 = input.nextFloat();
        Float nota2 = input.nextFloat();
        Float nota3 = input.nextFloat();
        Float nota4 = input.nextFloat();

        Float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");

        } else if (media < 5) {
            System.out.println("Aluno reprovado.");

        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em exame.");

            Float nota_exame_final = input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", nota_exame_final);

            Float nova_media = (nota_exame_final + media) / 2;
            if (nova_media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", nova_media);
        }
    }
}
