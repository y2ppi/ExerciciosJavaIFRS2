import java.util.*;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> divisiveisPor2 = new ArrayList<>();
        List<Integer> divisiveisPor3 = new ArrayList<>();

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Insira 4 números: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }

        for (int num : numeros) {
            if (num % 2 == 0) {
                divisiveisPor2.add(num);
            }
            if (num % 3 == 0) {
                divisiveisPor3.add(num);
            }
        }

        // Impressão das listas
        System.out.println("Lista de valores divisíveis por 2: " + divisiveisPor2);
        System.out.println("Lista de valores divisíveis por 3: " + divisiveisPor3);

        sc.close();
    }
}