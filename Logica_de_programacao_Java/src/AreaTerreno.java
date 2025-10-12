import java.util.Scanner;

public class AreaTerreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬¬¬¬¬¬¬¬¬¬ CALCULE QUANTO VALE O SEU TERRENO ¬¬¬¬¬¬¬¬¬¬\n");

        System.out.print("Informe em metros o tamanho frontal do terreno: ");
        double frente = scanner.nextDouble();

        System.out.print("Informe em metros o tamanho lateral do terreno: ");
        double lateral = scanner.nextDouble();

        System.out.print("Informe o valor do metro quadrado na região do terreno: R$");
        double valor_m2 = scanner.nextDouble();

        double area = frente * lateral;
        double valor_terreno = area * valor_m2;

        System.out.printf("\nÁrea total do terreno: %.1fm²\nValor total do terreno: R$%.2f", area, valor_terreno);

        scanner.close();
    }
    
}
