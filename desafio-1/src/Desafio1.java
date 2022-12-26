import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ordenação de valores: primeiro pares (crescente), segundo impares
 * (decrescentes).
 * 
 */

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numeros.add(sc.nextInt());
        }
        numeros.sort((n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 == 0) {
                return Integer.compare(n1, n2);
            }
            if (n1 % 2 != 0 && n2 % 2 != 0) {
                return Integer.compare(n2, n1);
            }
            if (n1 % 2 == 0) {
                return -1;
            }
            return 1;
        });
        System.out.println("--------------");
        numeros.forEach(System.out::println);

        sc.close();
    }
}
