import java.util.List;

public class PassagemAerea extends Passagem {
    public PassagemAerea(String passageiro, double tarifa){ 
        super(passageiro, tarifa); 
    }

    @Override 
    public String getModal(){ 
        return "Aereo"; 
    }
    @Override 
    protected double getTaxa(){ 
        return 0.08; 
    }

    @Override 
    public List<String> getDocs() {
        return List.of("Identidade", "Bilhete");
    }
}
