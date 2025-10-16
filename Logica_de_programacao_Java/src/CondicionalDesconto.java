import java.util.InputMismatchException;
import java.util.Scanner;

public class CondicionalDesconto {
    public static void main(String[] args) {
        limparTela();
        
        float salario_bruto, salario_liquido, descontos, ir, inss, sindicato, fgts;
        float taxa_inss, taxa_ir = 0, taxa_sindicato = 3;

         try (Scanner scanner = new Scanner(System.in)) {

            // Entrada de informações
            System.out.print("Por gentileza, informe a quantidade de horas trabalhadas neste mês: ");
            float horas_trabalhadas = scanner.nextFloat();
            
            System.out.print("Agora, informe o valor de cada hora trabalhada: ");
            float valor_hora = scanner.nextFloat();
    
            if (horas_trabalhadas < 0 || valor_hora <= 0) {
                System.err.println("ERRO: insira uma informação válida para horas trabalhadas e seu valor.");
                return;
            } 

            // Processamento

            // Cálculo de salário bruto
            salario_bruto = horas_trabalhadas * valor_hora;
    
            // Condicional para definição de descontos
            if (salario_bruto <= 900) {
                ir = 0.00f;
                taxa_inss = 7.5f;
                inss = (salario_bruto * taxa_inss) / 100;

            } else if (salario_bruto <= 1500) {
                taxa_ir = 5.0f;
                ir = (salario_bruto * taxa_ir) / 100;
                taxa_inss = 7.5f;
                inss = (salario_bruto * taxa_inss) / 100;

            } else if (salario_bruto <= 2500) {
                taxa_ir = 10.0f;
                ir = (salario_bruto * taxa_ir) / 100;
                taxa_inss = 9.0f;
                inss = (salario_bruto * taxa_inss) / 100;

            } else {
                // Posteriormente, melhorar este bloco de código
                taxa_ir = 20.0f;
                ir = (salario_bruto * taxa_ir) / 100;
                taxa_inss = 12.0f;
                inss = (salario_bruto * taxa_inss) / 100;

            }

            // Cálculo de FGTS e sindicato
            sindicato = (salario_bruto * taxa_sindicato) / 100;
            fgts = salario_bruto * 0.11f;
    
            // Cálculo de descontos e salário líquido
            descontos = ir + inss + sindicato;
            salario_liquido = salario_bruto - descontos;

            // Exibição de informações
            System.out.printf("\nQuantidade de horas trabalhadas: %.2f\nValor da hora trabalhada: R$%.2f", horas_trabalhadas, valor_hora);

            // %-35s - Alinha a esquerda e ocupa 35 espaços
            // %25s - Alinha a direita e ocupa 25 espaços
            System.out.println("\n\n+-------------------------------------+-------------------------+");
            System.out.printf("| %-35s | %25s\n", "Informações", "Valores |");
            System.out.println("+-------------------------------------+-------------------------+");
            System.out.printf("| %-35s : R$ %20.2f |\n", "Salário bruto ("+ horas_trabalhadas + " * " + valor_hora + ")", salario_bruto);
            System.out.printf("| %-35s : R$ %20.2f |\n", "(-) IR (" + taxa_ir + "%)", ir);
            System.out.printf("| %-35s : R$ %20.2f |\n", "(-) INSS (" + taxa_inss + "%)", inss);
            System.out.printf("| %-35s : R$ %20.2f |\n", "(-) Sindicato (" + taxa_sindicato + "%)", sindicato);
            System.out.printf("| %-35s : R$ %20.2f |\n", "FGTS (11%)", fgts);
            System.out.printf("| %-35s : R$ %20.2f |\n", "Total de descontos", descontos);
            System.out.println("+-------------------------------------+-------------------------+");
            System.out.printf("| %-35s : R$ %20.2f |\n", "Salário líquido", salario_liquido);
            System.out.println("+-------------------------------------+-------------------------+");
            
        } catch (InputMismatchException e) {
            System.err.println("ERRO: informe uma entrada válida (numérica).");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado, tente novamente.");
            e.printStackTrace();
        }
    }

    public static void limparTela() {
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("Erro ao limpar a tela.");
            e.printStackTrace();
        }
    }
}