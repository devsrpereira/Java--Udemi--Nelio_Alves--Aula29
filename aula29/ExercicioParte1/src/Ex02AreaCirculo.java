import java.util.Scanner;

public class Ex02AreaCirculo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double pi, area, raio;

        System.out.printf("%nDigite o raio da circunferencia para calcularmos a área! %n");

        pi = 3.14159;
        raio = s.nextDouble();
        area = pi * Math.pow(raio,2);

        System.out.printf("%nEntrada: %n");
        System.out.println(raio);

        System.out.printf("%nSaída: %n");
        System.out.printf("Área = %.4f %n",area);

        s.close();
    }
}
