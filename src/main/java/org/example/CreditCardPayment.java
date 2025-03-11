package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão: ");
        String numeroCartao = scanner.nextLine();

        while (numeroCartao.length() < 13 || numeroCartao.length() > 16) {
            System.out.print("Número inválido, digita novamente: ");
            numeroCartao = scanner.nextLine();
        }

        System.out.println("Transação por Cartão de Crédito concluída");
    }
}
