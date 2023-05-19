public class Main {
    public static void main(String[] args){

        System.out.println("Cadastro de pedido:");

        Pedidos compra1 = new Pedidos();
        compra1.setPedidos(new Cliente());
        compra1.realizarpedido();

        Pedidos compra2 = new Pedidos();
        compra2.setPedidos(new Produto());
        compra2.realizarpedido();


    }

}
