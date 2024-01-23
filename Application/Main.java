import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [ ] Pessoas = new String[]{ "Gabriel", "Maria", "João"};

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        String nome = "Gabriel";
//        int idade = 41;
//        double peso = 79.9;
//
//        System.out.printf("%s tem %d anos e tem o peso de %.2f kg", nome, idade, peso);

//        System.out.println("Digite seu nome");
//        String nome;
//        nome = sc.nextLine();
//        System.out.println("Digite seu ID");
//        int id;
//        id = sc.nextInt();
//
//
//        System.out.println("O nome do ususário é " + nome);
//        System.out.println("ID = " + id);


        /////////////////////// ESTRUTURA SEQUENCIAL  ////////////////////////////////
        // Faça um programa para ler dois valores inteiros,
        // e depois mostrar na tela a soma desses números com uma mensagem explicativa,
        // conforme exemplos.

        ///////////////// 1 //////////////////////

//        int num1;
//        int num2;
//        System.out.println("Digite o primeiro numero");
//        num1 = sc.nextInt();
//        System.out.println("Digite o primeiro numero");
//        num2 = sc.nextInt();
//        int soma = num1 + num2;
//
//        System.out.println("A soma do número " + num1 + " com o número " + num2 + " é = " + soma);

        ///////////////// 2 //////////////////////

//        Faça um programa para ler o valor do raio de um círculo,
//        e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159

//        double raio;
//        double pi = 3.14159;
//
//        System.out.println("Digite o raio do círculo: ");
//        raio = sc.nextDouble();
//        double area = pi * (raio * raio);
//
//        System.out.printf("A area do circulo com o raio %.2f é de %.4f", raio, area);

        ///////////////// 3 //////////////////////

//        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
//        calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
//        DIFERENCA = (A * B - C * D).

//        int a, b, c, d;
//
//        System.out.println("Digite o primeiro numero: ");
//        a = sc.nextInt();;
//        System.out.println("Digite o segundo número: ");
//        b = sc.nextInt();
//        System.out.println("Digite o terceiro número: ");
//        c = sc.nextInt();
//        System.out.println("Digite o quarto número: ");
//        d = sc.nextInt();
//
//        int diferenca = (a * b) - (c * d);
//
//        System.out.println("A diferença da multiplicação de " + a + " e " + b + " e " + c + " e " + d + " é: " + diferenca);

        ///////////////// 4 //////////////////////

//        Fazer um programa que leia o número de um funcionário,
//        seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário
//        desse funcionário. A seguir, mostre o número e o salário do funcionário,
//        com duas casas decimais.

//        int id;
//        double horasTrabalho;
//        double valorHora;
//
//        System.out.println("Digite o ID do funcionário: ");
//        id = sc.nextInt();
//        System.out.println("Digite as horas trabalhadas do funcionário: ");
//        horasTrabalho = sc.nextDouble();
//        System.out.println("Digite o valor da hora de trabalho do funcionário: ");
//        valorHora = sc.nextDouble();
//
//        double salario = horasTrabalho * valorHora;
//
//        System.out.println();
//        System.out.println("ID funcionário: " + id);
//        System.out.printf("Salário: %.2f ", salario);



        ///////////////// 5 //////////////////////


        sc.close();
    }
}