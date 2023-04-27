import java.util.Scanner;

public class Ex04Salario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int funcionario, horas;
        double custoHora, salario;

        System.out.printf("%nDigite o codigo de funcionario, seguido da carga horaria e o custo hora!  %n");

        funcionario = s.nextInt();
        horas = s.nextInt();
        custoHora = s.nextDouble();

        salario = horas * custoHora;

        System.out.printf("%nEntrada: %n");
        System.out.println(funcionario);
        System.out.println(horas);
        System.out.println(custoHora);

        System.out.printf("%nSaída: %n");
        System.out.printf("NUMBER = %d %n",funcionario);
        System.out.printf("SALARY = U$ %.2f %n",salario);

        s.close();
    }
}
