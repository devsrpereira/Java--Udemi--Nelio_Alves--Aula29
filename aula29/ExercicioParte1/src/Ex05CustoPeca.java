import java.util.Scanner;

public class Ex05CustoPeca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int codigo1, qtde1, codigo2, qtde2;
        double custo1, custo2, total;

        System.out.printf("%nDigite o Código do produto, a quantidade e o valor unitário!  %n");

        codigo1 = s.nextInt();
        qtde1 = s.nextInt();
        custo1 = s.nextDouble();

        codigo2 = s.nextInt();
        qtde2 = s.nextInt();
        custo2 = s.nextDouble();

        total = qtde1*custo1 + qtde2*custo2;

        System.out.printf("%nEntrada: %n");
        System.out.printf("%d %d %.2f %n",codigo1, qtde1, custo1);
        System.out.printf("%d %d %.2f %n",codigo2, qtde2, custo2);

        System.out.printf("%nSaída: %n");
        System.out.printf("VALOR A PAGAR = R$ %.2f %n", total);

        s.close();
    }
}
