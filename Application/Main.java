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

        int num1;
        int num2;
        System.out.println("Digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Digite o primeiro numero");
        num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma do número " + num1 + " com o número " + num2 + " é = " + soma);




        sc.close();
    }
}