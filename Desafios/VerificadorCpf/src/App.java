import java.util.Scanner;
// import java.lang.StringIndexOutOfBoundsException

public class App {
    public static void main(String[] args) {
        // Definição de variáveis
        int soma = 0, multiplicador = 10, resto, verificador;
        int[] digitos = new int[11];

        // Realiza limpeza de terminal a cada inicialização do programa
        limparTela();

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
        System.out.println("+-------------------- VERIFICADOR DE CPF --------------------+\n");
        System.out.print("Por gentileza, informe o CPF para verificação: ");
        String cpf = scanner.nextLine().replaceAll("[.-]", "");
        
        //Processamento

        //Conversão de String para int
        for (int i = 0; i < 11; i++) {
            digitos[i] = cpf.charAt(i) - 48;

            if(i < 9) {
                soma += (digitos[i] * multiplicador);
                multiplicador--;
            }
        }

        resto = soma % 11;

        if (resto < 2) {
            verificador = 0;
        } else {
            verificador = 11 - resto;
        }

        // Comparação de cálculo com 1º dígito verificador
        if (digitos[9] != verificador) {
            System.out.printf("\nCPF (%s) inválido!", cpf);
            return;
        }

        //Cálculo para validação do 2ª dígito verificador
        multiplicador = 11;
        
        for (int i = 0; i < 10; i++) {
            soma += (digitos[i] * multiplicador);
            multiplicador--;
        }

        resto = soma % 11;

        if (resto < 2) {
            verificador = 0;
        } else {
            verificador = 11 - resto;
        }

        // Comparação de cálculo com 2º dígito verificador
        if (digitos[10] != verificador) {
            System.out.printf("\nCPF (%s) inválido!", cpf);
            return;
        }
        
        // Saída
        System.out.printf("\nCPF informado (%s) é válido.", cpf);
        System.out.printf("\n\n1º dígito verificador: %d\n2º dígito verificador: %d", digitos[9], digitos[10]);
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado.");
        }
        
    }

    // Método para limpeza de terminal
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
