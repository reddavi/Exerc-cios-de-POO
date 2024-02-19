package Exercicio4;

public class Produto {
    private String codigo;
    private String descricao;
    private Double precoVenda;
    private Integer quantidadeEmEstoque;
    CategoriaProduto categoria;

    public Produto(String codigo, String descricao, Double precoVenda, Integer quantidadeEmEstoque,
            CategoriaProduto categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
    public boolean ehDaCategoria(CategoriaProduto categoria){
        return (this.categoria == categoria);
    }
    
    public String toString(){
        return "O produto de código " + codigo + "sua descrição: " + descricao + ", seu valor" 
        + precoVenda + ", sua quantidade no estoque é de " + quantidadeEmEstoque + ", e sua categoria = " + categoria; 

    }
    

    
}
