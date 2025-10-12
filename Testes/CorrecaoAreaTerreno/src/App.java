import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float frenteMts, lateralMts, area;
        float valorMetroQuadrado, valorTerreno;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite a metragem da frente do terreno: ");
            frenteMts = teclado.nextFloat();
            
            System.out.print("Digite a metragem da lateral do terreno: ");
            lateralMts = teclado.nextFloat();
            
            System.out.print("Digite o valor do metro quadrado: R$");
            valorMetroQuadrado = teclado.nextFloat();

            // bloco de código para verificar se alguma entrada informada é 0
            if ((frenteMts == 0) || (lateralMts == 0)) {
                System.err.println("\nERRO: não é possível dimensionar área de um terreno com um dos lados de tamanho igual a 0.");
                return;
            }
            
            if ((valorMetroQuadrado == 0)) {
                System.err.println("\nERRO: não é possível calcular valor do terreno com valor do m² igual a 0.");
                return;
            }

            // calculando área e valor do terreno
            area = frenteMts * lateralMts;
            valorTerreno = area * valorMetroQuadrado;

            // estrutura de decisão composta
            if (frenteMts == lateralMts) { // condicao para ver se é um quadrado
                valorTerreno *= 1.1f;
            } else {// se nao for quadrado da um desconto
                valorTerreno *= 0.98f;
            }

            System.out.printf("\nO valor do terreno é: R$%.2f", valorTerreno);
        } catch (InputMismatchException e) {
            System.err.println("\nERRO: entrada inválida. Informe valores númericos.");
        } catch (Exception e) {
            System.err.println("\nOcorreu um erro inesperado, tente novamente.");
            e.printStackTrace();
        }
    }
}