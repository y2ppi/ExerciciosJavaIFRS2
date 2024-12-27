import java.util.*;

public class Q07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> listaNumeros = new ArrayList<>();

    System.out.println("insira os valores: ");
    for (int i = 0; i < 3; i++) {
        System.out.println("número " + (i + 1) + ":");
        listaNumeros.add(sc.nextInt());
    }
    
    int maior = listaNumeros.get(0);

    for(int num : listaNumeros) {
        if (num > maior){
            maior = num;
        }
    }

    System.out.println("o maior número entre eles é: " + maior);

    sc.close();
}
}