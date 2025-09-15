import java.util.Scanner;
public class ExerciciosIf_Else {
    public static void main(String[] args) { // Gabriel Rodrigues Ramos. RA: 1143303419.

        Scanner entrada = new Scanner(System.in);

//Exemplo 1 - Faça uma checagem simples de pontos de jogo. Se o jogador atingir 1000 pontos, ele passa para a próxima fase.
// Aqui caberia uma estrutura de loop e while para que o jogador pudesse continuar jogando e somando pontos.//

        System.out.println("Exemplo 1 - Faça uma checagem simples de pontos de jogo. Se o jogador atingir 1000 pontos, ele passa para a próxima fase.");
        System.out.println();
        System.out.println("Digite quantos pontos você fez");
        int pontos = entrada.nextInt();
        if (pontos >= 1000) {
            System.out.println("Parabéns! Você passou para a próxima fase!");
        } else {
            System.out.println("Você precisa somar mais pontos para passar de fase.");
        }

                                     System.out.println();

        

//////////////////////////

// Exercício 1 - Faça um Algoritmo que leia um número inteiro e se ele for maior que 20, calcule e imprima a metade dele.
        System.out.println("Exercício 1 - Faça um Algoritmo que leia um número inteiro e se ele for maior que 20, calcule e imprima a metade dele.");
         System.out.println();
        System.out.println("Digite um número");

        int n = entrada.nextInt();

        if (n > 20) System.out.println("A metade de " + n + " é " + n / 2);//Não há necessidade de usar chaves aqui, pois é apenas uma linha de código a ser executada se a condição for verdadeira.
                                     System.out.println();

/////////////////////////////

//Exemplo 2 -Verifique se um Número é Par ou ímpar.

        System.out.println("Exemplo 2 -Verifique se um Número é Par ou ímpar.");
         System.out.println();
        System.out.println("Digite um número inteiro: ");
        int n1 = entrada.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O número " +  n1 + " é par.");
        } else {
            System.out.println("O número " + n1 + " é ímpar.");
        }
                                        System.out.println();

////////////////////////////

//Exercício 2 - Receber a idade de uma pessoa. Se ela for maior de idade, imprima: maior de idade. Se ela for menor de idade, imprima: menor de idade.

        System.out.println("Exercício 2 - Receber a idade de uma pessoa. Se ela for maior de idade, imprima: maior de idade. Se ela for menor de idade, imprima: menor de idade.");
         System.out.println();      
        System.out.println("Digite sua idade");
        int n2 = entrada.nextInt();
        if (n2 <= 17){
            System.out.println("Você é menor de idade");}
        else
            System.out.println("Você é maior de idade");
                                        System.out.println();

//////////////////////////


//Exemplo 3 - Jogo de Advinhar o número: dado o número 15, permita que o usuário tente acertá-lo, informando quando ele está perto ou longe do número ideal.


        System.out.println("Exemplo 3 - Jogo de Advinhar o número: dado um número fictício, permita que o usuário tente acertá-lo, informando quando ele está perto ou longe do número ideal.");
        System.out.println("Dica: O número está entre 10 e 20");
         System.out.println();      
        int palpite;
        System.out.println("Digite seu palpite"); palpite = entrada.nextInt();
        if (palpite == 15) {
            System.out.println("Você acertou!");
        }else if (palpite < 15) {//Aqui também caberia um loop, para que o usuário pudesse tentar várias vezes.//
            System.out.println("Seu palpite está abaixo!");
        }else {
            System.out.println("Seu palpite está acima"); }
                                       System.out.println();

/////////////////////////
 
//Exercício 3 - Ler dois valores inteiros. Se forem iguais, retornar a mensagem "Números iguais", caso contrário, apresentar a diferença do maior para o menor.
            System.out.println("Exercício 3 - Ler dois valores inteiros. Se forem iguais, retornar a mensagem 'Números iguais', caso contrário, apresentar a diferença do maior para o menor.");
             System.out.println();  
            System.out.println("Digite dois números inteiros que sejam iguais ou diferentes entre si");
            int n3 = entrada.nextInt();
            int n4 = entrada.nextInt();
            if (n3 == n4) {
                System.out.println("Seus números são iguais!");} 
                else if (n3 > n4) {
                    System.out.println("A diferença do maior para o menor é: " + (n3 - n4));}
                    else {
                        System.out.println("A diferença do maior para o menor é: " + (n4 - n3));
                    }

