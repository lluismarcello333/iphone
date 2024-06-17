public class Camera implements Aplicativo {
    public void tirarFoto() {
        System.out.println("Tirando foto.");
    }

    public void gravarVideo() {
        System.out.println("Gravando vídeo.");
    }

    public void mudarModo() {
        System.out.println("Mudando modo da câmera.");
    }

    public void acessarGaleria() {
        System.out.println("Acessando galeria.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Câmera.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo da Câmera.");
    }
}

