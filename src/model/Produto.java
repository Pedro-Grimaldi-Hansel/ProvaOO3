package model;

public class Produto {
    private int codigoProduto;
    private String nome;
    private String descricao;
    private float preco;
    private EspecificacaoProduto especificacaoProduto;

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public EspecificacaoProduto getEspecificacaoProduto() {
        return especificacaoProduto;
    }

    public void setEspecificacaoProduto(EspecificacaoProduto especificacaoProduto) {
        this.especificacaoProduto = especificacaoProduto;
    }
}
