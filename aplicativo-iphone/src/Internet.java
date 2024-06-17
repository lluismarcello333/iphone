public class Internet implements Aplicativo {
    public void abrirEmail() {
        System.out.println("Abrindo Email.");
    }

    public void abrirNavegador() {
        System.out.println("Abrindo Navegador.");
    }

    public void abrirGoogleMaps() {
        System.out.println("Abrindo Google Maps.");
    }

    public void abrirWidgets() {
        System.out.println("Abrindo Widgets.");
    }

    public void abrirWiFi() {
        System.out.println("Abrindo WiFi.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Internet.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo da Internet.");
    }
}
