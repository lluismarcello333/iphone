public class iPhone {
    // Métodos da classe iPhone
    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    public void desbloquear() {
        System.out.println("iPhone desbloqueado.");
    }

    public void abrirIpod() {
        System.out.println("Abrindo iPod.");
    }

    public void abrirPhone() {
        System.out.println("Abrindo Phone.");
    }

    public void abrirInternet() {
        System.out.println("Abrindo Internet.");
    }

    public void abrirCamera() {
        System.out.println("Abrindo Camera.");
    }

    public void abrirSMS() {
        System.out.println("Abrindo SMS.");
    }

    public void abrirFotos() {
        System.out.println("Abrindo Fotos.");
    }

    public void irParaHome() {
        System.out.println("Voltando para Home.");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume.");
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume.");
    }

    // Método main para testar os métodos da classe iPhone
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        meuIphone.ligar();
        meuIphone.desbloquear();
        meuIphone.abrirIpod();
        meuIphone.abrirPhone();
        meuIphone.abrirInternet();
        meuIphone.abrirCamera();
        meuIphone.abrirSMS();
        meuIphone.abrirFotos();
        meuIphone.irParaHome();
        meuIphone.aumentarVolume();
        meuIphone.diminuirVolume();
        meuIphone.desligar();
    }
}

