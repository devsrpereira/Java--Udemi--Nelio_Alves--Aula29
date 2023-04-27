import java.util.Scanner;

public class Ex01Somar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2, soma;

        System.out.printf("%nDigite 2 números inteiros para somá-los!  %n");

        n1 = s.nextInt();
        n2 = s.nextInt();
        soma = n1 + n2;

        System.out.printf("%nEntrada: %n");
        System.out.println(n1);
        System.out.println(n2);

        System.out.printf("%nSaída: %n");
        System.out.printf("Soma = %d %n",soma);

    s.close();
    }
}