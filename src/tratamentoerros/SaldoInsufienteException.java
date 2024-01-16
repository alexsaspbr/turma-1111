package tratamentoerros;

public class SaldoInsufienteException extends RuntimeException {

    public SaldoInsufienteException() {
        super("Saldo insufiente para saque");
    }

}
