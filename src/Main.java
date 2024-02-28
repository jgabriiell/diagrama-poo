public class Main {
    public static void main(String[] args) {

        Iphone1 joao = new Iphone1("João");

        joao.selecionarMusica();
        joao.tocarMusica();
        joao.pausarMusica();

        joao.ligar();
        joao.atender();
        joao.iniciarCorreioDeVoz();

        joao.exibirPagina();
        joao.exibirNovaPagina();
        joao.atualizarAba();
    }
}