                           System.out.println();

//////////////////////////

//Exercício 4 - Ler dois números (ponto flutuante) e apresentá-los em ordem decrescente.
            System.out.println("Exercício 4 - Ler dois números (ponto flutuante) e apresentá-los em ordem decrescente.");
             System.out.println();  
            System.out.println("Digite dois números com ponto flutuante");
            float n5 = entrada.nextFloat();
            float n6 = entrada.nextFloat();
          
            if (n5 > n6) {
                System.out.println("Os números em ordem decrescente são: " + n5 + " e " + n6);
            }
            else {
                System.out.println("Os números em ordem decrescente são: " + n6 + " e " + n5);

                
            
            }

                         System.out.println();
    

            
/////////////////////////


//Exercício 5 - Faça um algoritmo para ler um número inteiro. Verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive). Se estiver, imprima: Pertence ao intervalo, senão

System.out.println("Exercício 5 - Faça um algoritmo para ler um número inteiro. Verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive). Se estiver, imprima: Pertence ao intervalo, senão imprima: Não pertence ao intervalo.");
            System.out.println();
            System.out.println("Digite um número inteiro");
            int n7 = entrada.nextInt();
              if (n7 >= 50 && n7 <= 100) { // (Inclusive) delimita que o valor 50 e 100 também pertencem ao intervalo, portanto eles serão usados como limites.
                System.out.println(" o número digitado pertence ao intervalo");}     
                else {
                    System.out.println(" o número digitado não pertence ao intervalo");

                                                     System.out.println();

                }
            
            
                
            
                
//////////////////////////

//Exercício 6 - Faça um algoritmo que leia a altura e o sexo biológico de uma pessoa. Calcule e mostre o peso ideal dessa pessoa.
// para o sexo masculino: p72, 7 ˆ alturaq ´ 58 (Não é operador XOR, então potenciação.)
// para o sexo feminino: p62, 1 ˆ alturaq ´ 44, 7, aonde ' (Um valor de caractere/string?) representa subtração de acordo com pesquisas na internet e ˆ representa potência. Então:
// Fórmula para o sexo masculino: 72,7 pow altura - 58
// Fórmula para o sexo feminino:  62,1  pow altura - 44,7

System.out.println("Exercício 6 - Faça um algoritmo que leia a altura e o sexo biológico de uma pessoa. Calcule e mostre o peso ideal dessa pessoa.");
System.out.println("Digite sua altura em metros");
double altura = entrada.nextDouble();
System.out.println("Digite seu sexo biológico (M para masculino e F para feminino)");
char sexo = entrada.next(). charAt(0); //Usaremos um char para representar o sexo biológico, pois ele é um caractere único. Mas precisamos de um Index para que o programa saiba qual caractere ler e não confundir com uma String.

double pesoIdealMasculino = 72.7 * Math.pow(altura, 1) - 58;
double pesoIdealFeminino = 62.1 * Math.pow(altura, 1) - 44.7;

char M = 'M';
char F = 'F';

