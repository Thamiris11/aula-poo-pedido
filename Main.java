public class Main {
    public static void main(String[] args) {

        produto p1 = new produto("Livro", 55.00);
        produto p2 = new produto("Perfume", 100.00);

        pedido pedido = new pedido(p1, p2);

        double total = pedido.p1.preco + pedido.p2.preco;

        System.out.println("Total do pedido foi : R$ " + total);


    }
}
