import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Matricula brasil = new Matricula(new FabricaBrasil(),"Roger", "123.456.789-09", "Python Intermediario", 1000.00);
        Matricula chile = new Matricula(new FabricaChile(),"Vanderlei", "012.345.678-91", "C# Avançado", 50000);

        brasil.imprimirRelatorio();
        chile.imprimirRelatorio();
    }
}
