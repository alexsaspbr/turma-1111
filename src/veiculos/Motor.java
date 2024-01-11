package veiculos;

public class Motor {

    private EstadoMotor estado;

    public boolean isLigado() {
        return this.estado.equals(EstadoMotor.LIGADO);
    }
}