 if (sexo == M) {
     System.out.printf("Seu peso ideal como homem é de: %2f kg\n", pesoIdealMasculino);
    } else if  (sexo == F) {
     System.out.printf("Seu peso ideal como mulher é de: %.2f kg\n", pesoIdealFeminino);
    }



///////////////////////////

//Exercício 7 - A empresa XSoftware concedeu um bônus de 20% do valor do salário a 	todos os funcionários com tempos de trabalho na empresa igual ou superior a cinco anos e de 10% aos demais funcionários.
// Faça um algoritmo que leia o salário e a quantidade de anos de cada 	funcionário, calcule e imprima o valor do bônus.

System.out.println("Exercício 7 - A empresa XSoftware concedeu um bônus de 20% do valor do salário a todos os funcionários com tempos de trabalho na empresa igual ou superior a cinco anos e de 10% aos demais funcionários.");
System.out.println("Faça um algoritmo que leia o salário e a quantidade de anos de cada funcionário, calcule e imprima o valor do bônus.");

System.out.println("Digite seu salário");
double salario = entrada.nextDouble();
System.out.println("Digite quantos anos você trabalha na empresa");
int anosTrabalho = entrada.nextInt();

   if (anosTrabalho >= 5) {
       double bonus = salario * 0.20; // Se o funcionário tiver 5 anos ou mais de empresa, ele recebe 20% (0,20) de bônus.
       System.out.printf("O valor do seu bônus é de: %.2f R$\n", bonus);
   }
   if (anosTrabalho < 5) {
       double bonus2 = salario * 0.10; // Se o funcionário tiver menos de 5 anos de empresa, ele recebe 10% (0,10) de bônus.
         System.out.printf("O valor do seu bônus é de: %.2f R$\n", bonus2);

    }
    
                                        System.out.println();   

//////////////////////////

//Exercício 8 -Faça um algoritmo que verifique a validade de uma senha 	fornecida pelo usuário. sabendo que a senha é R10p5:
//imprimir mensagem de “acesso concedido” ou “acesso negado”. 

System.out.println("Exercício 8 -Faça um algoritmo que verifique a validade de uma senha fornecida pelo usuário. sabendo que a senha é R10p5: imprimir mensagem de 'acesso concedido' ou 'acesso negado'.");
System.out.println("Digite a senha");
String senha = entrada.next();

String senhaCerta = "R10p5";
     if (senha.equals(senhaCerta)) {
        System.out.println("Acesso concedido");}
        else {
        System.out.println("Acesso negado");
        }
                                        System.out.println();   

///////////////////////////

//Exercício 9 - A prefeitura do Rio de Janeiro abriu uma linha de crédito para 	os funcionários estatuários.
//o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//Fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.

System.out.println("Exercício 9 - A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatuários. o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.");
System.out.println("Fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.");

System.out.println("Digite seu salário bruto");
double salarioBruto = entrada.nextDouble();
System.out.println("Digite o valor da prestação");
double valorPrestacao = entrada.nextDouble();
double valorMaximo = salarioBruto * 0.30;// 30% do salário bruto.

        if (valorPrestacao <= valorMaximo) {
            System.out.println("Empréstimo concedido");}
        else {
            System.out.println("Empréstimo não concedido");
        }
                                        System.out.println();   
    
////////////////////////////

//Exercício 10 - Faça um algoritmo para encontrar o maior número entre 3 números inteiros.
//O algoritmo deve ler três inteiros;
//Se forem todos iguais, imprimir: “os números são iguais”;
//Caso contrário, imprimir o maior dos 3 números.

System.out.println("Exercício 10 - Faça um algoritmo para encontrar o maior número entre 3 números inteiros.");

System.out.println("Digite três números inteiros");
int num1 = entrada.nextInt();
int num2 = entrada.nextInt();
int num3 = entrada.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("Os números são iguais");}
            else if (num1 >= num2 && num1 >= num3) {//
                System.out.println("O maior número é: " + num1);}
                else if (num2 >= num1 && num2 >= num3) {//>= Para o caso de dois números serem iguais e maiores que o terceiro, o maior valor será impresso.
                    System.out.println("O maior número é: " + num2);}
                    else {
                        System.out.println("O maior número é: " + num3);
                    }
                                        System.out.println();

