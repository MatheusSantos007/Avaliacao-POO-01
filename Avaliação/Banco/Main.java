import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Sistema sistema = new Sistema();

        try (Scanner input = new Scanner(System.in)) {
            int opcao = 1;
            while (opcao != 0){
                System.out.println("---------------------------  ");
                System.out.println("  1 - Cadastrar banco        ");
                System.out.println("  2 - Cadastrar conta        ");
                System.out.println("  3 - Depositar              ");
                System.out.println("  4 - Sacar                  ");
                System.out.println("  5 - Transferir             ");
                System.out.println("  6 - Exibir saldo           ");
                System.out.println("  7 - Exibir extrato         ");
                System.out.println("  8 - Rendimento             ");
                System.out.println("  9 - Desativar conta       ");
                System.out.println("  10 - Reativar conta        ");
                System.out.println("  0 - Fechar sistema         ");
                System.out.println(" --------------------------- ");
                opcao = Integer.parseInt(input.nextLine());
                if(opcao == 1){
                    System.out.println(" Cadastrar banco ");
                    String nomeBanco = input.nextLine();
                    sistema.cadastrarBanco(new Banco(nomeBanco));break;
                }else if(opcao == 2){
                    System.out.println(" Cadastrar conta ");
                    System.out.println("Informe o nome do cliente:");
                    String cliente = input.nextLine();
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o saldo Inicial:");
                    String saldo = input.nextLine();
                    System.out.println("Informe o tipo da conta (1 - Corrente, 2 - Poupança, 3 - Especial)");
                    String tipo = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();
                    SistemaConta conta = null;

                    if(tipo.equals("1")){
                        conta = new ContaPoupanca(cliente, numero, agencia,  Double.parseDouble(saldo), 0.0);
                    }else  if(tipo.equals("2")) {
                        conta = new ContaCorrente(cliente, numero, agencia,  Double.parseDouble(saldo), 0.0);
                    }else  if(tipo.equals("3")) {
                        System.out.println("Informe o limit da conta especial: ");
                        String limit = input.nextLine();
                        conta = new ContaEspecial(cliente, numero, agencia,  Double.parseDouble(saldo), Double.parseDouble(limit));
                    }
                    sistema.cadastrarConta(conta, Integer.parseInt(banco));
                }
                else if(opcao == 3){
                    System.out.println(" Depositar ");
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();
                    System.out.println("Informe o valor a ser depositado:");
                    String valor = input.nextLine();
                    sistema.depositar(Integer.parseInt(banco), numero, agencia, Double.parseDouble(valor));
                }
                else if(opcao == 4){
                    System.out.println(" Sacar ");
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();
                    System.out.println("Informe o valor a ser sacado:");
                    String valor = input.nextLine();
                    sistema.sacar(Integer.parseInt(banco), numero, agencia, Double.parseDouble(valor));
                }else if(opcao == 5){
                    System.out.println(" Transferir ");
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();


                    System.out.println("Informe o número da conta Destino:");
                    String numeroDestino = input.nextLine();
                    System.out.println("Informe a agência da conta Destino:");
                    String agenciaDestino = input.nextLine();
                    System.out.println("Informe o código do banco da conta Destino (veja as opções a seguir):");
                    sistema.listarBancos();
                    String bancoDestino = input.nextLine();

                    System.out.println("Informe o valor a ser transferido:");
                    String valor = input.nextLine();

                    sistema.transferir(Integer.parseInt(banco), numero, agencia, Integer.parseInt(bancoDestino), numeroDestino, agenciaDestino, Double.parseDouble(valor));
                }else if(opcao == 6){
                    System.out.println(" Exibir saldo ");
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();
                    sistema.exibirSaldo(Integer.parseInt(banco), numero, agencia);
                }else if(opcao == 7){
                    System.out.println(" Exibir extrato ");
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();
                    sistema.exibirExtrato(Integer.parseInt(banco), numero, agencia);
                }else if(opcao == 8){
                    System.out.println(" ver rendimento ");
                }else if(opcao == 9){
                    System.out.println(" Desativar conta ");
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();
                    sistema.encerrarConta(Integer.parseInt(banco), numero, agencia);
                }else if(opcao == 10){
                    System.out.println(" Reativar conta ");
                    System.out.println("Informe o número da conta:");
                    String numero = input.nextLine();
                    System.out.println("Informe a agência:");
                    String agencia = input.nextLine();
                    System.out.println("Informe o código do banco (veja as opções a seguir):");
                    sistema.listarBancos();
                    String banco = input.nextLine();
                    sistema.reativarConta(Integer.parseInt(banco), numero, agencia);
                }else if(opcao == 0){
                    System.out.println(" Finalizando sistema ");
                    break;
                }
            }
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }


    }
}
