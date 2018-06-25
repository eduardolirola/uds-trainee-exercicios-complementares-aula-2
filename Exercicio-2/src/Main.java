public class Main {

    public static void main(String[] args) {

    Produto produto1 = new Produto("MONITOR 15'  VALOR: ",250.00);
    Produto produto2 = new Produto("MONITOR 17'  VALOR: ",350.00);
    Produto produto3 = new Produto("MONITOR 19'  VALOR: ",450.00);
    Produto produto4 = new Produto("MONITOR 20'  VALOR: ",550.00);
    Produto produto5 = new Produto("MONITOR 22'  VALOR: ",650.00);


        Pedido pedido1 = new Pedido();

        pedido1.addProduto(produto1);
        pedido1.addProduto(produto2);
        pedido1.addProduto(produto3);
        pedido1.addProduto(produto4);
        pedido1.addProduto(produto5);

        System.out.println(produto1.produto());
        System.out.println(produto2.produto());
        System.out.println(produto3.produto());
        System.out.println(produto4.produto());
        System.out.println(produto5.produto());

        System.out.println("VALOR TOTAL DO PEDIDO: "+ pedido1.calcularValor());


    }
}
