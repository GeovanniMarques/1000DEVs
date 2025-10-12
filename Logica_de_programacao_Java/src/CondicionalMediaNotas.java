import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalMediaNotas {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "¬¬¬¬¬¬¬¬¬¬ DIÁRIO DE MATÉRIAS ¬¬¬¬¬¬¬¬¬¬\n\nPor gentileza, abaixo informe as notas referentes as provas do aluno, entre 0 e 10,\na quantidade de aulas ministradas e as faltas do aluno.\n");

            System.out.print("Informe a 1ª nota do aluno: ");
            float nota1 = scanner.nextFloat();

            System.out.print("Informe a 2ª nota do aluno: ");
            float nota2 = scanner.nextFloat();

            System.out.print("Informe a 3ª nota do aluno: ");
            float nota3 = scanner.nextFloat();

            System.out.print("Informe a 4ª nota do aluno: ");
            float nota4 = scanner.nextFloat();

            System.out.print("Informe a quantidade de aulas ministradas: ");
            int aulas = scanner.nextInt();

            System.out.print("Informe a quantidade faltas do aluno: ");
            int faltas = scanner.nextInt();

            if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)
                    || (nota4 < 0 || nota4 > 10)) {
                        
                System.err.println("ERRO: Informe notas de 0 a 10.");
                return;
            } 
            
            if ((aulas < 0) || (faltas < 0)) {
                System.err.println("\nERRO: informe valores positivos para aulas/faltas.");
                return;
            } 
            
            if (aulas == 0) {
                System.err.println("\nERRO: a quantidade de aulas ministradas não pode ser zero (0).");
                return;
            }

            float media = (nota1 + nota2 + nota3 + nota4) / 4;
            float percentualFaltas = ((float)faltas * 100.0f) / aulas;

            if (percentualFaltas > 25) {
                System.out.printf("\nPercentual de faltas: %.1f%% - Aluno reprovado por faltas", percentualFaltas);
            } else if (media >= 6) {
                System.out.printf("\nMédia final: %.1f - Aluno aprovado.", media);
            } else if (media >= 3 && media < 6) {
                System.out.printf("\nMédia final: %.1f - Aluno em recuperação.", media);
            } else {
                System.out.printf("\nMédia final: %.1f - Aluno reprovado.", media);
            }
        } catch (InputMismatchException e) {
            System.err.println("\nERRO: informe uma entrada válida (números).");
        } catch (Exception e) {
            System.err.println("\nOcorreu um erro desconhecido, tente novamente.");
            // e.PrintStackTrace();
        }

    }
}