///////////////////////////

//Exercício 11 - Faça um algoritmo que receba a idade de um nadador e 	imprima a sua categoria seguindo as regras:
//Categoria Idade
//Infantil A 5 a 7 anos
//Infantil B 8 a 10 anos
//Juvenil A 11 a 13 anos
//Juvenil B 14 a 17 anos
//Sênior 18 anos ou mais

System.out.println("Exercício 11 - Faça um algoritmo que receba a idade de um nadador e imprima a sua categoria seguindo as regras impostas pela academia:");
System.out.println("Categoria Idade");
System.out.println("Infantil A 5 a 7 anos");
System.out.println("Infantil B 8 a 10 anos");
System.out.println("Juvenil A 11 a 13 anos");
System.out.println("Juvenil B 14 a 17 anos");
System.out.println("Sênior 18 anos ou mais");

System.out.println("Digite a idade do nadador");
int idadeNadador = entrada.nextInt();
        if (idadeNadador >= 5 && idadeNadador <= 7) {// Um intervalo de idades é colocado para cada categoria a fim de determinar o perfil do nadador.
            System.out.println("O nadador pertence à categoria Infantil A");}
            else if (idadeNadador >= 8 && idadeNadador <= 10) {
                System.out.println("O nadador pertence à categoria Infantil B");}
                else if (idadeNadador >= 11 && idadeNadador <= 13) {
                    System.out.println("O nadador pertence à categoria Juvenil A");}
                    else if (idadeNadador >= 14 && idadeNadador <= 17) {
                        System.out.println("O nadador pertence à categoria Juvenil B");}
                        else if (idadeNadador >= 18) {
                            System.out.println("O nadador pertence à categoria Sênior");}
                                        System.out.println();      


///////////////////////////

//Exercício 12 - Ler o salário de uma pessoa e calcular e imprimir o desconto do INSS (calculado‼) de acordo com a tabela a seguir:
//<= R$ 600,00	Isento
//R$ 600,00 e <= R$ 1200,00	20%
//R$ 1200,00 e <= R$ 2000,00	25%
//<= R$ 2000,00	30%

 System.out.println("Exercício 12 - Ler o salário de uma pessoa e calcular e imprimir o desconto do INSS (calculado‼) de acordo com a tabela a seguir:");
System.out.println("<= R$ 600,00	Isento");
System.out.println("R$ 600,00 e <= R$ 1200,00	20%");
System.out.println("R$ 1200,00 e <= R$ 2000,00	25%");
System.out.println("<= R$ 2000,00	30%");

System.out.println("Digite seu salário");
double salarioPessoa = entrada.nextDouble();
        if (salarioPessoa <= 600) {//A primeira delimitação de salário é para isenção do desconto do INSS.
            System.out.println("Você está isento do desconto do INSS");}
            else if (salarioPessoa > 600 && salarioPessoa <= 1200) {// A partir daqui começam os descontos.
                double desconto20 = salarioPessoa * 0.20;
                System.out.printf("O valor do desconto do INSS é de: %.2f R$\n", desconto20);}
                else if (salarioPessoa > 1200 && salarioPessoa <= 2000) {
                    double desconto25 = salarioPessoa * 0.25;
                    System.out.printf("O valor do desconto do INSS é de: %.2f R$\n", desconto25);}
                    else {
                        double desconto30 = salarioPessoa * 0.30;
                        System.out.printf("O valor do desconto do INSS é de: %.2f R$\n", desconto30);
                    }
                                        System.out.println();

    ///////////////////////////
    
