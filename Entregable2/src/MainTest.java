import Entities.Empaquetado;
import Entities.Envio;
import Entities.Payment;
import Entities.ProcesadorDePagos;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @org.junit.Test
    public void payment(){
        Payment pago = new Payment("Santander",0000,100,20);
        assertFalse(pago.isProcessed());
        ProcesadorDePagos proc = new ProcesadorDePagos();
        proc.process(pago);
        assertTrue(pago.isProcessed());
    }
    @org.junit.Test
    public void empaquetado(){
        Payment pago = new Payment("Santander",0000,100,20);
        assertFalse(pago.isEmpaquetado());
        Empaquetado proc = new Empaquetado();
        proc.empaquetar(pago);
        assertTrue(pago.isEmpaquetado());
    }
    @org.junit.Test
    public void enviado(){
        Payment pago = new Payment("Santander",0000,100,20);
        assertFalse(pago.isEnviado());
        Envio proc = new Envio();
        proc.enviar(pago);
        assertTrue(pago.isEnviado());
    }
}
