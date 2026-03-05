package exercicio6;

import javax.swing.text.html.HTMLDocument;
import java.util.Random;

public class BilheteUnico {

    int numeroBilhete;
    String usuario;
    String tiposTarifas;
    double saldo;
    final static double TARIFABASE = 5.40;



    public BilheteUnico (String usuario, String tiposTarifas){

        Random random = new Random();
        this.usuario = usuario;
        this.tiposTarifas = tiposTarifas;
        this.numeroBilhete = random.nextInt(1000,9999);
    }

    public void catraca () {

        double valor = TARIFABASE;
        if (tiposTarifas.equalsIgnoreCase("estudante") ||
                tiposTarifas.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }

        if (saldo < valor) {

            return;
        }

        saldo = saldo - valor;
    }

}

