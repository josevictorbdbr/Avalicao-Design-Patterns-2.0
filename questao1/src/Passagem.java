import java.util.List;
import java.util.Locale;

public abstract class Passagem{
    private final String passageiro;
    private final double tarifa;
    public abstract List<String> getDocs();
    public abstract String getModal();
    protected abstract double getTaxa();

    protected Passagem(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getPassageiro(){ 
        return passageiro; 
    }
    public double getTarifa(){ 
        return tarifa; 
    }
    public double calcularTaxa() {
        return tarifa * getTaxa();
    }

    public String resumo() {
        String documentos = String.join(", ", getDocs());
    
        return "Modelo: " + getModal() +
               "\nPassageiro: " + passageiro +
               "\nTaxa: R$ " + String.format("%.2f", calcularTaxa()) +
               "\nDocumentos: " + documentos;
    }
}
