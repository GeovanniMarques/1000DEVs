import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalReajuste {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float novo_salario, percentual, valor_aumento;

            System.out.print("Informe o salário do funcionário: R$");
            float salario = scanner.nextFloat();

            if (salario <= 0) {
                System.err.println("\nERRO: informe um valor para salário maior que R$0,00");
                return;
            } else if (salario <= 280) {
                percentual = 0.2f;
                valor_aumento = salario * percentual;
                novo_salario = salario + valor_aumento;
            } else if (salario > 280 && salario <= 700) {
                percentual = 0.15f;
                valor_aumento = salario * percentual;
                novo_salario = salario + valor_aumento;
            } else if (salario > 700 && salario <= 1500) {
                percentual = 0.10f;
                valor_aumento = salario * percentual;
                novo_salario = salario + valor_aumento;
            } else {
                    percentual = 0.05f;
                    valor_aumento = salario * percentual;
                    novo_salario = salario + valor_aumento;
            }

            System.out.printf("\nSalário atual: R$%.2f", salario);
            System.out.printf("\nPercentual de aumento aplicado: %.2f%%", percentual);
            System.out.printf("\nValor de aumento: R$%.2f", valor_aumento);
            System.out.printf("\nSalário reajustado: R$%.2f", novo_salario);
            
        } catch (InputMismatchException e) {
            System.err.println("\nERRO: informe uma entrada válida (numérica).");
        } catch (Exception e) {
            System.err.println("\nOcorreu um erro inesperado, tente novamente.");
            e.printStackTrace();
        }
    }
}
