
import java.util.Scanner;

public class Desafio_Financeiro {
public static void main(String[] args) {

//Crie um algoritmo com um menu para listar os tipos de golpes do sistema financeiro listados pelo Banco Central do Brasil.
// Referência: https://www.bcb.gov.br/meubc/faqs/s/golpes

        System.out.println("/////Menu de Golpes Financeiros/////:"); // Uma estrutura de While poderia ser usada para manter o menu ativo até o usuário decidir sair em (0) por condicional de =!=0.

        System.out.println("Escolha um destes golpes para saber mais:");// Menu de opções de golpes seguido de outras opções relacionadas.
        System.out.println(" 1 - Golpe do Pix");
        System.out.println(" 2 - Golpe do Presente");
        System.out.println(" 3 - Golpe do TED");
        System.out.println(" 4 - Golpe do Cartão");
        System.out.println(" 5 - Golpe do Boleto");
        System.out.println(" 6 - Golpe da maquininha de cartão");
        System.out.println(" 7- Golpe do falso entregador");
        System.out.println(" 8 - Golpe da falsa central de atendimento");
        System.out.println(" 9 - Golpe do valor a receber");
        System.out.println(" 10 - Golpe do nome do BC");
        System.out.println(" 11 - Golpe do Swift");
        System.out.println(" 12 - Golpe do falso agente da prefeitura");
        System.out.println(" 13 - Golpe do falso site do BC");
        System.out.println(" 14 - Golpe do empréstimo");
        System.out.println(" 15 - Como o BC lida com golpes financeiros?\n");

        System.out.println(" 0 - Sair do menu\n");

        System.out.println("Digite o número da opção desejada: ");

        Scanner e = new Scanner (System.in);
        int menu = e.nextInt();

        switch (menu) {//Início do switch case
            case 1:
                                                                        System.out.println();
                System.out.println("Golpe do Pix\n");
                System.out.println("Como ocorre: ocorre quando um usuário é induzido a enviar um Pix para uma conta indicada por um falso amigo, parente ou endereço comercial.\n");
                                                                        
                System.out.println("Como se proteger: verifique sempre os dados do destinatário antes de confirmar a transação."); 
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Pix é instantâneo e irreversível!"); // Mensagens de alerta e informações adicionais são padrões do programa.
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do Pix. E agora?\n ");//Instruções para o usuário que foi vítima do golpe são semelhantes ou idênticas, mas serão expostas em cada case para que nenhuma das opções seja ignorada.
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso e solicitar a devolução dos valores transferidos para o suposto golpista");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");
                System.out.println(" 4 - Monitorar suas contas bancárias e cartões de crédito para identificar qualquer atividade suspeita.");

                break;

            case 2:                                               
                                                                      System.out.println();
                System.out.println("Golpe do Presente\n ");
                System.out.println("Como ocorre: ocorre quando a vítima recebe um presente ou uma oferta de brinde, mas precisa fornecer dados pessoais para retirada.");
                System.out.println("Como se proteger: desconfie de ofertas que parecem boas demais para ser verdade e nunca forneça dados pessoais sem verificar a autenticidade da oferta.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Empresas legítimas não solicitam dados pessoais para entrega de brindes!");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do Presente. E agora? \n ");
                System.out.println("1 - Entrar em contato imediatamente com o banco no qual a conta foi aberta ou o empréstimo foi realizado para pedir o cancelamento.");
                System.out.println("2 - Caso você desconheça o banco que foi utilizado para o golpe, você pode solicitar a emissão do Relatório de Contas e Relacionamentos em bancos (CCS), pelo Sistema Registrato.");
                System.out.println("3 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println("4 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");

                break;
                
            case 3:
                                                                   System.out.println();
                System.out.println("Golpe do TED\n");
                System.out.println("Como ocorre: ocorre quando um estelionatário envia um comprovante de transferência bancária falso para enganar uma pessoa, fazendo-a acreditar que um pagamento foi realizado e liberar um produto");
                System.out.println("ou entregar dinheiro à vítima.");
                System.out.println("Como se proteger: sempre verifique diretamente com o banco ou instituição financeira a veracidade de qualquer transferência antes de agir com base em um comprovante recebido.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Comprovantes de transferência podem ser facilmente falsificados. Sempre confirme com a fonte oficial."); //A redundância é importante para a segurança.
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do TED. E agora?\n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso e solicitar a devolução dos valores transferidos para o suposto golpista.");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia, informando os dados do comprovante da transação: ID da transação, valor, data/hora da liquidação, descrição (caso preenchida), nome do banco do recebedor, nome do recebedor, CPF ou CNPJ; .");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");
                System.out.println(" 4 - Monitorar suas contas bancárias e cartões de crédito para identificar qualquer atividade suspeita.");
             
                break;  

            case 4:
                                                                   System.out.println();
                System.out.println("Golpe do Cartão\n");
                System.out.println("Como ocorre: ocorre quando um estelionatário clona o cartão de crédito ou débito da vítima para realizar compras ou saques indevidos.");
                System.out.println("Como se proteger: nunca compartilhe os dados do seu cartão com terceiros e utilize senhas fortes e únicas para suas contas bancárias.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Fique atento a transações suspeitas em sua conta bancária. O uso de notificações por SMS ou aplicativos pode ajudar a monitorar atividades.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do Cartão. E agora?\n ");
                                                                    
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso e contestar a compra realizada com cartão.");
                System.out.println(" 2 - Solicitar o bloqueio do cartão e a emissão de um novo.");
                System.out.println(" 3 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 4 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");
                System.out.println(" 5  - Monitorar suas contas bancárias e cartões de crédito para identificar qualquer atividade suspeita.");
                break;

            case 5:
                                                                    System.out.println();
                System.out.println("Golpe do Boleto\n");
                System.out.println("Como ocorre: ocorre quando criminosos criam ou adulteram um boleto legítimo para desviar um pagamento, direcionando-o para suas próprias contas bancárias em vez da empresa real\n");
                System.out.println("Como se proteger: sempre verifique o código de barras e os dados do beneficiário antes de efetuar o pagamento de um boleto.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Utilize aplicativos ou sites oficiais para gerar ou pagar boletos. Em caso de dúvida, entre em contato diretamente com a empresa beneficiária.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do Boleto. E agora?\n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso e contestar a compra realizada, informando os dados do Boleto. ");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");
                System.out.println(" 4 - Monitorar suas contas bancárias para identificar qualquer atividade suspeita.");

                break;

            case 6:
                                                                    System.out.println();
                System.out.println("Golpe da maquininha de cartão\n ");
                System.out.println("Como ocorre: ocorre quando um estelionatário instala uma maquininha de cartão falsa ou adulterada para capturar os dados do cartão da vítima durante uma transação.\n");
                System.out.println("Como se proteger: utilize maquininhas de cartão fornecidas por instituições financeiras confiáveis e verifique se a maquininha está em boas condições antes de realizar uma transação.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Fique atento a qualquer comportamento suspeito do operador da maquininha ou da própria maquininha. E sempre cheque o painel da maquininha para confirmar o valor da transação ou se está funcional antes de inserir seu cartão.");
                System.out.println("CUIDADO: Lembre-se que compras por aproximação, por não dependerem de inserção do cartão, podem fazer com que você ignore a presença de um dispositivo fraudulento na maquininha.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe da maquininha de cartão. E agora?\n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso e contestar a compra realizada com cartão.");
                System.out.println(" 2 - Solicitar o bloqueio do cartão e a emissão de um novo.");
                System.out.println(" 3 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 4 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");
                System.out.println(" 5 - Monitorar suas contas bancárias e cartões de crédito para identificar qualquer atividade suspeita.");

                break;
                
            case 7:
                                                                   System.out.println();
                System.out.println("Golpe do falso entregador\n ");
                System.out.println("Como ocorre: ocorre quando a vítima recebe uma ligação falsa do banco dizendo que seu cartão foi clonado e que um motoboy, supostamente autorizado pelo banco, irá buscá-lo."); 
                System.out.println("O motoboy finge que destrói o cartão, mas mantem seu chip intacto.\n");                                                
                System.out.println("Como se proteger: evite compartilhar dados pessoais e bancários, desconfie de solicitações urgentes, verifique sempre a identidade do entregador e nunca entregue seu cartão ou documentos.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Nunca forneça informações pessoais ou financeiras a um entregador sem verificar sua identidade. Em caso de dúvida, entre em contato diretamente com o banco.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do falso entregador. E agora?\n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso e solicitar o bloqueio do cartão.");
                System.out.println(" 2 - Solicitar a emissão de um novo cartão.");
                System.out.println(" 3 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 4 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");  

                break;

            case 8:
                                                                System.out.println();
                System.out.println("Golpe da falsa central de atendimento\n ");
                System.out.println("Como ocorre: ocorre quando a vítima recebe uma ligação ou mensagem de texto de um número que parece ser da central de atendimento do banco,"); 
                System.out.println("solicitando que realize procedimentos de segurança ou que compartilhe informações pessoais ou bancárias.\n");
                System.out.println("Como se proteger: nunca forneça informações pessoais ou bancárias por telefone ou mensagem de texto.");
                System.out.println("Verifique sempre a autenticidade da ligação ou mensagem entrando em contato diretamente com o banco.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Bancos legítimos nunca solicitam informações pessoais ou bancárias por telefone ou mensagem de texto.");
                System.out.println("ATENÇÃO: se receber uma ligação ou mensagem/e-mail desses ou semelhante, não realize nenhum procedimento,");
                System.out.println ("ligue para seu gerente ou entre em contato com os canais oficiais do seu banco para confirmar a informação.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe da falsa central de atendimento. E agora?\n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso e solicitar o bloqueio do cartão, se aplicável.");
                System.out.println(" 2 - Solicitar a emissão de um novo cartão, se aplicável.");
                System.out.println(" 3 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 4 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");

                break;

            case 9:
                                                              System.out.println();
                System.out.println("Golpe do valor a receber\n ");
                System.out.println("Como ocorre: ocorre quando a vítima recebe uma mensagem ou ligação informando que tem um valor a receber, geralmente de um suposto banco ou instituição financeira,");
                System.out.println("e é solicitada a fornecer dados pessoais ou bancários para receber o valor.");
                System.out.println("Como se proteger: desconfie de mensagens ou ligações que prometem valores a receber e nunca forneça dados pessoais ou bancários sem verificar a autenticidade da oferta.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Bancos legítimos não solicitam dados pessoais ou bancários para liberar valores a receber.");
                System.out.println(" NÃO clicar em links suspeitos enviados por e-mail, SMS, WhatsApp ou Telegram;");
                System.out.println(" NÃO fazer qualquer tipo de pagamento para ter acesso aos valores;");
                System.out.println(" NÃO existe a opção de receber algum valor pelo uso de cartões de crédito. Não há lei ou norma do BC sobre recall de cartões de crédito.");

                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do valor a receber. E agora?\n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso.");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");

