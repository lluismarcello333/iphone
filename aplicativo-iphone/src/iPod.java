public class iPod implements Aplicativo {
    public void abrirListaDeMusica() {
        System.out.println("Abrindo lista de música.");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    public void mudarModoDeExibicao() {
        System.out.println("Mudando modo de exibição.");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume do iPod.");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume do iPod.");
    }

    public void selecionarVideo() {
        System.out.println("Selecionando vídeo.");
    }

    public void reproduzirVideo() {
        System.out.println("Reproduzindo vídeo.");
    }

    public void pausar() {
        System.out.println("Pausando mídia.");
    }

    public void acelerarMidia() {
        System.out.println("Acelerando mídia.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo iPod.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do iPod.");
    }
}
