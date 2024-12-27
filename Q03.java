import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, delta;
        System.out.println("insira o valor de a: ");
        a = sc.nextInt();
        System.out.println("insira o valor de b: ");
        b = sc.nextInt();
        System.out.println("insira o valor de c: ");
        c = sc.nextInt();

        delta = (b*b) - (4*a*c);

        if (delta < 0) {
            System.err.println("a equação não possui raízes reais");
        } else {
            if (delta > 0) {
                System.out.println("a equação possui duas raízes reais");
            } if (delta == 0){
                System.out.println("a equação possui uma única raíz real");
            }
        } sc.close();
    }
}