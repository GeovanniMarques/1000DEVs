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

        // Objeto para leitura de arquivo
        File arquivo = new File("palavras.txt");

        // Objeto para escolha aleatória de palavra (recebendo o tamanho da lista
        // palavras como parâmetro)
        Random gerador = new Random();

        // Declaração de variáveis
        String linha; // recebe cada linha do arquivo
        int palavra_selecionada;

        // Realiza limpeza de terminal a cada inicialização do programa
        limparTela();

        try (Scanner scanner = new Scanner(arquivo)) {
            while (scanner.hasNextLine()) {
                linha = scanner.nextLine();
                palavras.add(linha);
            }

            palavra_selecionada = gerador.nextInt(palavras.size());
            System.out.println(palavra_selecionada);
            System.out.println(palavras.get(palavra_selecionada));

        } catch (FileNotFoundException e) {
            System.err.println("ERRO.");
            // e.printStackTrace();
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
