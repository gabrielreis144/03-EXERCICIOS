package exercicio5;

public class Main {
    public static void main(String[] args) {
        Senhaatendimento s1 = new Senhaatendimento("ana");
        Senhaatendimento s2 = new Senhaatendimento("pedro");
        Senhaatendimento s3 = new Senhaatendimento("eduarda");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Proxima senha Disponivel - # " + Senhaatendimento.controle);
    }
}
