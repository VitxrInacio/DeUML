public class Telefone {
    public static void main(String[] args) {
        Chamada ligacao = new Chamada();

        ligacao.atender();
        ligacao.ligar();
        ligacao.iniciarCorreioVoz();

        Navegador sms = new Navegador();

        sms.exibirPagina();
        sms.adicionarNovaAba();
        sms.atualizarPagina();

        ReprodutorMusical music = new ReprodutorMusical();

        music.tocar();
        music.pausar();
        music.selecionarMusica();

    }
}
