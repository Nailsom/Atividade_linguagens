import java.util.Scanner;

public class SalarioComissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas: ");
        double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome: " + nome);
        System.out.println("Salário Fixo: R$ " + salarioFixo);
        System.out.println("Salário Final: R$ " + salarioFinal);

        scanner.close();
    }
}
