import java.util.Scanner;

public class QuantidadeSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬¬¬¬¬¬¬¬¬¬ QUANTIDADE DE SALÁRIOS RECEBIDOS ¬¬¬¬¬¬¬¬¬¬\n");

        System.out.print("Informe o valor atual do salário mínimo: R$");
        double salario_minimo = scanner.nextDouble();

        System.out.print("Informe o valor atual do salário do funcionário: R$");
        double salario_funcionario = scanner.nextDouble();
        
        double quantidade_salarios = salario_funcionario / salario_minimo;

        System.out.printf("\nO funcionário recebe %.1f salários mínimos", quantidade_salarios);
        
        scanner.close();
    }
}