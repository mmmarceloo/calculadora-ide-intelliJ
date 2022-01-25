package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro numero");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero");
        b = scan.nextInt();


        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        double divisao = divisao(a, b);
        int multiplicacao = multiplicacao(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subtracao: " + subtracao);
        System.out.println("divisao: " + divisao);
        System.out.println("multiplicacao: " + multiplicacao);




    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtracao(int a, int b){
        return a - b;
    }
    public static double divisao(double a, double b){
        return a / b;
    }
    public static int multiplicacao(int a, int b){
        return a * b;
    }

}
