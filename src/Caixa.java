public class Caixa implements PontoDePagamento {

    private Impressora impressora;
    private Operadora operadora;

    @Override
    public void abrir(Impressora impressora, Operadora operadora) {
        this.impressora = impressora;
        this.operadora = operadora;
    }


    @Override
    public void fecharPedido(Orcamento orcamento, Cartao cartao) {
        if (operadora.autorizar(orcamento, cartao)){
            impressora.imprimir(orcamento);
        } else {
            System.out.println("negado");
        }



    }
}
