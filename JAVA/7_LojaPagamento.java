import java.util.Scanner;

public class LojaPagamento {
    public static void imprimirOpcoes() {
        System.out.println("Opções de pagamento:");
        System.out.println("1) À vista com 10% de desconto");
        System.out.println("2) Em duas vezes (preço da etiqueta)");
        System.out.println("3) De 3 até 10 vezes com 3% de juros ao mês (compras acima de R$ 100,00)");
    }

    public static void calcularPagamento(double total, int opcao, int parcelas) {
        switch (opcao) {
            case 1:
                System.out.printf("Total à vista: R$ %.2f%n", total * 0.9);
                break;
            case 2:
                System.out.printf("Parcelado em 2 vezes de: R$ %.2f%n", total / 2);
                break;
            case 3:
                if (total >= 100.0) {
                    double juros = total * Math.pow(1.03, parcelas);
                    System.out.printf("Parcelado em %d vezes de: R$ %.2f%n", parcelas, juros / parcelas);
                } else {
                    System.out.println("Opção inválida para valores abaixo de R$ 100,00.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o total gasto: ");
        double total = scanner.nextDouble();

        imprimirOpcoes();
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        int parcelas = 0;
        if (opcao == 3) {
            System.out.print("Informe o número de parcelas (de 3 a 10): ");
            parcelas = scanner.nextInt();
        }

        calcularPagamento(total, opcao, parcelas);
        scanner.close();
    }
}
