import java.util.Scanner;

public class Fatorial {
    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = n; i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        System.out.println("O fatorial de " + numero + " é: " + calcularFatorial(numero));
        scanner.close();
    }
}
