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

//        Fazer um programa para ler o código de uma peça 1, o número de peças 1,
//        o valor unitário de cada peça 1, o código de uma peça 2,
//        o número de peças 2 e o valor unitário de cada peça 2.
//        Calcule e mostre o valor a ser pago.

//        int produto1;
//        int quantidadeProduto1;
//        double valorProduto1;
//
//        int produto2;
//        int quantidadeProduto2;
//        double valorProduto2;
//

//        System.out.println("Digite o código do produto: ");
//        produto1 = sc.nextInt();
//        System.out.println("Digitew a quantidade do produto: ");
//        quantidadeProduto1 = sc.nextInt();
//        System.out.println("Digite o valor do produto: ");
//        valorProduto1 = sc.nextDouble();
//
//        System.out.println();
//        System.out.println("Digite o código do produto: ");
//        produto2 = sc.nextInt();
//        System.out.println("Digite a quantidade do produto: ");
//        quantidadeProduto2 = sc.nextInt();
//        System.out.println("Digite o valor do produto: ");
//        valorProduto2 = sc.nextDouble();
//
//        double totalProduto1 = quantidadeProduto1 * valorProduto1;
//        double totalProduto2 = quantidadeProduto2 * valorProduto2;
//        double totalPagamento = totalProduto1 + totalProduto2;
//
//        System.out.println();
//        System.out.printf("Valor a pagar: %.2f", totalPagamento);

        ///////////////// 6 //////////////////////

//        Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
//        A, B e C. Em seguida, calcule e mostre:
//
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B.

//        double a, b, c;
//        double pi = 3.14159;
//
//        System.out.println("Digite o primeiro valor: ");
//        a = sc.nextDouble();
//        System.out.println("Digite o segundo valor: ");
//        b = sc.nextDouble();
//        System.out.println("Digite o terceiro valor: ");
//        c = sc.nextDouble();
//
//        double trinagulo = (a * c) / 2 ;
//        double circulo = (c * c) * pi;
//        double trapezio = (a + b) * c /2;
//        double quadrado = b * b;
//        double retangulo = a * b;
//
//        System.out.println();
//        System.out.printf("Triangulo: %.3f%n", trinagulo);
//        System.out.printf("Circulo: %.3f%n", circulo);
//        System.out.printf("Trapézio: %.3f%n", trapezio);
//        System.out.printf("quadrado: %.3f%n", quadrado);
//        System.out.printf("Retangulo: %.3f%n", retangulo);

        ////////////////////////// EXERCICIOS ESTRUTURA CONDICIONAL ///////////////////

        ///////////////// 1 //////////////////////

//        Fazer um programa para ler um número inteiro,
//        e depois dizer se este número é negativo ou não.

//        int n;
//
//        System.out.println("Digite um número: ");
//        n = sc.nextInt();
//
//        System.out.println();
//        if (n < 0 ){
//            System.out.println("O numero " + n + " é negativo");
//        } else {
//            System.out.println("O numero " + n + " é positivo");
//        }

        ///////////////// 2 //////////////////////

//        Fazer um programa para ler um número inteiro
//        e dizer se este número é par ou ímpar.

//        int n;
//
//        System.out.println("Digite um número");
//        n = sc.nextInt();
//
//        System.out.println();
//        if (n % 2 == 0){
//            System.out.println("O número " + n + " é PAR");
//        } else {
//            System.out.println("O número " + n + " é IMPAR");
//        }


        ///////////////// 3 //////////////////////

//        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
//        "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos
//        são múltiplos entre si. Atenção: os números devem poder ser digitados
//        em ordem crescente ou decrescente.

//        int a, b;
//
//        System.out.println("Digite o primeiro número");
//        a = sc.nextInt();
//        System.out.println("Digite o segundo número");
//        b = sc.nextInt();
//
//        System.out.println();
//        if (a % b == 0 || b % a == 0){
//            System.out.println("São multiplos");
//        } else {
//            System.out.println("Não são multiplos");
//        }


        ///////////////// 4 //////////////////////

//        Leia a hora inicial e a hora final de um jogo.
//        A seguir calcule a duração do jogo, sabendo que o mesmo
//        pode começar em um dia e terminar em outro, tendo uma duração mínima
//        de 1 hora e máxima de 24 horas.

//        double horaInicial, horaFinal;
//
//        System.out.println("Digite a hora inicial do jogo: ");
//        horaInicial = sc.nextDouble();
//        System.out.println("Digite a hora inicial do jogo: ");
//        horaFinal = sc.nextDouble();
//        double horasTotal = horaFinal - horaInicial;
//
//        System.out.println();
//        if ( horasTotal < 0){
//              horasTotal = 24 - horaInicial + horaFinal;
//                System.out.println("O jog durou " + horasTotal + "Hrs");
//        } else if(horasTotal == 0){
//                horasTotal = 24;
//                System.out.println("O jog durou " + horasTotal + "Hrs");
//        } else {
//            System.out.println("O jog durou " + horasTotal + "Hrs");
//        }


        ///////////////// 5 //////////////////////

