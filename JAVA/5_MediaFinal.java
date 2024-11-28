import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira unidade: ");
        double unidade1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda unidade: ");
        double unidade2 = scanner.nextDouble();

        double mediaFinal = (unidade1 + unidade2) / 2;

        System.out.println("Média Final: " + mediaFinal);
        if (mediaFinal >= 7) {
            System.out.println("Resultado: Aprovado");
        } else if (mediaFinal < 3) {
            System.out.println("Resultado: Reprovado");
        } else {
            System.out.println("Resultado: Prova Final");
        }

        scanner.close();
    }
}
