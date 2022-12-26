import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos 
 * do array em que a sua diferença seja igual ao valor alvo
 */

public class Desafio3 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Digite o Tamanho da lista: ");
        int tamanho = sc.nextInt();
        sc.nextLine();
        System.out.print("Numero alvo: ");
        int target = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite os numeros da lista:");
        do{
            numeros.add(sc.nextInt());
        } while(numeros.size() < tamanho);

        int match = 0;        

        numeros.sort((n1, n2) -> Integer.compare(n2, n1));

        for (int n1 = 0; n1 < numeros.size(); n1++) {
            for (int n2 = n1; n2 < numeros.size();) {
                if(Math.subtractExact(numeros.get(n1), numeros.get(n2)) == target)  match++;
                n2++;
            }
        }
        System.out.println("Combinações: " + match);
        sc.close();
    }

}
