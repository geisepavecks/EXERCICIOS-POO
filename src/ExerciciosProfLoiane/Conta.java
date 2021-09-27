/*
* Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status
* que informa se ela é especial ou não e um limite.
*
* 1) numero;
* 2) saldo;
* 3) status (especial ou não);
* 4) limite.
* */

package ExerciciosProfLoiane;

public class Conta {
    String numero;
    double saldo;

    boolean ehEspecial() {
        return this.saldo >= 100;
    }

    public double limiteConta() {
        if (saldo >= 100) {
            return this.saldo * 2;
        } else {
            return this.saldo / 2;
        }
    }

    public void informacoes() {
        System.out.println("\n=======INFORMAÇOES DA CONTA=======");
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo disponível:  " + this.saldo);
        System.out.println("Bônus de conta especial: " + this.ehEspecial());
        System.out.println("Limite da conta:  " + this.limiteConta());
        System.out.println("Status especial:  " + this.ehEspecial());
        System.out.println("====================================");
    }
}