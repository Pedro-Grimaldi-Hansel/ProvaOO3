package model;

public class Pedido {
    private Pagamento pagamento;
    private CarrinhoCompras carrinhoCompras;

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public CarrinhoCompras getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public void criarPagamento(){}
    public void fecharPedido(){}
    public void buscarPedido(){}
    public int gerarNumeroPedido(){return 0;}
}
