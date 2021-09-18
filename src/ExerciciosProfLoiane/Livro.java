/*
 * Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.
 *
 * */

package ExerciciosProfLoiane;

public class Livro {
    String nome;
    String autor;
    String categoria;
    String editora;
    int qtdPaginas;
    int rankingDosMaisComprados;
    double preco;

    public void informacoes() {
        System.out.println("\n");
        System.out.println("===================");
        System.out.println(" ~ LIVRO ~ ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Editora: " + this.editora);
        System.out.println("Páginas: " + this.qtdPaginas);
        System.out.println("Best Seller Rank:: " + this.rankingDosMaisComprados);
        System.out.println("Preço: " + this.preco);
    }
}