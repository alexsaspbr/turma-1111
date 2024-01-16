package sobrescrita;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        new ContaCorrente(new BigDecimal(1000)).sacar(new BigDecimal(10));

    }

}
