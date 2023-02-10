package model;

import java.util.ArrayList;

public class CarrinhoCompras {
    private Login login;
    private ArrayList<ItensCompra> itensCompras;
    private Pedido pedido;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public ArrayList<ItensCompra> getItensCompras() {
        return itensCompras;
    }

    public void setItensCompras(ArrayList<ItensCompra> itensCompras) {
        this.itensCompras = itensCompras;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void inserirProduto(){};
    public void excluirProduto(){};
    public void alterarProduto(){};
    public void finalizarCompra(){};
}
