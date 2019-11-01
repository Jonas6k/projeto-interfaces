public class Visa implements Cartao {
    private String numero;

    public Visa(String numero) {
        this.numero = numero;
    }

    @Override
    public String obtertNumero() {
        return this.numero;
    }
}
