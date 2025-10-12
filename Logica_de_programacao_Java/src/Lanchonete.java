import java.util.InputMismatchException;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        float fatia_presunto = 0.050f;
        float fatia_queijo = 0.050f;
        float hamburguer = 0.120f;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¬¬¬¬¬¬¬¬¬¬ DIMENSIONAMENTO DE INGREDIENTES - HAMBURGUERIA ¬¬¬¬¬¬¬¬¬¬\n");

            System.out.print("Por gentileza, informe a quantidade sanduiches a serem feitos: ");
            int sanduiches = scanner.nextInt();

            if (sanduiches <= 0) {
                System.err.println("ERRO: informe um valor válido.");
                return;
            } else {
                fatia_presunto *= sanduiches;
                fatia_queijo *= (sanduiches * 2);
                hamburguer *= sanduiches;
            }

            System.out.printf(
                    "\nPara produzir %d sanduiches serão necessários:\n%.3fkg de mussarela\n%.3fkg de presunto\n%.3fkg de hamburguer",
                    sanduiches, fatia_queijo, fatia_presunto, hamburguer);
        } catch (InputMismatchException e) {
            System.err.println("ERRO: informe uma quantidade de sanduiches válida (sem letras e caracteres especiais).");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado, tente novamente.");
        }

    }
}
