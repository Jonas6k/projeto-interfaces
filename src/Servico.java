public class Servico implements Item {
    private float preco;
    private String descricao;

    public Servico(float preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public float obterPreco() {
        return this.preco;
    }

    @Override
    public String obterDescricao() {
        return this.descricao;
    }
}