//Exercício13 - Criar uma calculadora de operações básicas:
//Soma, subtração, multiplicação e divisão.
//O algoritmo deve ler dois números e o sinal correspondente à operação desejada;
//Utilize o tipo char para ler a operação;
//No final deve ser impresso o resultado.
//Restrições:
//Se o sinal digitado não corresponder a uma operação. . .
//Apresentar a mensagem Sinal Inválido e finalizar.
//Para a operação de divisão verificar se o divisor é válido (maior que zero)!
//Caso seja menor ou igual a zero, informar a mensagem “Impossível dividir‼”


    System.out.println("Exercício13 - Criar uma calculadora de operações básicas: Soma, subtração, multiplicação e divisão.");

System.out.println("Ola! Bem vindo à calculadora básica!");

System.out.println("Digite o primeiro número");
double numero1 = entrada.nextDouble();
System.out.println("Digite o segundo número");
double numero2 = entrada.nextDouble();

System.out.println("Digite o sinal correspondente à operação que deseja realizar (+, -, * ou /)");

char operacao = entrada.next().charAt(0);// O char definirá a natureza da operação a ser realizada, e o if e else servirão para navegar pelo menu de opções.

        if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {//A primeira condição verifica se o sinal é inválido, passando pela primeira restrição.
    System.out.println("Sinal Inválido");
    System.out.println("A calculadora será finalizada.");} 
    else { //Adicionado um Else aqui para que, se o sinal for válido, o programa prossiga para as operações. Caso contrário, ele travaria a exceção do resto do código. (Isso já aconteceu)
    if (operacao == '+') {
        double soma = numero1 + numero2;        
        System.out.printf("O resultado da soma é: %.2f\n", soma);
    }
    else if (operacao == '-') {
        double subtracao = numero1 - numero2;
        System.out.printf("O resultado da subtração é: %.2f\n", subtracao);
    }
    else if (operacao == '*') {
        double multiplicacao = numero1 * numero2;
        System.out.printf("O resultado da multiplicação é: %.2f\n", multiplicacao);
    }
    else if (operacao == '/') {
        if (numero2 <= 0) {//A segunda restrição é verificada aqui, para evitar divisão por zero ou números negativos.
            System.out.println("Impossível dividir‼");
        } else {
            double divisao = numero1 / numero2;
            System.out.printf("O resultado da divisão é: %.2f\n", divisao);
        }
    }
}                                                 System.out.println();

           
////////////////////////////////////////////


//Exercício Desafio - Desenvolver um algoritmo para definir se uma pessoa está apta a votar no Brasil.
//Pesquise: Quais são as regras para se votar no Brasil? //ofchart de pesquisa: 
//Identifique quais os dados de entrada necessários para resolver o problema.
//Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta a votar.
//Faça um programa que pede as informações necessárias e verifica se 	uma pessoa está apta a votar.

System.out.println("Exercício Desafio - Desenvolver um algoritmo para definir se uma pessoa está apta a votar no Brasil.");

System.out.println("Digite sua idade");
int idadePessoa = entrada.nextInt(); //O primeiro resultado encontrado na pesquisa foi que a idade mínima para votar é 16 anos.

if (idadePessoa < 16) {
    System.out.println("Você não está apto(a) a votar!");
    System.out.println();
    System.out.println("O programa será finalizado.");
}
else {//Se a pessoa tiver 16 anos ou mais, o programa continuará para a próxima etapa de verificação.

System.out.println("Você é brasileiro(a)? (S para sim e N para não)");
char nacionalidade = entrada.next().charAt(0);//O segundo resultado encontrado na pesquisa foi que apenas brasileiros podem votar.

char S = 'S';
char N = 'N';

        if (idadePessoa >= 16 && nacionalidade == (S) ) {//Então, a condição para votar é ter 16 anos ou mais e ser brasileiro.
            System.out.println("Você está apto(a) a votar!");}
        else if (nacionalidade == (N))
        System.out.println("Você não está apto(a) a votar!");//Logo, se a pessoa não for brasileira.ela não pode votar.
                                        System.out.println();
        }
    entrada.close();


        }









            }
        
    
            
    


                






            
            
        
    
    
    

            

            
        









