public class ExerciciosWhileDoWhile { // Gabriel Rodrigues Ramos 
public static void main (String [] args) {

// Exercício 1 - Escreva um algoritmo que imprima a sequência do número 100 ao 200.

System.out.println("Exercício 1 - Escreva um algoritmo que imprima a sequência do número 100 ao 200.");

int numero = 100;

while (numero <= 200) { // Enquanto o valor não for maior que 200, o loop continua. 
    System.out.print(numero + " ");
    numero++;
    
}

//Exercício 2 - Faça um algoritmo que leia 10 números inteiros e diga:
//Quantos são pares;
//Quantos são ímpares.

java.util.Scanner e = new java.util.Scanner(System.in);

int contPares = 0;
int contImpares = 0;
int contNumerosInteiros = 0;

System.out.println();

System.out.println("\nExercício 2 - Digite 10 números inteiros:");

while (contNumerosInteiros < 10) { // Loop para ler 10 números inteiros. Ele não para até que 10 números sejam lidos.
    System.out.print("Digite o número desejado em " + (contNumerosInteiros + 1) + "º: ");
    int numeroLido = e.nextInt();
    if (numeroLido % 2 == 0) { // Verificador de paridade.
        contPares++;
    } else {
        contImpares++;
    }
    contNumerosInteiros++;}


System.out.println("Quantidade de números pares: " + contPares);
System.out.println("Quantidade de números ímpares: " + contImpares);

System.out.println ();

//Exercício 3 - Construir um algoritmo que leia um número inteiro e imprime a sequência:
//1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024. . .
//enquanto o valor da sequência for menor ou igual ao número lido.

System.out.println();

System.out.println("Exercício 3 - Construir um algoritmo que leia um número inteiro e imprime a sequência: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024...");
System.out.println("enquanto o valor da sequência for menor ou igual ao número lido.");
System.out.println ();
System.out.print("Digite um número inteiro: ");

System.out.println ();

int numeroInteiro = e.nextInt();

int sequencia = 1; // Inicia a sequência com o valor 1.

while (sequencia <= numeroInteiro) { // Loop que imprime a sequência enquanto o valor for menor ou igual ao número lido.
    System.out.print(sequencia + " ");
    sequencia *= 2; // Multiplica o valor da sequência por 2 a cada iteração.

} // Fim do loop da sequência.


// Exercício 4 - Faça um algoritmo que imprima a metade de cada número de 10 a 20.
//Exemplo:
//A metade de 10 é 5.0
//A metade de 11 é 5.5
//A metade de 12 é 6.0

int num10a20 = 10;

System.out.println();

System.out.println("Exercício 4 - Faça um algoritmo que imprima a metade de cada número de 10 a 20.");

System.out.println ();

while (num10a20 <= 20) { // Loop que imprime a metade de cada número de 10 a 20.
    double metade = num10a20 / 2.0; // Calcula a metade do número atual.
    System.out.println("A metade de " + num10a20 + " é " + metade);
    num10a20++;}

    System.out.println ();

// Exercício 5 - - Faça um algoritmo que imprima a tabuada do 5.

System.out.println();

System.out.println("Exercício 5 - Faça um algoritmo que imprima a tabuada do 5.");

System.out.println ();


int tabuada = 1;
while (tabuada <= 10) {
    int resultado = 5 * tabuada;
    System.out.println("5 * " + tabuada + " = " + resultado); // Fiquei em dúvida se eu deveria usar * ou x para representar a multiplicação na impressão.
    tabuada++;}

// Exercício 6 - Faça um algoritmo que leia dez números inteiros e positivos
// Mostre o menor entre eles.

System.out.println();

System.out.println("Exercício 6 - Faça um algoritmo que leia dez números inteiros e positivos e mostre o menor entre eles.");

int contadorSemZero = 1; // O contador inicia de 1 porque 0 não é um número positivo, e sim neutro.
int menorNumero = 0;
int numeroPositivo = 0;

while (contadorSemZero <= 10) {
    System.out.print("Digite o " + contadorSemZero + "º número inteiro e positivo: ");
    numeroPositivo = e.nextInt();
    
    if (numeroPositivo <= 0) { // Criamos uma verificação para garantir que o número seja positivo.
        System.out.println("Número inválido. Por favor, digite um número inteiro e positivo.");
        continue; //Semelhante ao 'break', mas faz o loop continuar sem incrementar o contador.
    }
    if (contadorSemZero == 1) { // Se for o primeiro número, inicializa o menor número com ele.
        menorNumero = numeroPositivo;
    } else {
        if (numeroPositivo < menorNumero) { 
            menorNumero = numeroPositivo;
        }
    }
    contadorSemZero++;
}

System.out.println();

System.out.println("O menor número digitado é: " + menorNumero);

//Exercício 7 - Faça um algoritmo que leia a altura e o peso de 10 pessoas.
//Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem obesidade.
//Dados: IMC = peso / (altura * altura);
System.out.println();

System.out.println("Exercício 7 - Faça um algoritmo que leia a altura e o peso de 10 pessoas.");
System.out.println("Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem obesidade.");

int contadorPessoas = 1;
int pessoasSemObesidade = 1;

while (contadorPessoas <= 10) {
    System.out.print("Digite a altura da " + contadorPessoas + "ª pessoa (em metros): ");
    double altura = e.nextDouble();
    System.out.print("Digite o peso da " + contadorPessoas + "ª pessoa (em kg): ");
    double peso = e.nextDouble();
    
    double imc = peso / (altura * altura);
    System.out.printf("O IMC da %dª pessoa é: %.2f%n", contadorPessoas, imc);
    
    if (imc >= 18.5 && imc <= 24.9) { // && é o operador lógico "E", que exige que ambas as condições sejam verdadeiras.
        pessoasSemObesidade++;
    }
    
    contadorPessoas++;}

System.out.println("Número de pessoas sem obesidade: " + pessoasSemObesidade);


//Exercício 8 - Faça um programa que:
//Leia duas notas de 5 alunos
//Calcule e mostre a média aritmética de cada um deles;
//Para cada nota lida:
//A entrada de cada nota deve ser validada!
//ou seja, o programa somente avança se a entrada da nota estiver entre 0 e 10.
//caso contrário, solicite-a novamente.
//Utilize o do.. . while para validar as notas.

System.out.println();

System.out.println("Exercício 8 - Faça um programa que leia duas notas de 5 alunos, calcule e mostre a média aritmética de cada um deles.");
System.out.println("Para cada nota lida, a entrada de cada nota deve ser validada! Ou seja, o programa somente avança se a entrada da nota estiver entre 0 e 10.");
System.out.println("Caso contrário, solicite-a novamente. Utilize o do.. . while para validar as notas.");

 for (int i = 1; i <= 5; i++) {
            System.out.println("--- ALUNO " + i + " ---");
            
            double nota1, nota2;
            
            // Leitura e validação da primeira nota (do e while feitos para checagem)
            do {
                System.out.print("Digite a primeira nota (0-10): ");
                nota1 = e.nextDouble();
                
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10. Tente novamente.");
                }
            } while (nota1 < 0 || nota1 > 10);
            
            // Leitura e validação da segunda nota
              do {
                System.out.print("Digite a segunda nota (0-10): ");
                nota2 = e.nextDouble();
        
               if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10. Tente novamente.");
                }
            } while (nota2 < 0 || nota2 > 10);
            
