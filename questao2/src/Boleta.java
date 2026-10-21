public class Boleta implements DocFiscal {
    private static final double IVA = 0.19;
    private final double valor;

    public Boleta(double valor){ 
        this.valor = valor; 
    }

    @Override
    public String descrever() {
        return "Boleta electronica / valor CLP " + valor+ " / IVA 19% = CLP " + (valor * IVA);
    }
}
