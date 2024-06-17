public class Navegador implements Aplicativo {
    public void abrirPagina() {
        System.out.println("Abrindo página.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public void adicionarAosFavoritos() {
        System.out.println("Adicionando aos Favoritos.");
    }

    public void abrirFavoritos() {
        System.out.println("Abrindo Favoritos.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Navegador.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do Navegador.");
    }
}

