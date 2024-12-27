import java.util.*;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, novoSalario, aumento;

        System.out.println("insira seu atual salário: ");
        salario = sc.nextDouble();

        aumento = (salario*30)/100;

        novoSalario = (aumento + salario);

            if(salario < 5000){
                System.out.printf("seu novo salário com o aumento é: %.2f", novoSalario);
            }else{
                System.out.println("salário ok");
            }
            sc.close();
    }
}