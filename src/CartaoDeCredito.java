import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double LimiteDoCartao;
    private double saldoDoCartao;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteDoCartao) {
        this.LimiteDoCartao = limiteDoCartao;
        this.saldoDoCartao = limiteDoCartao;
        this.compras = new ArrayList<>();
    }


    public boolean lancaCompra(Compra compra) {
        if (this.saldoDoCartao > compra.getValor()) {
            this.saldoDoCartao -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimiteDoCartao() {
        return LimiteDoCartao;
    }

    public double getSaldoDoCartao() {
        return saldoDoCartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }


}

