/* Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status
 * que informa se ela é especial ou não, e um limite.
 *
 * 1) numero;
 * 2) saldo;
 * 3) status (especial ou não);
 * 4) limite.
 * */

package ExerciciosProfLoiane;

public class ContaApp {
    public static void main (String[] args){
        Conta conta = new Conta();
        conta.numero = "0001";
        conta.saldo = 150;
        conta.limiteConta();
        conta.informacoes();
    }
}
