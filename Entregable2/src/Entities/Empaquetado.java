package Entities;

public class Empaquetado {
    public Payment empaquetar(Payment pago){
        pago.setEmpaquetado(true);
        return pago;
    }
}
