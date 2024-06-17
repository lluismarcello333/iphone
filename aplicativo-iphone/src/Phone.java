public class Phone implements Aplicativo {
    public void favoritos() {
        System.out.println("Abrindo Favoritos.");
    }

    public void recentes() {
        System.out.println("Abrindo Recentes.");
    }

    public void contatos() {
        System.out.println("Abrindo Contatos.");
    }

    public void teclado() {
        System.out.println("Abrindo Teclado.");
    }

    public void correioDeVoz() {
        System.out.println("Abrindo Correio de Voz.");
    }

    public void ligarParaContato() {
        System.out.println("Ligando para contato.");
    }

    public void atenderLigacao() {
        System.out.println("Atendendo ligação.");
    }

    public void recusarLigacao() {
        System.out.println("Recusando ligação.");
    }

    public void selecionarContato() {
        System.out.println("Selecionando contato.");
    }

    public void vivaVoz() {
        System.out.println("Ativando viva-voz.");
    }

    public void colocarChamadaEmEspera() {
        System.out.println("Colocando chamada em espera.");
    }

    public void desligarLigacao() {
        System.out.println("Desligando ligação.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Phone.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do Phone.");
    }
}
