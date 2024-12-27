import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, diferenca1, diferenca2;
        System.out.println("insira o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("insira o segundo número: ");
        n2 = sc.nextInt();

        if (n1 == n2){
            System.out.println("os números são iguais, portanto sua diferença é 0");
        } else {
            if (n1 > n2){
            diferenca1 = (n1-n2);
            System.out.println("a diferença entre os números é: " + diferenca1);
        }else{
            if (n1 < n2);
            diferenca2 = (n2-n1);
            System.out.println("a diferença entre os dois números é: " + diferenca2);
        }
        }
        sc.close();
    }
}