package org.example;

public class PaymentFactory {
    public static PaymentStrategy criarEstrategia(String t) {
        return switch (t.toLowerCase()) {
            case "pix" -> new PixPayment();
            case "cartaocredito" -> new CreditCardPayment();
            case "boleto" -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido: " + t);
        };
    }
}
