public interface FabricaMatricula {
    DocFiscal criarDocFiscal(double valor);
    Pagamento criarPagamento(double valor);
    Comprovante criarComprovante(String aluno, String identificacao);
}
