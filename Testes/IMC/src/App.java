import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float peso, altura, imc;
        String classificacao;

        try (Scanner scanner = new Scanner(System.in)) {    
            System.out.println("¬¬¬¬¬¬¬¬¬¬ CALCULADORA DE IMC ¬¬¬¬¬¬¬¬¬¬\n");
    
            // Entradas
            System.out.print("Por gentilieza, informe a sua altura (ex.: 1,80): ");
            altura = scanner.nextFloat();
    
            System.out.print("Agora, informe o seu peso corporal (ex.: 80): ");
            peso = scanner.nextFloat();
    
            // Processamento
    
            // Verificação de entradas negativas e 0
            if (altura <= 0) {
                System.err.println("\nERRO: informe um valor válido para altura (valores positivos).");
                return;
            }

            if (peso <= 0) {
                System.err.println("\nERRO: informe um valor válido para peso (valores positivos).");
                return;
            }
            
            // Cálculo de IMC
            imc = peso / (float)Math.pow(altura, 2);
            
            // Verificação de faixa e atribuição de classificação correspondente
            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc <= 24.9) {
                classificacao = "Peso normal";
            } else if (imc <= 29.9) {
                classificacao = "Sobrepeso";
            } else if (imc <= 34.9) {
                classificacao = "Obesidade grau I";
            } else if (imc <= 39.9) {
                classificacao = "Obesidade grau II";
            } else {
                classificacao = "Obesidade grau III (obesidade mórbida)";
            }
    
            // Saídas
            System.out.printf("\nValor do IMC calculado: %.1f\nClassificação: %s", imc, classificacao);
        } catch (InputMismatchException e) {
            System.err.println("\nERRO: informe uma entrada válida (numérica).");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado, tente novamente.");
        }

    }
}
