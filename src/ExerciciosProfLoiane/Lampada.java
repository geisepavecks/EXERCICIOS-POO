/*
 * Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
 *
 * */

package ExerciciosProfLoiane;

public class Lampada {
    String modelo;
    float amperes;
    double watts;
    int preco;

    public void informacoes() {
        System.out.println("==================================\n");
        System.out.println("*selecionando uma lâmpada*\n");
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Amperes: " + this.amperes);
        System.out.println("Consumo por hora:  " + this.watts);
        System.out.println("Preço: " + this.preco);
        System.out.println("====================================");
    }

    void comprar() {
        if(estaBarata()) {
            System.out.println("O preço está bom, pode comprar.\n");
            System.out.println("*comprando*\n");
        } else {
            naoComprar();
        }
    }

    private void naoComprar() {
        System.out.println("Ops! Está caro demais, procure em outra loja.\n");
        System.out.println("*saindo da loja*");
    }

    private boolean estaBarata() {
        return this.preco < 10;
    }
}