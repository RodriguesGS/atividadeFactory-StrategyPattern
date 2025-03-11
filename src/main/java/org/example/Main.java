package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.println("==========================");

        System.out.print("Digite uma opção: ");
        int op = scanner.nextInt();
        System.out.print("Digite o valor da transação: ");
        double pag = scanner.nextDouble();
        scanner.nextLine();

        PaymentStrategy strategy;

        switch(op) {
            case 1:
                strategy = PaymentFactory.criarEstrategia("pix");
                break;
            case 2:
                strategy = PaymentFactory.criarEstrategia("cartaocredito");
                break;
            case 3:
                strategy = PaymentFactory.criarEstrategia("boleto");
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.process(pag);
    }
}