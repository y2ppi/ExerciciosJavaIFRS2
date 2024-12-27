import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float trabalhoLaboratorio, avaliacaoSemestral, exameFinal, mediaPonderada;

        System.out.println("informe sua nota no trabalho de laboratorio: ");
        trabalhoLaboratorio = sc.nextFloat();
            if(trabalhoLaboratorio > 2){
                System.out.println("nota invalida");
            }
        System.out.println("informe sua nota em avaliaçao semestral: ");
        avaliacaoSemestral = sc.nextFloat();
            if(avaliacaoSemestral > 3){
                System.out.println("nota invalida");
            }
        System.out.println("informe sua nota em exame final: ");
        exameFinal = sc.nextFloat();
            if(exameFinal > 5){
                System.out.println("nota invalida");
            }
        
            mediaPonderada = (trabalhoLaboratorio + avaliacaoSemestral + exameFinal);

            if(mediaPonderada > 8 && mediaPonderada == 10){
                System.out.print("A");
            }

            if(mediaPonderada > 7 && mediaPonderada == 8){
                System.out.print("B");
            }

            if(mediaPonderada > 6 && mediaPonderada == 7){
                System.out.print("C");
            }

            if(mediaPonderada > 5 && mediaPonderada == 6){
                System.out.print("D");
            }

            if(mediaPonderada >= 0 && mediaPonderada == 5){
                System.out.print("E");
            }

            sc.close();
    }
}