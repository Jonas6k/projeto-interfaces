
public class Cliente implements ICliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String obterNome() {
        return this.nome;
    }
}
