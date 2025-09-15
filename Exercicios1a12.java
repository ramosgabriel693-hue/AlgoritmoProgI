import java.util.Scanner;

public class Exercicios1a12 {
    public static void main(String[] args) {

        // Exercícios 1-12, Gabriel Rodrigues Ramos//
        System.out.println();
//Exercício 1 - Informações de Cadastro
  System.out.println();

System.out.println("Exercício 1 - Informações de Cadastro");
System.out.println("Nome: Gabriel Rodrigues Ramos");
System.out.println("Idade: 28 anos");
System.out.println("Altura: 1.98m");
System.out.println("Registro Acadêmico: 1143303419");
System.out.println("Curso: Tecnologia em Análise e Desenvolvimento de Sistemas");
////////////////////////
//Exercício 2 - Checagem de Presença
System.out.println();

System.out.println("Exercício 2 - Checagem de Presença");
System.out.println("O aluno está presente");
///////////////////////
//Exercício 3 - Construção do Produto de Dois Números Inteiros
  System.out.println();

System.out.println("Exercício 3 - Construção do Produto de Dois Números Inteiros");
Scanner s = new Scanner(System.in);      //Esse Scanner será usado pelo resto do código e fechado apenas ao término dele, evitando assim que seja necessário fazer um arquivo jav para cada exercício
System.out.println("Digite dois números inteiros:");
int a = s.nextInt();
int b = s.nextInt();
int c = a * b;

System.out.println("O produto dos dois números escolhidos é:" + c);
///////////////////////
//Exercício 4 - Construção do Algoritmo e sua Soma
  System.out.println();

System.out.println("Exercício 4 - Construção do Algoritmo e sua Soma");
System.out.println("Digite quatro números inteiros:");

int d = s.nextInt();
int e = s.nextInt();
int f = s.nextInt();
int g = s.nextInt();

System.out.println("A soma dos quatro números escolhidos é:" + (d + e + f + g));

///////////////////////

//Exercício 5 - Construção do Algoritmo e sua Média Aritmética
  System.out.println();

System.out.println("Exercício 5 - Construção do Algoritmo e sua Média Aritmética");
System.out.println("Digite as três notas do aluno:");

double h = s.nextDouble();
double i = s.nextDouble();
double j = s.nextDouble();
double media = (h + i + j) / 3;

System.out.printf("A média do aluno é: %.2f",media);

///////////////////////
   System.out.println();
//Exercício 6 - Calculando e imprimindo o valor de expressões
  System.out.println();

System.out.println("Exercício 6 - Calculando e imprimindo o valor de expressões");
System.out.println("a) (20 - 15)/2");
double a1 = (20 - 15) / 2;                       // Para não causar duplicidade, um número após a variável a -> a1 [...]
System.out.println("O resultado impresso é:"+ a1);
        System.out.println();
System.out.println("b) 2 ˆ (5/20) + 30 / (15 ˆ 2)");
double b1 = Math.pow(2, (5.0 / 20)) + 30 / Math.pow(15, 2);
System.out.printf("O resultado impresso é:%.2f", b1);
        System.out.println();
System.out.println("c) 35 / (6 + 2)");
double c1 = 35 / (6 + 2);
System.out.printf("O resultado impresso é:%.2f", c1);
        System.out.println();   
System.out.println("d) 23 módulo 4");
int d1 = 23 % 4;
System.out.printf("O resultado impresso é:%d", d1);

////////////////////////
        System.out.println();
//Exercício 7 - Imprimir o resultado lógico de uma operação (O resultado deve ser true ou false)
        
        System.out.println();

System.out.println("Exercício 7 - Imprimir o resultado lógico de uma operação em true ou false");
System.out.println("a)((120 - 30) = (3 ˆ 30))");

boolean cond1 = true;
boolean cond2 = false;
                           
if ((120 - 30) == Math.pow(3, 30)) {
    System.out.println("A expressão é:" + cond1);
} else {
    System.out.println("A expressão é:" + cond2);
}
        System.out.println();

System.out.println("b) (não ((20 módulo 4/2 )= 1) ou (9 != 9))");
boolean cond3 = true;
boolean cond4 = false;

if (!((20 % 4 / 2) == 1) || (9 != 9)) {           // 9!=9 sempre resulta em false (Warning: Dead code/ Identical expressions)
    System.out.println("A expressão é:" + cond3);
} else {
    System.out.println("A expressão é:" + cond4);
}


        System.out.println();

  System.out.println("c)((5 módulo 2 ) > 3)");
boolean cond5 = true;
boolean cond6 = false;

if ((5 % 2) > 3) {
    System.out.println("A expressão é:" + cond5);
} else {
    System.out.println("A expressão é:" + cond6);
}

    System.out.println();

    System.out.println(("d) (a = A)"));
    boolean cond7 = true;
    boolean cond8 = false;

                                                    //Valores de Char para A e a 
    char letraA = 'A';
    char letraa = 'a';
    if (letraa == letraA) {
        System.out.println("A expressão é:" + cond7);
    } else {
        System.out.println("A expressão é:" + cond8);
    } 
    

/////////////////////////
           System.out.println();
//Exercício 8 - Representação da média de três notas dadas. Mostrar o cálculo
           System.out.println();

System.out.println("Exercício 8 - Faça um algoritmo para apresentar: o cálculo da média das seguintes notas 8.0, 7.5, 4.5 e 9.");

float nota1 = 8.0f;
float nota2 = 7.5f;
float nota3 = 4.5f;
float nota4 = 9.0f;

System.out.println("Média = (8.0 + 7.5 + 4.5 + 9.0) / número de notas");
System.out.println("Média = (8.0 + 7.5 + 4.5 + 9.0) / 4");
float media2 = (nota1 + nota2 + nota3 + nota4) / 4;
           System.out.println();

System.out.printf("A média das notas é: %.2f\n", media2);

///////////////////////

//Exercício 9 - Cálculo de um Quadrado com lado dado. Mostrar o cálculo
           System.out.println();

System.out.println("Exercício 9 -Faça um Algoritmo para representar o cálculo da área de um quadrado com 350 metros de lado\n.");

int lado = 350;
int area = lado * lado;
System.out.println("Área do quadrado = lado * lado");
System.out.println("Área do quadrado = 350 * 350");
System.out.printf("A área do quadrado é: %d m²\n", area);

///////////////////////

//Exercício 10 - Construir um algoritmo para imprimir: o cálculo da área de um círculo com raio de 5 cm. (π = 3.14159) (área do círculo = π ˆ r2). Mostrar o cálculo
                   System.out.println();
System.out.println("Exercício 10 - Construção de um algoritmo para imprimir: o cálculo da área de um círculo com raio de 5 cm.");
double r = 5.0;                              //Utilizar Pontos ao invés de Vírgulas
double pi = Math.PI;
double areaCirculo = pi * Math.pow(r,2);   // CamelCase para areaCirculo

System.out.println("Área do círculo = pi * r²");
System.out.println("Área do círculo = " + "3,14" + " * " + r + "^2");   // O valor de Pi está em aspas para que seja mostrado visualmente sem ser calculado no primeiro momento
System.out.printf("A área do círculo é: %.2f cm²\n", areaCirculo);
                                    System.out.println();

///////////////////////


//Exercício 11 - Construir um algoritmo que leia o ano de nascimento de uma pessoa e o ano atual. Depois, calcule e mostre a idade atual dessa pessoa e quantos anos ela terá em 2030

System.out.println("Exercício 11 - Construção de um algoritmo que leia o ano de nascimento de uma pessoa. o ano atual e depois diga quantos anos ela terá em 2030");
System.out.println("Digite o seu ano de nascimento:");
int anoNascimento = s.nextInt();
System.out.println("Digite o ano atual:");
int anoAtual = s.nextInt();

int idade = anoAtual - anoNascimento;
int idade2030 = 2030 - anoNascimento;
                                           System.out.println();
System.out.println("A idade atual é: " + idade + " Anos ");
System.out.println();
System.out.println("Em 2030, a idade será: " + idade2030 + " Anos");
                                        System.out.println();
///////////////////////

//Exercício 12 - Construção de um Algoritmo que receba um número e calcule: Elevado ao quadrado, ao cubo, sua raíz quadrada e elevado por 10

System.out.println("Exercício 12 - Construção de um Algoritmo que receba um número e calcule: Elevado ao quadrado, ao cubo, sua raíz quadrada e elevado por 10");

System.out.println("Digite um número:"); 
double numNovo = s.nextDouble();

double numNovo2 = Math.pow(numNovo, 2);
double numNovo3 = Math.pow(numNovo, 3);
double numNovo4 = Math.sqrt(numNovo);
double numNovo5 = Math.pow(numNovo,10);

System.out.printf("O número elevado ao quadrado é: %.2f\n", numNovo2);
System.out.printf("O número elevado ao cubo é: %.2f\n", numNovo3);
System.out.printf("A raíz quadrada do número é: %.2f\n", numNovo4);
System.out.printf("O número elevado a dez é: %.2f\n", numNovo5);

s.close();                 //Fechando o Scanner após o uso em todos os exercícios            
            
                          System.out.println();


    System.out.println("////////////////////////////");
                      System.out.println();
                    
    System.out.println(" FIM DOS EXERCÍCIOS");
    }
}
