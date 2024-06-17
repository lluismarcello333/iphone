public class SMS implements Aplicativo {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem.");
    }

    public void lerMensagem() {
        System.out.println("Lendo mensagem.");
    }

    public void deletarMensagem() {
        System.out.println("Deletando mensagem.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo SMS.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do SMS.");
    }
}