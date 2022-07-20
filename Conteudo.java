public class Conteudo {

    private final String titulo;
    private final String urlImagem;

    public Conteudo(String titulo, String urliIagem) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getUrlImagem() {
        return urlImagem;
    }
}
