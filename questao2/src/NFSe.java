public class NFSe implements DocFiscal {
    private static final double ISS = 0.05;
    private final double valor;

    public NFSe(double valor) { this.valor = valor; }

    @Override 
    public String descrever() {
        return "NFS-e / valor R$ %.2f / ISS 5%% = R$ %.2f", valor, (valor * ISS);
    }
}
