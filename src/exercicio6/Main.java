package exercicio6;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.println("Nome do Usuario: ");
        String nome = sc.nextLine();
        System.out.println("Tipos de tarifa (Professor, Estudante ou Normal) -->");
        String tiposTarifas = sc.next();
        bilhete = new BilheteUnico(nome,tiposTarifas);
    }
    public static void main(String[] args) {

        int opcao;

        do {

            System.out.println("***** MENU BILHETE *****");
            System.out.println("1. CARREGAR BILHETE");
            System.out.println("2. CONSULTAR SALDO");
            System.out.println("3. PASSAR NA CATRACA");
            System.out.println("4. FINALIZAR");
            opcao = sc.nextInt();


        switch (opcao){
            case 1 -> carregarBilhete();

            case 2 -> consultarSaldo();

            case 3 -> passarNaCatraca();

            case 4 -> System.out.println("*** OBRIGADO PELA VISITA! ***");
            default -> System.out.println("Opção Invalida");
        }
        } while (opcao != 4);

    }

    private static void passarNaCatraca() {
        if (!!bilhete.catraca()){
            System.out.println("Saldo Insuficiente ");
        }
        consultarSaldo();
    }

    private static void consultarSaldo() {
        System.out.println("Saldo atual -> R$" + bilhete.saldo);
    }

    private static void carregarBilhete() {
      double valor;
        System.out.println("valor para carregar o bilhete -> R$ ");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }

}
