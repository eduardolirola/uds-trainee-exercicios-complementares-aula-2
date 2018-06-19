
public class Produto {

    private String nome = null;
    private double valor=0;


    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;


    }


    public String getMarca () { return this.nome; }

    public  Double getValor() { return this.valor; }

    public  String produto(){

        return nome + valor;
    }


}
