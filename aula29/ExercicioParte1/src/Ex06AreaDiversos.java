import java.util.Scanner;

public class Ex06AreaDiversos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1, n2, n3, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.printf("%nDigite 3 números para os calcularmos as áreas diversas!  %n");

        n1 = s.nextDouble();
        n2 = s.nextDouble();
        n3 = s.nextDouble();

        triangulo = (n1*n3)/2;
        circulo = 3.14159 * Math.pow(n3,2);
        trapezio = ((n1+n2)*n3)/2;
        quadrado = n2 * n2;
        retangulo = n1 * n2;

        System.out.printf("%nEntrada: %n");
        System.out.printf("%.1f %.1f %.1f %n", n1, n2, n3);

        System.out.printf("%nSaída: %n");
        System.out.printf("TRIANGULO = %.3f %n",triangulo);
        System.out.printf("CIRCULO = %.3f %n",circulo);
        System.out.printf("TRAPEZIO = %.3f %n",trapezio);
        System.out.printf("QUADRADO = %.3f %n",quadrado);
        System.out.printf("RETANGULO = %.3f %n",retangulo);

        s.close();
    }
}
