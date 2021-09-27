/*
* Crie uma classe que represente um contato da agenda do seu celular.
*
* */

package ExerciciosProfLoiane;

import java.util.Scanner;

public class Contato {
    String nome;
    String numero;
    String endereco;
    boolean contatoDeEmergencia;

    public void informacoes() {
        System.out.println("\n============ CONTATO =============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número:  " + this.numero);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Contato de Emergência:  " + this.contatoDeEmergencia);
        System.out.println("====================================");
    }

    void enviarMensagem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua mensagem:");
        scan.nextLine();
        System.out.println("Mensagem enviada com sucesso para " + this.nome + '(' + this.numero + ").");
    }
}