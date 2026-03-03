package exercicio3;

public class Professor {

    String nome;
    int totaldeAulas;
    double valorDaAula;

    public static void professor (String nome, int aulas, double valorAula){

    }

    public double salarioBase(){
        return totaldeAulas * 4.5 *valorDaAula;
    }

    public double salarioLiquido(){
        return salarioBase()* 0.05;

    }


}
