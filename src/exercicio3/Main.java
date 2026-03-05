package exercicio3;

import exercicio4.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor[] professores = new Professor[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Numeros de cadastros dos professores: " + (i + 1));

            System.out.println("Nome do Professor: ");
            String nome = sc.nextLine();

            System.out.println("Numero de aulas semanais: ");
            int aulas = sc.nextInt();

            System.out.println("Valor da aula: ");
            double valorAula = sc.nextDouble();

            professores[i] = new Professor(nome, aulas, valorAula);

        }

        System.out.println(" salario Final: R$ ");
        for (Professor pf : professores){
            System.out.println("Professor: ");
        }
    }
}
