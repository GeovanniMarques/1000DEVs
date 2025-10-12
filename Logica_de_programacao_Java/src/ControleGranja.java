import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleGranja {
    public static void main(String[] args) {
        float chip_identificacao = 4.00f;
        float chip_alimentacao = 3.50f;
        float custo_total;


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¬¬¬¬¬¬¬¬¬¬ CUSTO DE IDENTIFICAÇÃO - GRANJA ¬¬¬¬¬¬¬¬¬¬\n");
    
            System.out.print("Por gentileza, informe a quantidade de frango que há na granja FrangoTech: ");
            int frangos = scanner.nextInt();
    
            if (frangos < 0) {
                System.err.println("ERRO: informe um valor válido.");
                return;
            } else {
                custo_total = frangos * (chip_identificacao + (chip_alimentacao * 2));
            }
            
            System.out.printf("\nCusto total para identificação dos frangos: R$%.2f", custo_total);
        } catch (InputMismatchException e) {
            System.err.println("Ocorreu um erro inesperado, tente novamente.");
        }
        
    }
}
