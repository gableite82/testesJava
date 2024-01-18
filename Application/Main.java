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

        System.out.println("Digite seu nome");
        String nome;
        nome = sc.nextLine();
        System.out.println("Digite seu ID");
        int id;
        id = sc.nextInt();


        System.out.println("O nome do ususário é " + nome);
        System.out.println("ID = " + id);

        sc.close();
    }
}