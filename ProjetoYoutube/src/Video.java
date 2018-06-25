public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //  SEMPRE QUE CRIAR UM VIDEO NOVO  - CONSTRUTOR
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;

    }

//    GET E SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / views);

        this.avaliacao = nova;


    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }



    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pouse() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
    this.curtidas ++;
    }
//    SOBRESCREVENDO COM POLIMORFISMO DE SOBRESCRIÇÃO.


    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
