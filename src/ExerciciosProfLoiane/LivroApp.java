/*
 * Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.
 *
 * */

package ExerciciosProfLoiane;

public class LivroApp {
    public static void main(String[] args) {

        LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();
        Livro livro = new Livro();
        livro.nome = "Harry Potter and the Philosopher's Stone";
        livro.autor = "J.K. Rowling";
        livro.categoria = "Ficção/Aventura";
        livro.editora = "BloomSbury";
        livro.qtdPaginas = 223;
        livro.rankingDosMaisComprados = 9;
        livro.preco = 100;
        livroDeBiblioteca.nome = "Harry Potter and Philosopher's Stone";
        livroDeBiblioteca.autor = "J.K. Rowling";
        livroDeBiblioteca.categoria = "Ficção/Aventura";
        livroDeBiblioteca.editora = "BloomSbury";
        livroDeBiblioteca.qtdPaginas = 223;
        livroDeBiblioteca.rankingDosMaisComprados = 9;
        livroDeBiblioteca.setor = 6;
        livroDeBiblioteca.prateleira = 10;
        livroDeBiblioteca.qtdEmprestimos = 56 ;
        livroDeBiblioteca.disponivel = true;
        livro.informacoes();
        livroDeBiblioteca.informacoes();
        livroDeBiblioteca.alugar();
    }
}
