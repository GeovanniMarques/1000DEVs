import java.util.InputMismatchException;
import java.util.Scanner;

public class ContraCheque {
    public static void main(String[] args) {

        float novo_salario;
        float inss;
        float fgts;
        float total_descontos;
        float salario_liquido;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¬¬¬¬¬¬¬¬¬¬ CALCULADORA DE SALÁRIO ¬¬¬¬¬¬¬¬¬¬\n");
    
            System.out.print("Informe o salário atual do funcionário: R$");
            float salario = scanner.nextFloat();
    
            if(salario <= 0) {
                System.err.println("ERRO: Informe valor válido.");
                return;
            } else {
                novo_salario = salario * 1.15f;
        
                inss = (novo_salario * 11) / 100;
                fgts = (novo_salario * 8) / 100;
        
                total_descontos = inss + fgts;
                salario_liquido = novo_salario - total_descontos;
            }
    
            System.out.printf("\nSalário inicial: R$%.2f\nSalário reajustado: R$%.2f\nDesconto do INSS (11%%): R$%.2f\nDesconto do FGTS (8%%): R$%.2f\nTotal de descontos: R$%.2f\n\nSalário final: R$%.2f", salario, novo_salario, inss, fgts, total_descontos, salario_liquido);

        } catch (InputMismatchException e) {
            System.err.println("ERRO: Informe um valor válido.");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado, tente novamente.");
        }

    }
}
