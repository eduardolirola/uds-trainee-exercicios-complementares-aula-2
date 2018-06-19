import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> produtos = new ArrayList();
    private double total=0;

        public void addProduto(Produto produto){

            this.produtos.add(produto);
        }

        public double calcularValor(){

            this.produtos.stream().forEach(produto->{
                this.total += produto.getValor();
            });

        return this.total;

        }

}