//        Com base na tabela abaixo, escreva um programa
//        que leia o código de um item e a quantidade deste item.
//        A seguir, calcule e mostre o valor da conta a pagar.

//        1 - cachorro quente = 4.00
//        2 - x-salda = 4.5
//        3 - Xbacon = 5
//        4 - Torradas simples = 2
//        5 - refrigerante = 1.5

//        int codigo;
//        int quantidade;
//
//        System.out.println("Digite o código do produto: ");
//        codigo = sc.nextInt();
//        System.out.println("Digite a quantidade do produto:");
//        quantidade = sc.nextInt();
//
//        double total;
//        if (codigo == 1){
//            total = quantidade * 4;
//        } else if (codigo == 2){
//            total = quantidade * 4.5;
//        } else if (codigo == 3){
//            total = quantidade * 5;
//        }else if (codigo == 4){
//            total = quantidade * 2;
//        } else {
//            total = quantidade * 1.5;
//        }
//
//        System.out.printf("TOTAL: %.2f", total);

        ///////////////// 6 //////////////////////

//        Você deve fazer um programa que leia um valor qualquer
//        e apresente uma mensagem dizendo em qual dos seguintes
//        intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
//        Obviamente se o valor não estiver em nenhum destes intervalos,
//        deverá ser impressa a mensagem “Fora de intervalo”.

//        double num;
//
//        System.out.println("Digite um número: ");
//        num = sc.nextDouble();
//
//        System.out.println();
//        if (num >=0 && num <=25){
//            System.out.println("Intervalo (0, 25)");
//        } else if (num >25 && num <=50){
//            System.out.println("Intervalo (25, 50)");
//        } else if (num >50 && num <=75){
//            System.out.println("Intervalo (50, 75)");
//        } else if (num >75 && num <=100){
//            System.out.println("Intervalo (75, 1000)");
//        } else {
//            System.out.println("Fora do intervalo");
//        }

        ///////////////// 7 //////////////////////

//        Leia 2 valores com uma casa decimal (x e y),
//        que devem representar as coordenadas de um ponto em um plano.
//        A seguir, determine qual o quadrante ao qual pertence o ponto,
//        ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//        Se o ponto estiver na origem, escreva a mensagem “Origem”.
//        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”,
//        conforme for a situação.


        ///////////////// 8 //////////////////////

//        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes
//        em pagar seus impostos, pois sabem que nele não existem políticos corruptos
//        e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio.
//        A moeda deste país é o Rombus, cujo símbolo é o R$.
//        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
//        Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
//        segundo a tabela abaixo.

////        renda até 2000 - isento
//          renda 2000.01 a 3000 - 8%
//          renda 3000.01 a 4500 - 18%
//          acima 4500.00 28%

//        double salario;
//
//        System.out.println("Digite seu salario");
//        salario = sc.nextDouble();
//
//        double imposto ;
//
//        if (salario <= 2000.0) {
//            imposto = 0.0;
//        }
//        else if (salario <= 3000.0) {
//            imposto = (salario - 2000.0) * 0.08;
//        }
//        else if (salario <= 4500.0) {
//            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
//        }
//        else {
//            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
//        }
//
//        if (imposto == 0.0) {
//            System.out.println("Isento");
//        }
//        else {
//            System.out.printf("R$ %.2f%n", imposto);
//        }




        //////////////////////////// ESTRUTURA DE REPETICAO - WHILE ////////////////////////////////

        ///////////////// 1 //////////////////////

//        Escreva um programa que repita a leitura de uma senha até que ela seja válida.
//        Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
//        Quando a senha for informada corretamente deve ser impressa a mensagem
//        "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

//        int senha;
//        System.out.println("Digite a senha");
//        senha = sc.nextInt();
//        while (senha != 2002){
//            System.out.println();
//            System.out.println("Senha incorreta");
//            System.out.println();
//            System.out.println("Digite a senha novamente");
//            senha = sc.nextInt();
//        }
//        System.out.println();
//        System.out.println("Aceeso permitido");

        ///////////////// 1 //////////////////////

//        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
//        indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
//        quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

//        int x;
//        int y;
//
//        System.out.println("Digite um número");
//        x = sc.nextInt();
//        System.out.println("Digite um numero");
//        y = sc.nextInt();
//
//        while (x != 0 && y != 0) {
//            if (x > 0 && y > 0) {
//                System.out.println();
//                System.out.println("primeiro");
//            }
//            else if (x < 0 && y > 0) {
//                System.out.println();
//                System.out.println("segundo");
//            }
//            else if (x < 0 && y < 0) {
//                System.out.println();
//                System.out.println("terceiro");
//            }
//            else {
//                System.out.println();
//                System.out.println("quarto");
//            }
//            x = sc.nextInt();
//            y = sc.nextInt();
//        }

        ///////////////// 2 //////////////////////

