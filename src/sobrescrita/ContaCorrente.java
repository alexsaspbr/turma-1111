package sobrescrita;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    private BigDecimal limiteSaque;
    private BigDecimal taxa = new BigDecimal(1);

    public ContaCorrente() {
        this.saldo = new BigDecimal(1000);
    }

    public ContaCorrente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(BigDecimal saldo, BigDecimal limiteSaque) {
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void sacar(BigDecimal valor) {

        super.sacar(valor);
        this.saldo = this.saldo.subtract(valor.add(taxa));
        System.out.println("Saldo atual depois de sacado " + this.saldo);

    }

    public void sacar(BigDecimal valor, BigDecimal limiteSaque) {

    }

    @Override
    public String toString() {
        return "Conta Corrente";
    }
}
