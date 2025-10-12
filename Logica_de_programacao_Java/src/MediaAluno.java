import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ CALCULADORA DE MÉDIA ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬\n");

        System.out.print("Por gentileza, informe a 1ª nota: ");
        double notaUm = scanner.nextDouble();

        System.out.print("Por gentileza, informe a 2ª nota: ");
        double notaDois = scanner.nextDouble();

        double media = (notaUm + notaDois) / 2;

        System.out.printf("\nA média final do aluno foi: %.2f", media);
        
        scanner.close();
    }
}
