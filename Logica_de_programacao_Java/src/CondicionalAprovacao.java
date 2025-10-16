import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalAprovacao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe a 1ª nota do aluno: ");
            float notaUm = scanner.nextFloat();

            System.out.print("Informe a 2ª nota do aluno: ");
            float notaDois = scanner.nextFloat();

            if ((notaUm < 0 || notaUm > 10) || (notaDois < 0 || notaDois > 10)) {
                System.err.println("\nERRO: informe valores entre 0 e 10 para as notas.");
                return;
            }

            float media = (notaUm + notaDois) / 2;

            if (media == 10) {
                System.out.printf("\nMédia: %.1f - Aluno aprovado com distinção", media);
            } else if (media >= 7) {
                System.out.printf("\nMédia: %.1f - Aluno aprovado", media);
            } else {
                System.out.printf("\nMédia: %.1f - Aluno reprovado", media);
            }

        } catch (InputMismatchException e) {
            System.err.println("\nERRO: informe uma entrada válida (numérica)");
        } catch (Exception e) {
            System.err.println("\nOcorreu um erro inesperado, tente novamente.");
        }
    }
}