            // Cálculo e exibição da média
            double media = (nota1 + nota2) / 2;
            System.out.printf("Média do aluno %d: %.2f%n", i, media);
            
            System.out.println();
        }
        
        System.out.println("Programa finalizado!");


//Exercício 9 - Dado o cardápio de uma lanchonete:
//código   produto       preço
// 100  Cachorro quente  1,20
// 101  Bauru Simples    1,30
// 102  Bauru com ovo    1,50
// 103  Hambúrguer       1,20
// 104  Cheeseburguer    1,30
// 105  Refrigerante     1,00

//Faça um algoritmo que leia o código do produto e a quantidade que o cliente deseja comprar.
//O cliente pode comprar mais de um produto, pergunte se ele deseja continuar comprando.
//Calcule o valor total a ser pago por cada produto e o valor total da compra

System.out.println( "Exercício 9 - Dado o cardápio de uma lanchonete:código   produto       preço\r\n" +
        "// 100  Cachorro quente  1,20\r\n" + 
        "// 101  Bauru Simples    1,30\r\n" + 
        "// 102  Bauru com ovo    1,50\r\n" + 
        "// 103  Hambúrguer       1,20\r\n" + 
        "// 104  Cheeseburguer    1,30\r\n" + 
        "// 105  Refrigerante     1,00");  

        System.out.println ("Faça um algoritmo que leia o código do produto e a quantidade que o cliente deseja comprar.\r\n");
        System.out.println("O cliente pode comprar mais de um produto, pergunte se ele deseja continuar comprando.\r\n");
        System.out.println("Calcule o valor total a ser pago por cada produto e o valor total da compra");
        //Este exercício é complexo e irá usar praticamente todos os conteúdos vistos até agora na disciplina. 

           System.out.println("Digite o código do produto: ");
        int codigo = e.nextInt();
        System.out.println("Digite a quantidade que deseja comprar: ");
        int quantidade = e.nextInt();
        double preco = 0;
        double total = 0;
        double totalCompra = 0;
        String produto = "";
        String continuar = "s";
            
        while (continuar.equals("s")) {
            switch (codigo) {
                case 100:
                    preco = 1.20;
                    produto = "Cachorro quente";
                    break;
                case 101:
                    preco = 1.30;
                    produto = "Bauru Simples";
                    break;
                case 102:
                    preco = 1.50;
                    produto = "Bauru com ovo";
                    break;
                case 103:
                    preco = 1.20;
                    produto = "Hambúrguer";
                    break;
                case 104:
                    preco = 1.30;
                    produto = "Cheeseburguer";
                    break;
                case 105:
                    preco = 1.00;
                    produto = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido");
                    break;}

            total = preco * quantidade;
            totalCompra += total;

            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço: " + preco);
            System.out.println("Total: " + total);
            System.out.println("Deseja continuar comprando? (s/n)");
            continuar = e.next();

            if (continuar.equals("s")) {
                System.out.println("Digite o código do produto: ");
                codigo = e.nextInt();
                System.out.println("Digite a quantidade que deseja comprar: ");
                quantidade = e.nextInt();}
                
            if (continuar.equals("n")) {
                System.out.println("Total da compra: " + totalCompra);
                System.out.println("Obrigado por comprar conosco! O programa irá finalizar agora.");
                break;}

    
    
        }

}
}





   
