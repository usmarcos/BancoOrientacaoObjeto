package tech.ada.banco.services;

import tech.ada.banco.model.Conta;
import tech.ada.banco.utils.LeitorTeclado;

public class Saldo {
    public void executar() {
        Conta conta;
        int numeroConta = LeitorTeclado.getNumero("Digite um número de conta.");
        conta = Conta.obtemContaPeloNumero(numeroConta);
        System.out.println("O saldo da conta é de: R$" + conta.getSaldo());
    }
}
