package Entities;

public class ProcesadorDePagos {
    public Payment process(Payment payment){
        payment.setProcessed(true);
        return payment;
    }

}