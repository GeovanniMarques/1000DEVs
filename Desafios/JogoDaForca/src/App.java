import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Instanciamento de objetos

        // Armazena cada linha do arquivo
        ArrayList<String> palavras = new ArrayList<>();

        // Armazena letras inseridas pelo usuário
        ArrayList<Character> letras_inseridas = new ArrayList<>();

        // Objeto para leitura de arquivo
        File arquivo = new File("./palavras.txt");

        // Objeto para escolha aleatória de palavra (recebendo o tamanho da lista
        // palavras como parâmetro)
        Random gerador = new Random();

        // Declaração de variáveis
        String linha_arquivo; // Recebe cada linha do arquivo
        char palpite; // Recebe o palpite do usuário
        char[] palavra_selecionada; // Recebe a palavra selecionada para o jogo
        boolean erro = false; // Verificação de erro em palpite do usuário
        int numero_palavra; // Variável que recebe o número aleatório gerado para escolha de palavra
        int vidas = 6; // Contador de vidas disponíveis no jogo

        // Verificação de arquivo e definição de palavra secreta
        try (Scanner leitor_arquivo = new Scanner(arquivo)) {
            if (arquivo.length() == 0) {
                System.err.println("ERRO: arquivo selecionado não contém dados.");
                return;
            }

            while (leitor_arquivo.hasNextLine()) {
                linha_arquivo = leitor_arquivo.nextLine();
                palavras.add(linha_arquivo);
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERRO: arquivo selecionado não foi encontrado.");
            System.err.println(e.getMessage());
        }

        try (Scanner teclado = new Scanner(System.in)) {
            // Escolha aleatória de palavra para jogo
            numero_palavra = gerador.nextInt(0, palavras.size() - 1);
            palavra_selecionada = palavras.get(numero_palavra).toCharArray();

            // Looping para permissão de palpite enquanto houver vidas disponíveis
            while (vidas > 0) {
                // Realiza limpeza de terminal a cada palpite inserido
                limparTela();

                // Exibição de informações referentes ao jogo
                System.out.printf("Vidas restantes: %d", vidas);
                System.out.print("\nLetras inseridas: ");
                for (char letra : letras_inseridas) {
                    System.out.print(letra);
                }

                switch (vidas) {
                    case 6:
                        System.out.println("\n");
                        System.out.println("  +---+");
                        System.out.println("  |   |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("  =========");
                        break;
                    case 5:
                        System.out.println("\n");
                        System.out.println("  +---+");
                        System.out.println("  |   |");
                        System.out.println("  O   |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("  =========");
                        break;
                    case 4:
                        System.out.println("\n");
                        System.out.println("  +---+");
                        System.out.println("  |   |");
                        System.out.println("  O   |");
                        System.out.println("  |   |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("  =========");
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("  +---+");
                        System.out.println("  |   |");
                        System.out.println("  O   |");
                        System.out.println(" /|   |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("  =========");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("  +---+");
                        System.out.println("  |   |");
                        System.out.println("  O   |");
                        System.out.println(" /|\\  |");
                        System.out.println("      |");
                        System.out.println("      |");
                        System.out.println("  =========");
                        break;
                    case 1:
                        System.out.println("\n");
                        System.out.println("  +---+");
                        System.out.println("  |   |");
                        System.out.println("  O   |");
                        System.out.println(" /|\\  |");
                        System.out.println(" /    |");
                        System.out.println("      |");
                        System.out.println("  =========");
                        break;
                }

                for (char letra : palavra_selecionada) {
                    if (letra == palpite) {
                        System.out.printf("_%s_ ", letra);
                    } else {
                        System.out.print("___ ");
                    }
                }

                if (erro) {
                    System.out.println("\n\nERRO: insira somente uma letra em seu palpite.");
                }

                // Entrada de palpite de usuário
                System.out.print("\n\nDigite uma letra: ");
                palpite = teclado.next().charAt(0);

                // Ideal verificar se é um número
                if (palpite == 1) {
                    erro = false;

                    while (letras_inseridas.contains(palpite)) {
                        System.out.print("Letra já inserida, digite outra: ");
                        palpite = teclado.next().charAt(0);
                    }

                    for (char letra : palavra_selecionada) {
                        int contador = 0;
                        if (letra == palpite) {
                            contador++;
                        } else {
                            contador++;
                        }
                    }

                    vidas--;
                    letras_inseridas.add(palpite);
                } else {
                    erro = true;
                }
            }

            if (vidas == 0) {
                // Realiza limpeza de terminal ao final de vidas disponíveis
                limparTela();

                // Exibição de informações referentes ao jogo
                System.out.printf("Você perdeu! A palavra secreta era: %s\n\n", palavra_selecionada);
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("  =========");
            }
        }

    }

    // Método para limpeza de terminal ao executar o programa
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
        }
    }
}