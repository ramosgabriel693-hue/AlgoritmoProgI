import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {

//Exercício 1 - Crie um algoritmo que leia um número de 1 a 7.
//imprima o dia da semana correspondente;
//Assuma que 1 corresponde ao Domingo.

        System.out.println("Digite um número de 1 a 7, sabendo que: ");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sábado");

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt();

        switch (menu) {//Início do switch case

            case 1:
                System.out.println(" Você escolheu domingo como dia da semana.");

                break;//finaliza cada case

            case 2:
                System.out.println("Você escolheu segunda-feira como dia da semana.");

                break;

            case 3:
                System.out.println(" Você escolheu terça-feira como dia da semana.");

                break;

            case 4:
                System.out.println("Você escolheu quarta-feira como dia da semana.");

                break;

            case 5:
                System.out.println("Você escolheu quinta-feira como dia da semana.");

                break;

            case 6:
                System.out.println("Você escolheu sexta-feira como dia da semana.");

                break;

            case 7:
                System.out.println("S Você escolheu sábado como dia da semana.");

                break;

            default://caso o usuário digite um número que não esteja entre 1 e 7, o default será acionado
                System.out.println("Número inválido! Digite um número de 1 a 7.");
                
                break;

        }//fim do switch case

        System.out.println();

///////////////////////////////////////////////

//Exercício 2 - Faça um algoritmo que leia um inteiro entre 1 e 12;
// Deduz-se que cada número corresponde a um mês do ano já que 1-12
//Imprima o nome do mês por extenso

        System.out.println("Digite um número de 1 a 12, sabendo que: ");

        System.out.println("1 - Janeiro");
        System.out.println("2 - Fevereiro");
        System.out.println("3 - Março");
        System.out.println("4 - Abril");
        System.out.println("5 - Maio");
        System.out.println("6 - Junho");
        System.out.println("7 - Julho");
        System.out.println("8 - Agosto");
        System.out.println("9 - Setembro");
        System.out.println("10 - Outubro");
        System.out.println("11 - Novembro");
        System.out.println("12 - Dezembro");

        int mes = entrada.nextInt();
        

        switch (mes) {

            case 1:
                System.out.println("Você escolheu Janeiro como mês do ano.");

                break;

            case 2:
                System.out.println("Você escolheu Fevereiro como mês do ano.");

                break;

            case 3:
                System.out.println("Você escolheu Março como mês do ano.");

                break;

            case 4:
                System.out.println("Você escolheu Abril como mês do ano.");

                break;

            case 5:
                System.out.println("Você escolheu Maio como mês do ano.");

                break;

            case 6:
                System.out.println("Você escolheu Junho como mês do ano.");

                break;

            case 7:
                System.out.println("Você escolheu Julho como mês do ano.");

                break;

            case 8:
                System.out.println("Você escolheu Agosto como mês do ano.");

                break;
            case 9:
                System.out.println("Você escolheu Setembro como mês do ano.");

                break;

            case 10:
                System.out.println("Você escolheu Outubro como mês do ano.");

                break;

            case 11:
                System.out.println("Você escolheu Novembro como mês do ano.");

                break;

            case 12:
                System.out.println("Você escolheu Dezembro como mês do ano.");

                break;

            default:
                System.out.println("Número inválido! Digite um número de 1 a 12.");

                break;
        }

        System.out.println();
///////////////////////////////////

//Exercício 3 - Faça um algoritmo que leia o período em que um aluno estuda:
//M - Matutino;
//V - Vespertino;
//N - Noturno.
//Escreva uma das opções a seguir:
//Opção	Saudação
//M	bom dia
//V	boa tarde
//N	boa noite

        System.out.println("Digite o período em que você estuda");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");

        char periodo = entrada.next().charAt(0); // Lê o primeiro caractere da entrada do usuário e não confunde com String

        switch (periodo) {

            case 'M':
                System.out.println("Você escolheu matutino como seu período. Bom dia!");

                break;

            case 'V':
                System.out.println("Você escolheu vespertino como seu período. Boa tarde!");

                break;

            case 'N':
                System.out.println("Você escolheu noturno como seu período. Boa noite!");

                break;

            default:
                System.out.println("O caractere digitado é inválido");
                
                break;
        }

        System.out.println();


//////////////////

//Exercício 4 -Um funcionário receberá aumento de acordo com seu plano de trabalho.
//Faça um algoritmo que leia:
//o plano de trabalho;
//e o salário atual de um funcionário;
//Calcule e imprima o seu novo salário
//Dados://Plano A = 10%
        //Plano B = 15%
        //Plano C = 20%


        System.out.println("Informe o seu plano de trabalho dentro das opções:");
        System.out.println(" Para Plano A, digite A");
        System.out.println("Para Plano B, digite B");
        System.out.print("Para Plano C, digite C: ");

        char plano = entrada.next().charAt(0);

        switch (plano) {

            case 'A':
                System.out.println("Você escolheu o plano A. Ele configura um aumento de 10%!");

                break;

            case 'B':
                System.out.println("Você escolheu o plano B. Ele confere um aumento de 15%!");

                break;

            case 'C':
                System.out.println("Você escolheu o plano C. Ele confere um aumento de 20%!");

                break;

            default:
                System.out.println("Esse plano não está disponível nas opções!");
                
                break;
        }


        System.out.println("Agora, digite o seu salário atual");

        double salario = entrada.nextDouble();

        switch (plano) {

            case 'A':
                salario = salario + (salario * 0.10);
                System.out.printf("Seu novo salário com o aumento de 10%% é: R$ %.2f %n", salario);

                break;

            case 'B':
                salario = salario + (salario * 0.15);
                System.out.printf("Seu novo salário com o aumento de 15%% é: R$ %.2f %n", salario);

                break;

            case 'C':
                salario = salario + (salario * 0.20);
                System.out.printf("Seu novo salário com o aumento de 20%% é: R$ %.2f %n", salario);

                break;

            default:
                System.out.println("Não foi possível calcular o aumento, pois o plano escolhido não é válido.");
                break;
        }

/////////////////////////

//Exercício 5 - Faça um algoritmo que receba dois números;
//execute as operações listadas a seguir
//de acordo com a escolha do usuário.
//Opção	Mensagem
//M	média entre os números digitados   S	diferença do maior pelo menor
//P	produto entre os números digitados D	divisão do primeiro pelo segundo

System.out.println("Digite dois números");

        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("M - Média entre os números digitados");
        System.out.println("S - Diferença do maior pelo menor");
        System.out.println("P - Produto entre os números digitados");
        System.out.println("D - Divisão do primeiro pelo segundo");

        char opcao = entrada.next().charAt(0);

        switch (opcao) {

            case 'M':
                double media = (num1 + num2) / 2; // Como é uma operação matemática, usa-se "=" e não "=="
                System.out.printf("A média entre os números digitados é: %.2f %n", media);

                break;

            case 'S':
                double diferenca = (num1 - num2);
                System.out.printf("A diferença do maior pelo menor é: %.2f %n", diferenca);

                break;

            case 'P':
                double produto = num1 * num2;
                System.out.printf("O produto entre os números digitados é: %.2f %n", produto);

                break;

            case 'D':

                if (num2 != 0) { // "!="" significa "diferente de", ou seja, se num2 for diferente de zero, executa a divisão
                    double divisao = num1 / num2;
                    System.out.printf("A divisão do primeiro pelo segundo é: %.2f %n", divisao);}
                else {// Evita divisão por zero, uma possibilidade. (If e Else em Switch Case)
                    System.out.println("Erro: Divisão por zero não é permitida.");}
                

                break;

            default:
                System.out.println("Opção inválida! Digite M, S, P ou D.");
                
                break; }

////////////////////////

//Exercício 6 - Dado o cardápio de uma 	lanchonete:
// Código	Produto	          Preço
//  100     CachorroQuente    R$ 1,20
//  101     Bauru Simples     R$ 1,30
//  102     Bauru com Ovo     R$ 1,50
//  103     Hambúrguer        R$ 1,20  
//  104     Cheeseburguer     R$ 1,30
//  105     Refrigerante      R$ 1,00

//Faça um algoritmo que:
//leia o código do produto e a quantidade;
//calcule o valor a ser pago pelo cliente;
//imprimir o valor a ser pago;
//imprimir o nome do produto.


System.out.println("Digite o código do produto que deseja comprar:");

        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simples - R$ 1,30");
        System.out.println("102 - Bauru com Ovo - R$ 1,50");
        System.out.println("103 - Hambúrguer - R$ 1,20");
        System.out.println("104 - Cheeseburguer - R$ 1,30");
        System.out.println("105 - Refrigerante - R$ 1,00");

        int codigo = entrada.nextInt();

        System.out.println("Digite a quantidade que deseja comprar:");

        int quantidade = entrada.nextInt();

        double total; // Declarar a variável "total" fora do switch para evitar erros 

        switch (codigo) {

            case 100:
                total = 1.20 * quantidade; // Calcula o total multiplicando o preço do produto pela quantidade escolhida
                System.out.printf("Você escolheu %d Cachorro Quente. O total a pagar é: R$ %.2f %n", quantidade, total);

                break;

            case 101:
                total = 1.30 * quantidade;
                System.out.printf("Você escolheu %d Bauru Simples. O total a pagar é: R$ %.2f %n", quantidade, total);//A quantidade escolhida e o total a pagar são exibidos com formatação de duas casas decimais

                break;

            case 102:
                total = 1.50 * quantidade;
                System.out.printf("Você escolheu %d Bauru com Ovo. O total a pagar é: R$ %.2f %n", quantidade, total);

                break;

            case 103:
                total = 1.20 * quantidade;
                System.out.printf("Você escolheu %d Hambúrguer. O total a pagar é: R$ %.2f %n", quantidade, total);

                break;

            case 104:
                total = 1.30 * quantidade;
                System.out.printf("Você escolheu %d Cheeseburguer. O total a pagar é: R$ %.2f %n", quantidade, total);

                break;

            case 105:
                total = 1.00 * quantidade;
                System.out.printf("Você escolheu %d Refrigerante. O total a pagar é: R$ %.2f %n", quantidade, total);

                break;

            default:
                System.out.println("Código inválido! Digite um código entre 100 e 105.");
                
                break;
        }

    
        entrada.close();





    }
    }
    



