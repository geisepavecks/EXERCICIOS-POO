/*
 * Exercício de POO utilizando o objeto "caneta"
 *
 */
package ExercicioCanetaGuanabara;

public class canetaGuanabara {
    public static void main (String[] args){
        System.out.println("*fazendo uma nova caneta*");
        Caneta c1 = new Caneta();
        c1.cor = "Rosa";
        c1.ponta = 1.0f;
        c1.tampada = false;
        c1.modelo = "Faber-Castell";
        c1.carga = 100;
        c1.informacoes();
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.informacoes();
    }
}