package Entities;

public class Envio {
    public Payment enviar(Payment pago){
        pago.setEnviado(true);
        return pago;
    }
}
