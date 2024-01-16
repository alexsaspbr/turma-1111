package sobrescrita;

import tratamentoerros.SaldoInsufienteException;

import java.math.BigDecimal;

public abstract class Conta {

    protected BigDecimal saldo;

    public void sacar(BigDecimal valor) {
        checandoSaldo();
        System.out.println("Iniciando saque...");
    };

    private void checandoSaldo() {
        if(this.saldo.equals(BigDecimal.ZERO))
            throw new SaldoInsufienteException();
    }

}
