package tratamentoerros;

import sobrescrita.ContaCorrente;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TratamentoErros {

    private static Logger logger = Logger.getLogger(TratamentoErros.class.getName());

    public static void main(String[] args) {

        try {
            new ContaCorrente(new BigDecimal(0)).sacar(new BigDecimal(10));
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        } finally {
            System.out.println("Finalizando programa");
        }

    }

}
