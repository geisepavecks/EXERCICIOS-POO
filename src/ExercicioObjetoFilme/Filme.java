package ExercicioObjetoFilme;

public class Filme {
    String nome;
    String categoria;
    double nota;
    int duracao;
    private boolean estaRodando;

    public void informacoes() {
        System.out.println("Você selecionou um filme.\n");
        System.out.println("===== Informacoes sobre o filme =====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Nota na IMDB:  " + this.nota);
        System.out.println("Duração: " + this.duracao);
        System.out.println("====================================");
    }

    void comecar() {
        if (this.estaRodando == false) {
            this.estaRodando = true;
            System.out.println("O filme está começando. Aproveite ^^.\n");
            System.out.println("*filme começando*\n");
        } else {
            System.out.println("Ops! Parece que você já está assistindo o filme.\n");
        }
    }

    public void pausar() {
        if (this.estaRodando == false) {
            System.out.println("O filme já está pausado.");
        } else {
            System.out.println("*pausando filme*");
            this.estaRodando = false;
        }
    }
}