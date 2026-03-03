package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;
        double porcentagem;

        System.out.println("nome do produto: ");
        nome = sc.next();
        System.out.println("Digite o valor do produto: ");
        valor = sc.nextDouble();
        System.out.println(" Digite quantidade em estoque: ");
        quantidade = sc.nextInt();
        Produto p = new Produto(nome, valor, quantidade);

        //cliente aumenta a porcentagem
        System.out.println("Qual a porcentagem de aumento: ");
        porcentagem = sc.nextDouble();


        p.aumentarValor(porcentagem);
        System.out.println(p.valor);
    }
}
