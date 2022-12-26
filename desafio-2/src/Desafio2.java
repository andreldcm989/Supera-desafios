import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] moedas = { 100, 50, 20, 10, 5, 2, 1 , 0.5, 0.25, 0.10, 0.05, 0.01};

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        int reais = (int) Math.floor(valor);
        double centavos = Double.parseDouble(String.format("%.2f", valor % 1));

        StringBuilder saida = new StringBuilder();
        saida.append("NOTAS:\n");
        String tipo = "";

        for (int i = 0; i < 7; i++) {
            tipo = "nota(s)";
            int moeda = (int) moedas[i];
            int divisao = reais > 0 ? Math.floorDiv(reais, moeda) : 0;
            if (divisao > 0) {
                saida.append(String.format("%d %s de R$ %d,00%n", divisao, tipo, moeda));
                reais = reais % moeda;
            } else {
                saida.append(String.format("0 %s de R$ " + moeda + "\n", tipo));
            }
        }

        saida.append("MOEDAS:\n");
        for (int i = 7; i < moedas.length; i++) {
            tipo = "moeda(s)";
            double moeda = moedas[i];
            double divisao = centavos > 0.0 ? centavos / moeda : 0.0;
            if (divisao > 0) {
                saida.append(String.format("%d %s de R$ %.2f%n", (int)divisao, tipo, moeda));
                centavos = centavos % moeda;
            } else {
                saida.append(String.format("0 %s de R$ " + moeda + "\n", tipo));
            }
        }
        System.out.println(saida.toString());

        sc.close();
    }
}
