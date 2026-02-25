package exercicio01;

public class conta01 {


        String correntista;
        int numero;
        double saldo;

        public void depositar(double valor){

            saldo = saldo + valor;

        }

        public void sacar (double valor){

            saldo = saldo - valor;
        }


}
