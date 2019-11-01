import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Pedido, Imprimivel, Autorizavel {

    private ICliente cliente;
    private List<ItemDePedido> itensDePedido;

    public Orcamento(ICliente cliente) {
        this.cliente = cliente;
        this.itensDePedido = new ArrayList<>();
    }

    @Override
    public float obterTotal() {
        float somatorio = 0;
        for(ItemDePedido itemDePedido: itensDePedido){
            somatorio+=itemDePedido.obterSubtotal();
        }
        return somatorio;
    }

    @Override
    public String obterNomeCliente() {
        return cliente.obterNome();
    }

    @Override
    public void definirCliente(ICliente ICliente) {
        this.cliente = ICliente;
    }

    @Override
    public void remover(ItemDePedido itemDePedido) {
        this.itensDePedido.remove(itemDePedido);
    }

    @Override
    public void adicionar(ItemDePedido itemDePedido) {
         this.itensDePedido.add(itemDePedido);
    }

    @Override
    public String obterCabecalho() {
        return "#######  ORÇAMENTO ######";
    }

    @Override
    public String obterCorpo() {
        String conteudo = " ";
        for(ItemDePedido itemDePedido: itensDePedido){
            conteudo+= itemDePedido.obterItem().obterDescricao();
            conteudo+= " - ";
            conteudo+= itemDePedido.obterItem().obterPreco();
            conteudo+= " - ";
            conteudo+= itemDePedido.obterQuantidade();
            conteudo+= " - ";
            conteudo+= itemDePedido.obterSubtotal();
        }
        conteudo+= " Total: ";
        conteudo+= this.obterTotal();

        return conteudo;
    }

    @Override
    public String obterRodape() {
        return "#########################";
    }


}
