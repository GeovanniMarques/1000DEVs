import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalHortiFruti {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float peso_total, valor_total, valor_morango, valor_maca;

            System.out.print("Informe o peso total comprado de morangos: ");
            float peso_morango = scanner.nextFloat();

            System.out.print("Informe o peso total comprado de maça: ");
            float peso_maca = scanner.nextFloat();

            if (peso_morango <= 5.0f) {
                valor_morango = 2.5f;
            } else {
                valor_morango = 2.2f;
            }

            if (peso_maca <= 5.0f) {
                valor_maca = 1.8f;
            } else {
                valor_maca = 1.5f;
            }

            peso_total = peso_morango + peso_maca;
            valor_total = (valor_morango * peso_morango) + (valor_maca * peso_maca);

            if (peso_total > 8.0f || valor_total > 25.0f) {
                valor_total *= 0.90f;
            }

            System.out.printf("\nValor total a ser pago: R$%.2f", valor_total);

        } catch (InputMismatchException e) {
            System.err.println("\nERRO: informe uma entrada válida (numérica).");
        } catch (Exception e) {
            System.err.println("\nOcorreu um erro inesperado, tente novamente.");
            e.printStackTrace();
        }

    }
}
