package exercicio5;

public class Senhaatendimento {

    String nome;
    int senha;

    static int controle = 100;

    public Senhaatendimento (String nome){

        this.nome = nome;
        this.senha = controle++;
    }

    public String getDados (){
        return "paciente: " + nome + "| senha #" + senha;
    }
}
