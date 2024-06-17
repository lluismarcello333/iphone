public class Widgets implements Aplicativo {
    public void adicionarWidget() {
        System.out.println("Adicionando Widget.");
    }

    public void removerWidget() {
        System.out.println("Removendo Widget.");
    }

    public void atualizarWidget() {
        System.out.println("Atualizando Widget.");
    }

    public void configurarWidget() {
        System.out.println("Configurando Widget.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Widgets.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo dos Widgets.");
    }
}
