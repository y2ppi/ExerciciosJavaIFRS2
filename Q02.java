import java.util.*;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("insira um número inteiro: ");
        numero = sc.nextInt();

        if(numero >= 1 && numero <= 9){
            System.out.println("o valor está na faixa permitida");
        } else {
            System.out.println("o valor está fora da faixa permitida");
        }
        sc.close();
    } 
}