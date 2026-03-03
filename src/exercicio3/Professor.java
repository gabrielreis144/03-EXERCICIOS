package exercicio3;

public class Professor {

    String nome;
    int totaldeAulas;
    double valorDaAula;

    public Professor(String nome, int aulas, double valorAula) {
    }

    public static void professor (String nome, int aulas, double valorAula){

    }

    public double salarioBase(){
        return totaldeAulas * 4.5 *valorDaAula;
    }

    public double salarioLiquido(){
        return salarioBase()* 0.05;
    }

    public double salarioLiquido2(){
        return (salarioBase() + salarioLiquido()) /6;
    }

    public double salarioFinal(){
        return salarioBase() + salarioLiquido() + salarioLiquido2();
    }

    public String Gabriel (){
        return "Gabriel";
    }


}
