import java.util.Scanner;
public class ExerciciosFor{
public static void  main (String [] args) {

//Exercício 1 - Faça um programa que imprima a seguinte sequência: 100, 99, 98, . . . 1.

System.out.println("Exercício 1 - Faça um programa que imprima a seguinte sequência: 100, 99, 98, . . . 1.");

for (int cont = 100; cont >=1;cont--){ // variável cont iniciando em 100, enquanto cont for maior ou igual a 1, decrementa 1.
    System.out.print(cont + "  ");}// imprime o valor de cont seguido de um espaço.


//Exercício 2 -Faça um algoritmo que apresente na tela os quadrados dos números inteiros de 15 a 100.
// Exemplo:O quadrado de 15 é 225, O quadrado de 16 é 256 ... O quadrado de 100 é 10000.

System.out.println("\n\nExercício 2 - Faça um algoritmo que apresente na tela os quadrados dos números inteiros de 15 a 100.\nExemplo: O quadrado de 15 é 225, O quadrado de 16 é 256 ... O quadrado de 100 é 10000\n");

for (int cont2 = 15; cont2 <=100; cont2++){ // variável cont2 iniciando em 15, enquanto cont2 for menor ou igual a 100, incrementa 1.
    int quadrado = cont2 * cont2; // variável quadrado recebe o valor de cont2 multiplicado por ele mesmo.
    System.out.println("O quadrado de " + cont2 + " é " + quadrado + ""); // imprime o valor de cont2 e o valor de quadrado.

}

//Exercício 3 - Ler um número inteiro e imprimir na tela a sequência de números que vai do número 1 até o número lido.
//Exemplo:¨ Digite um número:¨ 8¨ Sequência: 1 2 3 4 5 6 7 8.

System.out.println("\nExercício 3 - Ler um número inteiro e imprimir na tela a sequência de números que vai do número 1 até o número lido.\n Exemplo:¨ Digite um número:¨ 8¨ Sequência: 1 2 3 4 5 6 7 8.\n");

Scanner e = new Scanner(System.in);

System.out.print("Digite um número: ");

int numeroDigitado = e.nextInt();

for (int cont3 = 1; cont3 <= numeroDigitado; cont3++){

   System.out.print(cont3 + " ");



}

//Exercício 4 -Faça um algoritmo que receba a idade e a altura de 10 pessoas:
 //calcule e mostre a média das alturas daquelas com mais de 50 anos.

System.out.println("\n\nExercício 4 - Faça um algoritmo que receba a idade e a altura de 10 pessoas:\n calcule e mostre a média das alturas daquelas com mais de 50 anos.\n");

System.out.println("Digite a idade e a altura de 10 pessoas:"); // Misturaremos For e If Else no mesmo exercício.

double somaAlturaMaisVelha = 0; // Começa a soma das alturas em 0.
int contadorPessoasMaisVelhas = 0; // Começa o contador de pessoas com mais de 50 anos em 0.

  for (int cont = 0; cont < 10; cont++) { // Determina que o contador inicie em 0, enquanto for menor que 10, incrementa 1.
            System.out.println("\nPessoa " + (cont + 1) + ":"); // Mostra o número de pessoas (cont + 1 para começar de 1).
            System.out.print("Digite a idade: ");
            int idade = e.nextInt();

            System.out.print("Digite a altura (em metros): ");
            double altura = e.nextDouble();

             if (idade > 50) {
                somaAlturaMaisVelha += altura; // Acumula a altura das pessoas com mais de 50 anos.
                contadorPessoasMaisVelhas++;} // Incrementa o contador de pessoas com mais de 50 anos.
             } // Fecha o loop for para que as condições sejam verificadas ao final do programa.

            if (contadorPessoasMaisVelhas > 0) {
            double mediaAlturasMaisVelhas = somaAlturaMaisVelha / contadorPessoasMaisVelhas;
            System.out.printf("\nA média das alturas das pessoas com mais de 50 anos é: %.2f metros\n", mediaAlturasMaisVelhas);
        } else {
            System.out.println("\nNão foram encontradas pessoas com mais de 50 anos.");
        }
        
//Exercício 5 - Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:
//a) A média aritmética das duas notas de cada aluno;
//b) Forneça a seguinte mensagem de acordo com a nota:
//¨ REPROVADO se média é menor ou igual a 3.
//¨ EXAME se média é acima de 3 e menor que 7.
//¨ APROVADO maior ou igual a 7
//c) O total de alunos aprovados.
//d) O total de alunos de exame.
//e) O total de alunos reprovados.
//f) A média da classe.

System.out.println("\nExercício 5 - Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:\n a) A média aritmética das duas notas de cada aluno;\n b) Forneça a seguinte mensagem de acordo com a nota:\n ¨ REPROVADO se média é menor ou igual a 3.\n ¨ EXAME se média é acima de 3 e menor que 7.\n ¨ APROVADO maior ou igual a 7\n c) O total de alunos aprovados.\n d) O total de alunos de exame.\n e) O total de alunos reprovados.\n f) A média da classe.\n");
// Aqui teremos formatação de saída com printf, uso de if, else if e else e contadores.
System.out.println("Digite duas notas para cada aluno (seis alunos):");

int totalAprovados = 0;
int totalExame = 0;
int totalReprovados = 0;
double somaMedias = 0.0;

for (int cont = 1; cont <= 6; cont++) {
    System.out.println("\nAluno " + cont + ":");
    System.out.print("Digite a primeira nota: ");
    double nota1 = e.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = e.nextDouble();

    double media = (nota1 + nota2) / 2; 
    System.out.printf("A média do aluno %d é: %.2f\n", cont, media); 

    somaMedias += media;//

    if (media <= 3) {
        System.out.println("REPROVADO");
        totalReprovados++;
    } else if (media < 7) {
        System.out.println("EXAME");
        totalExame++;
    } else {
        System.out.println("APROVADO");
        totalAprovados++;
    }
}

System.out.println("\nTotal de alunos aprovados: " + totalAprovados);
System.out.println("Total de alunos de exame: " + totalExame);
System.out.println("Total de alunos reprovados: " + totalReprovados);
System.out.printf("Média da classe: %.2f\n", somaMedias / 6);

//Exercício 6 - Em uma eleição presidencial, existem quatro candidatos.
//Os votos são informados através de um código:
//¨ 1, 2, 3 ou 4 - Voto para o respectivo candidato
//¨ 5 - Voto nulo
//¨ 6 - Voto em branco

//Faça um algoritmo que leia o voto de 10 eleitores.
//Calcule e mostre:
//a) O total de votos para cada candidato;
//b) O total de votos nulos;
//c) O total de votos em branco;
//d) O percentual dos votos brancos e nulos.

System.out.println("\nExercício 6 - Em uma eleição presidencial, existem quatro candidatos.\n Os votos são informados através de um código:\n ¨ 1, 2, 3 ou 4 - Voto para o respectivo candidato\n ¨ 5 - Voto nulo\n ¨ 6 - Voto em branco\n\n Faça um algoritmo que leia o voto de 10 eleitores.\n Calcule e mostre:\n a) O total de votos para cada candidato;\n b) O total de votos nulos;\n c) O total de votos em branco;\n d) O percentual dos votos brancos e nulos.\n");
// Aqui cabe o uso de switch case por conta das opções de voto.

int votosCandidato1 = 0;
int votosCandidato2 = 0;
int votosCandidato3 = 0;
int votosCandidato4 = 0;
int votosNulos = 0;
int votosBrancos = 0;

for (int cont = 1; cont <= 10; cont++) {
    System.out.print("Eleitor " + cont + ", digite seu voto (1-4 para os candidatos, 5 para nulo, 6 para branco): ");
    int voto = e.nextInt();

    switch (voto) {
        case 1:
            votosCandidato1++;
            break;
        case 2:
            votosCandidato2++;
            break;
        case 3:
            votosCandidato3++;
            break;
        case 4:
            votosCandidato4++;
            break;
        case 5:
            votosNulos++;
            break;
        case 6:
            votosBrancos++;
            break;
        default:
            System.out.println("Voto inválido. Por favor, digite um número entre 1 e 6.");
            cont--; // Decrementa o contador para repetir o voto deste eleitor.
            break;} 
            } // Fecha o loop for para que as condições sejam verificadas ao final do programa.

            System.out.println("\nResultados:");
            System.out.println("Total de votos para o Candidato 1: " + votosCandidato1);
            System.out.println("Total de votos para o Candidato 2: " + votosCandidato2);
            System.out.println("Total de votos para o Candidato 3: " + votosCandidato3);
            System.out.println("Total de votos para o Candidato 4: " + votosCandidato4);    
            System.out.println("Total de votos nulos: " + votosNulos);
            System.out.println("Total de votos em branco: " + votosBrancos);
            System.out.printf("Percentual de votos nulos: %.2f%%\n", (votosNulos / 10.0) * 100);
            System.out.printf("Percentual de votos em branco: %.2f%%\n", (votosBrancos / 10.0) * 100);


    //Exercício 7 - Faça um algoritmo que receba a idade, a altura e o peso de 10 pessoas, 	calcule e mostre:
//a) A quantidade de pessoas maiores de 50 anos.
//b) A média das alturas das pessoas com idade entre 10 e 20 anos.
//c) A porcentagem de pessoas com peso inferior a 40 quilos.

System.out.println("\nExercício 7 - Faça um algoritmo que receba a idade, a altura e o peso de 10 pessoas, calcule e mostre:\n a) A quantidade de pessoas maiores de 50 anos.\n b) A média das alturas das pessoas com idade entre 10 e 20 anos.\n c) A porcentagem de pessoas com peso inferior a 40 quilos.\n");

int contMaisDe50 = 0;
int cont10a20 = 0;
int contPesoInferior40 = 0;
double somaAlturas10a20 = 0.0;

System.out.println("Digite a idade, a altura (em metros) e o peso (em kg) de 10 pessoas:");

for (int cont = 1; cont <= 10; cont++) {
    System.out.println("\nPessoa " + cont + ":");
    System.out.print("Digite a idade: ");
    int idade = e.nextInt();

    System.out.print("Digite a altura (em metros): ");
    double altura = e.nextDouble();

    System.out.print("Digite o peso (em kg): ");
    double peso = e.nextDouble();

    if (idade > 50) {
        contMaisDe50++; // Incrementa o contador de pessoas com mais de 50 anos.
    }
    if (idade >= 10 && idade <= 20) {
        somaAlturas10a20 += altura;
        cont10a20++; // Incrementa o contador de pessoas com idade entre 10 e 20 anos.
    }
    if (peso < 40) {
        contPesoInferior40++; // Incrementa o contador de pessoas com peso inferior a 40 quilos.
    }
}

System.out.println("\nQuantidade de pessoas maiores de 50 anos: " + contMaisDe50);

if (cont10a20 > 0) {
    double mediaAlturas10a20 = somaAlturas10a20 / cont10a20;
    System.out.printf("Média das alturas das pessoas com idade entre 10 e 20 anos: %.2f metros\n", mediaAlturas10a20);
} else {
    System.out.println("Não há pessoas com idade entre 10 e 20 anos.");
}

double percentualPesoInferior40 = (contPesoInferior40 / 10.0) * 100;
System.out.printf("Porcentagem de pessoas com peso inferior a 40 quilos: %.2f%%\n", percentualPesoInferior40);

e.close ();









    







}
}



