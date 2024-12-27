import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("insira o primeiro valor: ");
        num1 = sc.nextInt();
        System.out.println("insira o segundo valor: ");
        num2 = sc.nextInt();
        System.out.println("insira o terceiro valor: ");
        num3 = sc.nextInt();
        System.out.println("insira o quarto valor: ");
        num4 = sc.nextInt();

        if(num1 % 2 == 0 && num1 % 3 == 0){
            System.out.println(num1 + " é divisivel por 2 e 3");
        }else{
            System.out.println(num1 + " não é divisivel por 2 e 3");
        }
        if(num2 % 2 == 0 && num2 % 3 == 0){
            System.out.println(num2 + " é divisivel por 2 e 3");
        }else{
            System.out.println(num2 + " não é divisivel por 2 e 3");
        }
        if(num3 % 2 == 0 && num3 % 3 == 0){
            System.out.println(num3 + " é divisivel por 2 e 3");
        }else{
            System.out.println(num3 + " não é divisivel por 2 e 3");
        }
        if(num4 % 2 == 0 && num4 % 3 == 0){
            System.out.println(num4 + " é divisivel por 2 e 3");
        }else{
            System.out.println(num4 + " não é divisivel por 2 e 3");
        }
        sc.close();
    }
}