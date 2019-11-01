public class HP implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println(imprimivel.obterCabecalho());
        System.out.println(imprimivel.obterCorpo());
        System.out.println(imprimivel.obterRodape());
    }
}
