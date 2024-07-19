public class Usuario {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Teste de ReprodutorMusical
        System.out.println("\nTeste de Reprodutor Musical:");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Thunder - Imagine Dragons");

        // Teste de AparelhoTelefonico
        System.out.println("\nTeste de Aparelho Telefonico:");
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste de NavegadorInternet
        System.out.println("\nTeste de Navegador Internet:");
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
