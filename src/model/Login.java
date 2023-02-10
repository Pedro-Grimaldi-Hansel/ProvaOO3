package model;

public class Login {
    private String usuario;
    private String senha;
    private Cliente cliente;
    private CarrinhoCompras carrinhoCompras;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CarrinhoCompras getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompras(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public void efetuarLogin(){}
}
