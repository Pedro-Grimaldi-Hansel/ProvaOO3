package model;

import java.util.ArrayList;

public class ItensCompra {
    private CarrinhoCompras carrinhoCompras;
    private Produto produto;

    public CarrinhoCompras getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ArrayList buscarProduto(){
        return null;
    }

}
