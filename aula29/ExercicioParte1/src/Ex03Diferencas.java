import java.util.Scanner;

public class Ex03Diferencas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2, n3, n4, diferenca;

        System.out.printf("%nDigite 4 números inteiros para dalcularmos a diferença!  %n");

        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
        n4 = s.nextInt();

        diferenca = n1*n2 - n3*n4;

        System.out.printf("%nEntrada: %n");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        System.out.printf("%nSaída: %n");
        System.out.printf("DIFERENÇA = %d %n", diferenca);

        s.close();
    }
}
