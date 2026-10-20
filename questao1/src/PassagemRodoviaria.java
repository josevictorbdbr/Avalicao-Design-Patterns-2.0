import java.util.List;

public class PassagemRodoviaria extends Passagem {
    public PassagemRodoviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override 
    public String getModal(){
        return "Rodoviario";
    }
    @Override 
    protected double getTaxa(){ 
        return 0.03; 
    }
    @Override 
    public List<String> getDocs() {
        return List.of("Identidade");
    }
}
