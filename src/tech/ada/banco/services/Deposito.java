package tech.ada.banco.services;

import tech.ada.banco.model.Conta;
import tech.ada.banco.model.ModalidadeConta;
import tech.ada.banco.utils.LeitorTeclado;

import java.math.BigDecimal;

public class Deposito {

    public void executar() {
        Conta conta;
        int numeroConta = LeitorTeclado.getNumero("Digite um número de conta.");
        conta = Conta.obtemContaPeloNumero(numeroConta);
        executar(conta);
    }
    public void executar(Conta conta) {
        int valor = LeitorTeclado.getNumero("Digite o valor a ser depositado.");
        conta.deposito(BigDecimal.valueOf(valor));

        System.out.println("O saldo da conta é de: R$" + conta.getSaldo());
    }
}
