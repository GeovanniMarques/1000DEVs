/* 
 e.PrintStackTrace (uma ferramenta de depuração) - Por que não usá-lo em produção

- Questões de segurança: O stack trace pode conter detalhes confidenciais do sistema ou do código que não devem ser expostos ao usuário final. 
- "Lixo" no console: A exibição de um stack trace completo no console pode sobrecarregá-lo e dificultar a visualização de outras informações importantes, especialmente em sistemas com muitos erros. 
- Dificuldade de análise: Em ambientes de produção, é preferível usar um sistema de logging dedicado para capturar e analisar os erros em arquivos de log, que podem ser consultados posteriormente por desenvolvedores e equipes de suporte. 

Alternativas para produção
- Sistemas de logging: Em ambientes de produção, use bibliotecas de logging (como o Log4j ou SLF4j) para registrar as informações do erro de forma organizada e controlada. 
- Tratamento de exceções adequado: Implemente um tratamento de exceções robusto para que o programa possa continuar em execução ou para que o usuário receba uma mensagem de erro amigável e não exposta. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ferraduras {
    public static void main(String[] args) {
        
        int ferraduras_necessarias = 0;
        float valor_total = 0.0f;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¬¬¬¬¬¬¬¬¬¬ CALCULADORA DE FERRADURAS PARA CAVALOS ¬¬¬¬¬¬¬¬¬¬\n");
            
            System.out.print("Informe a quantidade de cavalos a serem equipados: ");
            int cavalos = scanner.nextInt();

            System.out.print("Informe o valor de custo de cada ferradura: R$");
            float valor_ferradura = scanner.nextFloat();
            
            if(cavalos <= 0 || valor_ferradura <= 0) { 
                //System.err é usado para imprimir a mensagem no console de erro
                System.err.println("Erro: entrada inválida. Informe um número inteiro positivo.");
            } else {
                ferraduras_necessarias = cavalos * 4;
                valor_total = valor_ferradura * ferraduras_necessarias;
            }
            
            System.out.printf("\nQuantidade de ferraduras necessárias para equipar os %d cavalos: %d\nValor total de custo das ferraduras: R$%.2f", cavalos, ferraduras_necessarias, valor_total);
        } catch (InputMismatchException e) {
            System.err.println("Erro: entrada inválida. Informe um número inteiro (sem letras ou símbolos).");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado. Tente novamente.");
            //Para ver o erro completo (usado somente no momento de desenvolvimento e depuração):
            //e.printStackTrace();
            //ou um sistema de log
        }

    }
}

