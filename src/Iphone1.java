public class Iphone1 extends Iphone {
    public Iphone1(String dono) {
        super(dono);
        System.out.println("Inicializando Iphone do " + dono);
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando mpusica");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }
    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }
    @Override
    public void ligar() {
        System.out.println("Realizando chamada");
    }
    @Override
    public void atender() {
        System.out.println("Recebendo chamada");
    }
    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exbibindo página");
    }
    @Override
    public void exibirNovaPagina() {
        System.out.println("Exibindo nova página");
    }
    @Override
    public void atualizarAba() {
        System.out.println("Atualizando página");
    }

}
