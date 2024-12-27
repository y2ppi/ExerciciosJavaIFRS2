import java.util.*;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("insira os valores: ");
        for(int i = 0;i < 3; i++){
            System.out.println("número " + (i+1) + ":");
            listaNumeros.add(sc.nextInt());
        }

        int menor = listaNumeros.get(0);

        for(int num : listaNumeros){
            if(num < menor){
                num = menor;
            }
        }
        System.out.println("o menor número dos valores é: " + menor);

        sc.close();
    }
}