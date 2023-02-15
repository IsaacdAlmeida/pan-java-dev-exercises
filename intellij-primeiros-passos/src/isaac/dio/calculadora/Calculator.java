package isaac.dio.calculadora;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int sum = sum(a, b);
        int sub = sub(a, b);
        int div = div(a, b);
        int mul = mul(a, b);

        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + sub);
        System.out.println("Divisão: " + div);
        System.out.println("Multiplicação: " + mul);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
}
