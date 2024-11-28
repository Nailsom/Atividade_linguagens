import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string (máximo 80 caracteres): ");
        String input = scanner.nextLine();
        input = input.length() > 80 ? input.substring(0, 80) : input;

        int tamanho = input.length();
        int pontuacao = 0, numeros = 0, minusculas = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (Character.isLowerCase(c)) minusculas++;
                if (Character.isDigit(c)) numeros++;
            } else if (!Character.isWhitespace(c)) {
                pontuacao++;
            }
        }

        System.out.println("Total de caracteres: " + tamanho);
        System.out.println("Total de pontuações: " + pontuacao);
        System.out.println("Total de números: " + numeros);
        System.out.println("Total de minúsculas: " + minusculas);

        scanner.close();
    }
}
