import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<String> entradas = new ArrayList<>();
        System.out.print("Quantos casos de teste? ");
        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= casos; i++) {   
            String teste = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(teste.substring(teste.length()/2));
            sb.append(teste.substring(0, (teste.length()+1) / 2));
            sb.reverse();
            entradas.add(sb.toString());
        }
        System.out.println("-----------------------------------------------");

        entradas.forEach(System.out::println);

        sc.close();
    }
}
