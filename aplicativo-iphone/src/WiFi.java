public class WiFi implements Aplicativo {
    public void conectar() {
        System.out.println("Conectando ao WiFi.");
    }

    public void desconectar() {
        System.out.println("Desconectando do WiFi.");
    }

    public void listarRedes() {
        System.out.println("Listando redes WiFi.");
    }

    public void salvarRede() {
        System.out.println("Salvando rede WiFi.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo WiFi.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do WiFi.");
    }
}

