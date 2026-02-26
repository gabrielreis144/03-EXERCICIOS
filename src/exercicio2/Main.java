package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Paciente pc = new Paciente();
        double[] alvo = pc.frequenciaAlvo();


        System.out.println("Qual é seu nome? ");
        pc.nome = sc.nextLine();
        System.out.println("Qual é sua idade? ");
        pc.idade = sc.nextInt();

        System.out.println("paciente: " + pc.nome);
        System.out.println("frequencia Maxima: " + pc.frequenciaMaxima());
        System.out.println("frequencia Alvo: "+ alvo[0] + "," + alvo[1]);

    }
}
