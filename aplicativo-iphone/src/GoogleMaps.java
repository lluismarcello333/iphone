public class GoogleMaps implements Aplicativo {
    public void buscarLocal() {
        System.out.println("Buscando local.");
    }

    public void tracaRota() {
        System.out.println("Traçando rota.");
    }

    public void salvarLocal() {
        System.out.println("Salvando local.");
    }

    public void compartilharLocal() {
        System.out.println("Compartilhando local.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Google Maps.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do Google Maps.");
    }
}

