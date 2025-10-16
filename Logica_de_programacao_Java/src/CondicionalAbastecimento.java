import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalAbastecimento {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float valor_total;
            float alcool = 3.9f;
            float gasolina = 5.5f;

            System.out.print("Informe a quantidade de litros abastecida: ");
            float litros = scanner.nextFloat();

            System.out.print("Informe o combustível utilizado no abastecimento:\n[1] - Álcool | [2] - Gasolina: ");
            int tipo_combustivel = scanner.nextInt();

            if (litros <= 20 && tipo_combustivel == 1) {
                valor_total = (alcool * litros) * 0.97f;
            } else if (litros > 20 && tipo_combustivel == 1) {
                valor_total = (alcool * litros) * 0.94f;
            } else if (litros <= 20 && tipo_combustivel == 2) {
                valor_total = (gasolina * litros) * 0.97f;
            } else {
                valor_total = (gasolina * litros) * 0.94f;
            }

            System.out.printf("\nValor total: R$%.2f", valor_total);
        } catch (InputMismatchException e) {
            System.err.println("\nERRO: informe uma entrada válida (numérica).");
        } catch (Exception e) {
            System.err.println("\nOcorreu um erro inesperado, tente novamente.");
            e.printStackTrace();
        }
    }
}