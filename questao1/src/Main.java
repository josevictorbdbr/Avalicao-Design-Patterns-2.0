import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        String[] nomesPassageiros = {"Roger", "Cleber", "Vanderlei"};
        double[] valoresTarifas = {600.00, 300.00, 150.00};

        EmissorPassagem[] tiposEmissores = new EmissorPassagem[3];

        tiposEmissores[0] = new EmissorAereo();
        tiposEmissores[1] = new EmissorRodoviaria();
        tiposEmissores[2] = new EmissorFerroviaria();

        for (int i = 0; i < tiposEmissores.length; i++) {
            String passageiro = nomesPassageiros[i];
            double tarifa = valoresTarifas[i];

            tiposEmissores[i].emitir(passageiro, tarifa);
        }
    }
}
