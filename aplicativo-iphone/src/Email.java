public class Email implements Aplicativo {
    public void enviarEmail() {
        System.out.println("Enviando Email.");
    }

    public void lerEmail() {
        System.out.println("Lendo Email.");
    }

    public void deletarEmail() {
        System.out.println("Deletando Email.");
    }

    public void responderEmail() {
        System.out.println("Respondendo Email.");
    }

    public void encaminharEmail() {
        System.out.println("Encaminhando Email.");
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo Email.");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do Email.");
    }
}

