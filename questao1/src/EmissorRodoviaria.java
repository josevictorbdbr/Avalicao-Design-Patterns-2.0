public class EmissorRodoviaria extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
