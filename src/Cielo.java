public class Cielo implements Operadora {


    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        if (autorizavel.obterTotal() < 1000 && cartao.obtertNumero().startsWith("123")) {
            return true;
        }
        return false;
    }
}
