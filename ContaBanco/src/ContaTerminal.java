import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println(
      "Bem vindo ao banco do Java!\nIrei te auxiliar no Processo de abertura de conta.\nPara iniciar digite o seu nome e aperte a tecla ENTER.\n"
    );
    String nome = scanner.next();
    System.out.println(
      "Agora digite o número da agência em que deseja criar a conta\n(números válidos: entre 1 a 2000)\n"
    );

    int agencia = 0;

    do {
      agencia = scanner.nextInt();
      if (agencia < 1 || agencia > 2000) System.out.println(
        "Número de agência inválida, por favor digite novamente.\n"
      );
    } while (agencia < 1 || agencia > 2000);

    System.out.println(
      "Agora iremos gerar o número da conta automaticamente baseado em sua agência e região."
    );
    double rndNmb = Math.random() * 5000;
    int conta = (int) rndNmb;

    System.out.println(
      "Ótimo, já definimos qual será sua conta, agora vamos falar do seu saldo.\nDigite um número válido para fazer o seu primeiro deposito, ou 0 caso não queira fazer um deposito.\n"
    );

    double saldo;
    do {
      saldo = scanner.nextDouble();
      if (saldo < 0) System.out.println(
        "Não é possível depositar valores negativos.\n"
      );
    } while (saldo < 0);

    System.out.println("Parabéns! sua conta foi criada.");

    if (saldo > 0) System.out.println(
      nome +
      ", obrigado por criar uma conta em nosso banco, sua agência é  " +
      agencia +
      ", conta: " +
      conta +
      ", e seu saldo " +
      saldo +
      " já está disponível para saque."
    ); else {
      System.out.println(
        nome +
        ", obrigado por criar uma conta em nosso banco, sua agência é  " +
        agencia +
        ", conta: " +
        conta +
        ", seu saldo atual é " +
        saldo +
        " , faça já o seu primeiro depósito!"
      );
    }
  }
}
