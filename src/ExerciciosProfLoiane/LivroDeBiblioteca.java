/*
* Usando o resultado do modelo "Livro" como base, crie uma classe LivroDeBiblioteca que represente os dados básicos de
* um livro de uma biblioteca, que pode ser emprestado a leitores.
*
* */

package ExerciciosProfLoiane;

public class LivroDeBiblioteca extends Livro {
    int setor;
    int prateleira;
    int qtdEmprestimos;
    boolean disponivel;
    int qtdPaginas;
    int rankingDosMaisComprados;

    public void informacoes() {
        System.out.println("===================");
        System.out.println(" ~ LIVRO DE BIBLIOTECA ~ ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Editora: " + this.editora);
        System.out.println("Páginas: " + this.qtdPaginas);
        System.out.println("Best Seller Rank:: " + this.rankingDosMaisComprados);
        System.out.println("Setor: " + this.setor);
        System.out.println("Prateleira: " + this.prateleira);
        System.out.println("Quantidade de empréstimos: " + this.qtdEmprestimos);
        System.out.println("Disponibilidade: " + this.disponivel);
        System.out.println("===================");
    }

    void alugar() {
        if (disponivel == true) {
            System.out.println("O livro está disponível para empréstimo.\n");
        } else {
            System.out.println("Ops! O livro não está disponível.");

        }
    }
    private void indisponivel() {
        System.out.println("Gostaria de dar uma olhada em outro livro?.\n");
    }
}