//        Um Posto de combustíveis deseja determinar qual de seus produtos
//        tem a preferência de seus clientes. Escreva um algoritmo para ler o
//        tipo de combustível abastecido (codificado da seguinte forma:
//        1.Álcool
//        2.Gasolina
//        3.Diesel
//        4.Fim).
//        Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
//        deve ser solicitado um novo código (até que seja válido).
//        O programa será encerrado quando o código informado for o número 4.
//        Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade
//        de clientes que abasteceram cada tipo de combustível, conforme exemplo.


//        int codigo;
//        int gasolina = 0;
//        int alcool = 0;
//        int diesel = 0;
//
//        System.out.println("Digite o código do produto: ");
//        codigo = sc.nextInt();
//
//        while (codigo != 4){
//            if (codigo == 1){
//                gasolina += + 1;
//            } else if (codigo == 2){
//                alcool += + 1;
//            } else if (codigo == 3) {
//                diesel += + 1;
//            }
//            System.out.println("Digite outro código");
//                codigo = sc.nextInt();
//            }
//
//            System.out.println();
//            System.out.println("Muito Obrigado");
//            System.out.println("Alcool: " + alcool);
//            System.out.println("Gasolina: " + gasolina);
//            System.out.println("Diesel: " + diesel);


        //////////////////////////// ESTRUTURA DE REPETICAO - FOR ////////////////////////////////

        ///////////////// 1 //////////////////////


//        Leia um valor inteiro X (1 <= X <= 1000).
//        Em seguida mostre os ímpares de 1 até X, um valor por linha,
//        inclusive o X, se for o caso.

//        int x;
//        System.out.println("Digite um número: ");
//        x = sc.nextInt();
//
//        for (int i = 1; i < x; i++){
//            if(i % 2 != 0){
//                System.out.println(i);
//            }
//        }

        ///////////////// 2 //////////////////////

//        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
//        que serão lidos em seguida.
//        Mostre quantos destes valores X estão dentro do intervalo [10,20]
//        e quantos estão fora do intervalo, mostrando essas informações conforme exemplo
//        (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

//        int n;
//
//        System.out.println("Digite um número");
//        n = sc.nextInt();
//
//        int in = 0;
//        int out = 0;
//
//        for (int i=0; i<n; i++) {
//            int x = sc.nextInt();
//            if (x >= 10 && x <= 20) {
//                in += + 1;
//            }
//            else {
//                out += + 1;
//            }
//        }
//        System.out.println();
//        System.out.println(in + " in");
//        System.out.println(out + " out");

        ///////////////// 2 //////////////////////

//        Leia 1 valor inteiro N, que representa o número de casos de teste
//        que vem a seguir. Cada caso de teste consiste de 3 valores reais,
//        cada um deles com uma casa decimal. Apresente a média ponderada
//        para cada um destes conjuntos de 3 valores, sendo que o primeiro valor
//        tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

        ///////////// COMO RESOLVI ////////////////////////

//        int n;
//        double x = 0;
//        System.out.println("Digite um numero: ");
//        n = sc.nextInt();
//
////        int peso1 = 2;
////        int peso2 = 3;
////        int peso3 = 5;
//        double nota1 = 0;
//        double nota2 = 0;
//        double nota3 = 0;
//        double media = 0;
//
//
//        for (int i = 0; i < n; i++) {
//            x = sc.nextDouble();
//            nota1 = x * 2;
//            x = sc.nextDouble();
//            nota2 = x * 3;
//            x = sc.nextDouble();
//            nota3 = x * 5;
//            media = (nota1 + nota2 + nota3) / 10;
//            System.out.printf("a média dos números é %.1f", media);
//        }
//
//        //System.out.println("a média dos números é " + media);

        /////////////// RESOLVIDO UDEMY ///////////////////////

//        int n = sc.nextInt();
//
//        for (int i=0; i<n; i++) {
//
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//            double c = sc.nextDouble();
//
//            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
//
//            System.out.printf("%.1f%n", media);
//        }

        ///////////////// 3 //////////////////////

//        Fazer um programa para ler um número N. Depois leia N pares de números
//        e mostre a divisão do primeiro pelo segundo.
//        Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".


//        double n ;
//        System.out.println("Digite um número");
//        n = sc.nextDouble();
//
//        double numerando;
//        double divisor;
//        double resultado = 0;
//
//        for (int i = 0; i < n; i++) {
//            numerando = sc.nextDouble();
//            divisor = sc.nextDouble();
//            resultado = numerando / divisor;
//
//            if (resultado % 2 == 0) {
//                resultado = numerando / divisor;
//                System.out.println(resultado);
//            } else {
//                System.out.println("Divisão impossível");
//            }
//        }

        sc.close();
    }
}