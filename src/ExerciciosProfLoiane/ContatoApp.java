/*
* Crie uma classe que represente um contato da agenda do seu celular.
*
* */



package ExerciciosProfLoiane;

public class ContatoApp {
    public static void main (String [] args){
        Contato contato = new Contato();
        contato.nome = "Fulana";
        contato.numero = "55 51 99156-0198";
        contato.endereco = "Rua Beltrana número 7";
        contato.contatoDeEmergencia = true;
        contato.informacoes();
        contato.enviarMensagem();
    }

}