                break;

            case 10:
                                                             System.out.println();
                System.out.println("Golpe do nome do BC\n ");
                System.out.println("Como ocorre: ocorre quando a vítima recebe uma mensagem ou ligação de um falso representante do Banco Central,");
                System.out.println("solicitando informações pessoais ou bancárias ou oferecendo serviços financeiros falsos.\n");
                System.out.println("Como se proteger: o Banco Central não entra em contato com clientes de bancos ou instituições financeiras.");
                System.out.println("Desconfie de qualquer contato que afirme ser do BC e solicite informações pessoais ou bancárias.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: O Banco Central do Brasil não realiza contato telefônico, por e-mail ou qualquer outro meio com clientes de bancos");
                System.out.println("ou instituições financeiras para solicitar informações pessoais ou bancárias.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do nome do BC. E agora?\n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso.");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");
                
                break;

            case 11:
                                                           System.out.println();
                System.out.println("Golpe do Swift\n ");
                System.out.println("Como ocorre: ocorre quando criminosos invadem ou clonam o e-mail de um fornecedor internacional legítimo e enviam uma fatura com dados bancários internacionais alterados.");
                System.out.println("A empresa brasileira, confiando na veracidade do documento, faz o pagamento para uma conta no exterior controlada por golpistas.\n");
                System.out.println("Como se proteger: use apenas parceiros de câmbio autorizados pelo Banco Central do Brasil. ");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE:Consulte se a empresa é regulamentada pelo Banco Central do Brasil no Cadastro de Instituições e Cadastro de Correspondentes de Câmbio.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do Swift. E agora? \n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso.");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");

                break;

            case 12:
                                                          System.out.println();
                System.out.println("Golpe do falso agente da prefeitura ");
                System.out.println("Como ocorre: ocorre quando a vítima é contatada por telefone, e-mail ou mensagens, onde o golpista se identifica como funcionário da prefeitura ou de um órgão público,");
                System.out.println("informando que há débitos em aberto em nome da vítima e que é necessário realizar um pagamento imediato para evitar multas ou outras penalidades.\n");
                System.out.println("Como se proteger: desconfie de contatos não solicitados e nunca forneça informações pessoais ou bancárias sem verificar a autenticidade do contato.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Órgãos públicos não solicitam pagamentos por telefone, e-mail ou mensagens. Sempre verifique diretamente com a prefeitura ou órgão público em questão.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do falso agente da prefeitura. E agora? \n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso.");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");          
                
                break;
            
            case 13:
                                                         System.out.println();
                System.out.println("Golpe do falso site do BC \n ");
                System.out.println("Como ocorre: ocorre quando a vítima acessa um site falso que imita o site oficial do Banco Central do Brasil, onde são solicitadas informações pessoais ou bancárias.\n");                        
                System.out.println("Como se proteger: sempre verifique o URL do site e certifique-se de que está acessando o site oficial do Banco Central do Brasil (www.bcb.gov.br).");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: O site oficial do Banco Central do Brasil é www.bcb.gov.br. Sempre verifique o URL antes de fornecer qualquer informação.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do falso site do BC. E agora? \n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso.");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC."); 
                System.out.println("Informar o URL malicioso para ajudar na remoção do site falso da internet.");

                break;

            case 14:
                                                       System.out.println();
                System.out.println("Golpe do empréstimo \n ");
                System.out.println("Como ocorre: ocorre quando a vítima é contatada por telefone, e-mail ou mensagens onde o golpista se apresenta como representante de uma instituição financeira,"); 
                System.out.println("oferecendo empréstimos com condições vantajosas, mas solicita o pagamento de taxas ou seguros antecipadamente.\n");
                System.out.println("Como se proteger: desconfie de ofertas de empréstimos que parecem boas demais para ser verdade e nunca pague taxas ou seguros antecipadamente.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Instituições financeiras legítimas não solicitam o pagamento de taxas ou seguros antecipadamente para liberar um empréstimo.");
                System.out.println("==================================================\n");
                System.out.println(" Fui vítima de um golpe do empréstimo. E agora? \n ");
                System.out.println(" 1 - Entrar em contato com seu banco para relatar o caso.");
                System.out.println(" 2 - Registrar um boletim de ocorrência na delegacia mais próxima ou pela internet.");
                System.out.println(" 3 - Denunciar o golpe ao Banco Central por meio do Fale Conosco no site oficial do BC.");  

                break;

            case 15:
                                                      System.out.println();
                System.out.println("Como o BC lida com golpes financeiros? \n");
                System.out.println("O Banco Central do Brasil atua na prevenção e combate a golpes financeiros por meio de diversas ações, incluindo a divulgação de informações e orientações para o público,"); 
                System.out.println("a fiscalização de instituições financeiras e a cooperação com autoridades e órgãos reguladores.");
                System.out.println("Além disso, o BC mantém canais de comunicação para que vítimas de golpes possam denunciar e buscar ajuda, como o Fale Conosco no site oficial do BC.");
                System.out.println("\n==================================================");
                System.out.println("IMPORTANTE: Se você foi vítima de um golpe financeiro, é importante relatar o caso ao Banco Central e às autoridades competentes para ajudar na investigação e prevenção de futuros golpes.");
                System.out.println("==================================================\n");
                System.out.println("Dicas gerais de segurança: ");
                                                                System.out.println();
                System.out.println(" 1 - Nunca compartilhe suas senhas ou informações bancárias com terceiros, nem seus cartões.");
                System.out.println(" 2 - Verifique sempre a autenticidade de qualquer contato ou oferta relacionada a serviços financeiros.");
                System.out.println(" 3 - Utilize senhas fortes e únicas para suas contas bancárias e financeiras.");
                System.out.println(" 4 - Monitore regularmente suas contas bancárias e cartões de crédito para identificar qualquer atividade suspeita.");
                System.out.println(" 5 - Não transferir dinheiro a pedido de conhecidos enviado por aplicativos de mensagens (WhatsApp ou Telegram, por exemplo),");
                System.out.println(" 6 - Não fornecer dados pessoais ou bancários em resposta a mensagens ou ligações não solicitadas;");
                System.out.println(" 7 - Não clicar em links suspeitos enviados por e-mail, SMS, WhatsApp ou Telegram;");
                System.out.println(" 8 - Não fazer qualquer tipo de pagamento para ter acesso a valores;");
                System.out.println(" 9 - Utilizar apenas parceiros de câmbio autorizados pelo Banco Central do Brasil.");
                System.out.println(" 10 - Consulte se a empresa é regulamentada pelo Banco Central do Brasil no Cadastro de Instituições e Cadastro de Correspondentes  de Câmbio.");   

        
                break;

            case 0:
            
                System.out.println("Saindo do menu. Obrigado por usar o sistema de informações sobre golpes financeiros.");

                break;



        }

        

e.close();







        
        
        




    }

}

