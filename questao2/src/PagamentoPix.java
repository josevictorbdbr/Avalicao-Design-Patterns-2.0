public class PagamentoPix implements Pagamento {
    private final double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public String descrever() {
        return "Pagamento Pix / R$ " + (Math.round(valor * 100.0) / 100.0);
    }
}