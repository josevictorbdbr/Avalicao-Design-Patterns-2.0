import java.util.List;

public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override 
    public String getModal(){ 
        return "Ferroviario"; 
    }
    @Override 
    protected double getTaxa(){ 
        return 0.05; 
    }
    @Override 
    public List<String> getDocs() {
        return List.of("Identidade", "Reserva");
    }
}
