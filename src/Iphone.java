import interfaces.Funcionalidades;

public abstract class Iphone implements Funcionalidades {
    protected String dono;

    public Iphone(String dono) {
        this.dono = dono;
    }

    @Override
    public void selecionarMusica() {}
    @Override
    public void tocarMusica() {}
    @Override
    public void pausarMusica() {}
    @Override
    public void ligar() {}
    @Override
    public void atender() {}
    @Override
    public void iniciarCorreioDeVoz() {}
    @Override
    public void exibirPagina() {}
    @Override
    public void exibirNovaPagina() {}
    @Override
    public void atualizarAba() {}

}
