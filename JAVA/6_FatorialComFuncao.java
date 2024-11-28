import java.util.Scanner;

public class FatorialComFuncao {
    public static int calcularFatorial(int n) {
        if (n <= 1) return 1;
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        System.out.println("O fatorial de " + numero + " é: " + calcularFatorial(numero));
        scanner.close();
    }
}
