import java.util.Scanner;

public class ConsumoAutomovel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double distancia;
        double combustivel;
        double consumoMedio;
        System.out.println("Digite a Distancia percorrida: ");
        distancia = ler.nextDouble();
        System.out.println("Digite o valor do combustivel: ");
        combustivel = ler.nextDouble();
        consumoMedio = distancia / combustivel;
        System.out.println("Consumo médio do automóvel: " + consumoMedio + " km/l");
    }
}
