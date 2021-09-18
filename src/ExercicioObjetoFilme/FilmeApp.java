package ExercicioObjetoFilme;

public class FilmeApp {
    public static void main(String[] args) {
        System.out.println("*selecionando um filme*");
        Filme filme = new Filme();
        filme.nome = "Procurando Nemo";
        filme.categoria = "Animação/Aventura";
        filme.nota = 8.5;
        filme.duracao = 120;
        filme.informacoes();
        filme.comecar();
        filme.comecar();
        filme.pausar();
        filme.pausar();
    }
}
