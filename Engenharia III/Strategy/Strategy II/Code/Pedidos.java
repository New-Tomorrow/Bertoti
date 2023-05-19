public class Pedidos {
    private Pedido pedido;
    public void setPedidos(Pedido ppedido){
        pedido = ppedido;

    }
    public void realizarpedido(){
        pedido.solicitar();
    }

}
