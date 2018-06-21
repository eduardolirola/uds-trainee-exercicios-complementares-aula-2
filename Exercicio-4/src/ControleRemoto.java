public class ControleRemoto implements Controlador {

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // METODOS
    public ControleRemoto() {

        this.volume = 10;
        this.ligado = true;
        this.tocando = false;
    }

//    get e set
    private int getVolume() {
        return  volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;

    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar1() {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("---- MENU ----");
        System.out.println("O Radio está ligado? "+ this.getLigado());
        System.out.println("O Radio Esta tocando? "+ this.getTocando());
        System.out.print("Qual o volume? "+ this.getVolume());

        for(int i = 0; i <= this.getVolume(); i+=10){

            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
//  so almenta com tv ligada.
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume()+1);
        }
        else {
            System.out.println("Impossivel aumentar o volume");
        }
    }

//  so abaixa com a tv ligada.
    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 1){
            this.setVolume(getVolume()-1) ;
        }
        else{
            System.out.println(" Impossivel abaixar o volume..");
        }

    }
//  so se a tv estiver ligada e não estiver no mudo.
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
        else {
            System.out.println("O mudo ja está ativado..");
        }
    }
//  apenas se volume for igual a 0
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(10);
        }
    }
//  se estiver ligado e nao estiver tocando
    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
        else {
            System.out.println("Seu Radio ja esta tocando..");
        }

    }
//  se estiver ligado e tocando
    @Override
    public void pouse() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else {
            System.out.printf("Musica ja parada..");
        }
    }
}
