public abstract class EmissorPassagem{
    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    public final Passagem emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);

        passagem.calcularTaxa();
        System.out.println(passagem.resumo());
        System.out.println();

        return passagem;
    }
}
