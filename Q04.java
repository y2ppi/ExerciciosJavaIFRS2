import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("insira o valor de a: ");
        a = sc.nextInt();
        System.out.println("insira o valor de b: ");
        b = sc.nextInt();
        System.out.println("insira o valor de c: ");
        c = sc.nextInt();

        if(a == b && a == c && b == c){
            System.out.println("os valores informados formam um triangulo");
        }else{
            System.out.println("os valores informados não formam um triangulo");
        }
        sc.close();
    }
}
