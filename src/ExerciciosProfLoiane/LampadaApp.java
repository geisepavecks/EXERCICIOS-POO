/*
* Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
*
* */

package ExerciciosProfLoiane;

public class LampadaApp {
    public static void main(String[] args) {
        System.out.println("*Procurando uma lâmpada no supermercado*");
        Lampada lampada = new Lampada();
        lampada.modelo = "Fita LED Roxa";
        lampada.amperes = 0.9f;
        lampada.watts = 9;
        lampada.preco = 11;
        lampada.informacoes();
        lampada.comprar();
    }
}
