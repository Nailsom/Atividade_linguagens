import java.util.Scanner;

public class MaiorPrimo {
    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static int maiorPrimo(int n) {
        for (int i = n; i >= 2; i--) {
            if (ehPrimo(i)) return i;
        }
        return -1; // Nenhum número primo encontrado
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para encontrar o maior primo: ");
        int numero = scanner.nextInt();

        System.out.println("O maior primo menor ou igual a " + numero + " é: " + maiorPrimo(numero));
        scanner.close();
    }
}
