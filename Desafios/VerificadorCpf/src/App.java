import java.util.Scanner;
//java.lang.StringIndexOutOfBoundsException

public class App {
    public static void main(String[] args) {
        // Definição de variáveis
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, dv1, dv2;
        int soma, resto, verificador;

        // Realiza limpeza de terminal a cada inicialização do programa
        limparTela();

        Scanner scanner = new Scanner(System.in);
    
        // Entrada de dados
        System.out.println("+-------------------- VERIFICADOR DE CPF --------------------+\n");
        System.out.print("Por gentileza, informe o CPF para verificação: ");
        String cpf = scanner.nextLine();
        
        //Processamento

        //Conversão de String para int
        d1 = cpf.charAt(0) - 48;
        d2 = cpf.charAt(1) - 48;
        d3 = cpf.charAt(2) - 48;
        d4 = cpf.charAt(3) - 48;
        d5 = cpf.charAt(4) - 48;
        d6 = cpf.charAt(5) - 48;
        d7 = cpf.charAt(6) - 48;
        d8 = cpf.charAt(7) - 48;
        d9 = cpf.charAt(8) - 48;
        dv1 = cpf.charAt(9) - 48;
        dv2 = cpf.charAt(10) - 48;

        // Fechamento de Scanner
        scanner.close();

        //Cálculo para validação do 1ª dígito verificador
        soma = (d1 * 10) + (d2 * 9) + (d3 * 8) + (d4 * 7) + (d5 * 6) + (d6 * 5) + (d7 * 4) + (d8 * 3) + (d9 * 2);

        resto = soma % 11;

        if (resto < 2) {
            verificador = 0;
        } else {
            verificador = 11 - resto;
        }

        if (dv1 != verificador) {
            System.out.println("\nCPF inválido");
            return;
        }

        //Cálculo para validação do 2ª dígito verificador
        soma = (d1 * 11) + (d2 * 10) + (d3 * 9) + (d4 * 8) + (d5 * 7) + (d6 * 6) + (d7 * 5) + (d8 * 4) + (d9 * 3) + (dv1 * 2);

        resto = soma % 11;

        if (resto < 2) {
            verificador = 0;
        } else {
            verificador = 11 - resto;
        }

        if (dv2 != verificador) {
            System.out.println("\nCPF inválido");
            return;
        }
        
        System.out.printf("\nCPF informado (%s) é válido.", cpf);
        System.out.printf("\nDígito verificador 1: %d\nDígito verificador 2: %d", dv1, dv2);
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
            System.err.println("Erro ao tentar limpar a tela;");
        }
    }
}
