import java.util.Scanner;

public class Cdb {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double teto = 13;
        Boolean risco = false;

        System.out.println("=== SISTEMA DE AUDITORIA: ANALISE DE CDB ===");

        System.out.println("Digite o nome do CDB:");
        String cdb = leia.nextLine();

        System.out.println("Digite a taxa de juros oferecida pelo CDB:");
        double juros = leia.nextDouble();

           if(juros > teto) {
            risco = true;
        }

        else {
            System.out.println("O ATIVO ESTÁ REGULAR.");
        }

        System.out.println("-----------------");
        System.out.println("RELATORIO PRELIMINAR");
        System.out.println("Fundo analisado: " + cdb);
        System.out.println("Taxa oferecida: " + juros);
        System.out.println("Teto regulatório permitido: 13.0%");
        if(risco) {
            System.out.println("[ALERTA CRÍTICO] A taxa do CDB está acima do teto regulatório!");
            System.out.println("Motivo: Captação agressiva para atrair liquidez de forma artificial.");
       
            System.out.println("-------------");
            System.out.println("Parecer do auditor: Ativo bloqueado para novas emissões.");
        }

        else {
            System.out.println("ATIVO REGULAR.");
            System.out.println("Parecer do auditor: Ativo liberado para comercialização.");
        }
        leia.close();
    }
}
