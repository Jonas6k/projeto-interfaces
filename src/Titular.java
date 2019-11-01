public class Titular implements ICliente {
    private String nome;

    public Titular(String nome) {
        this.nome = nome;
    }

    @Override
    public String obterNome() {
        return this.nome;
    }
}
