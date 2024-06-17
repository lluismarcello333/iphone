public class Fotos implements Aplicativo {
    public void visualizarFoto() {
        System.out.println("Visualizando foto.");
    }

    public void deletarFoto() {
        System.out.println("Deletando foto.");
    }

    public void compartilharFoto() {
        System.out.println("Compartilhando foto.");
    }

    public void editarFoto() {
        System.out.println("Editando foto.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Fotos.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo das Fotos.");
    }
}
