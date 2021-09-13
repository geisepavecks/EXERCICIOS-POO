/*
 * Exercício de POO, proposto por Gustavo Guanabara (do curso em video), utilizando o objeto "caneta"
 *
 */

package ExercicioCanetaGuanabara;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void informacoes(){
        System.out.println("==== Informacoes sobre a caneta ====");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("====================================");
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("Não é possível rabiscar. Está tampada, por favor, destampe para rabiscar.\n");
        } else {
            System.out.println("*caneta rabiscando*\n");
            carga -= 5;
        }
    }

    void tampar() {
        System.out.println("*tampando a caneta*\n");
        this.tampada = true;

    }

    void destampar(){
        System.out.println("*destampando a caneta*\n");
        this.tampada = false;
    }
}
