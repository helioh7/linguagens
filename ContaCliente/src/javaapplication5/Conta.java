/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Professor
 */
public class Conta {

    private int numero;

    private double saldo;
    Cliente titular;

    Conta(double a, int A) {
        this.saldo = a;
        this.numero = A;
        //titular = new Cliente();
        //this.titular.nome= A;
        //this.titular.numero = M;
    }

    void visualizarSaldo() {
        //System.out.println("Nome do cliente:"+this.titular.nome);
        //System.out.println("Numero do cliente" + this.titular.numero);
        //System.out.println("Numero do CPF"+this.titular.cpf);

        System.out.println("Saldo = " + this.saldo);
    }

    public void depositar(int a) {
        this.saldo = this.saldo + a;
    }

    boolean sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Nao foi possivel sacar");
            return false;
        } else {
            System.out.println("Foi possivel sacar");
            this.saldo = this.saldo - valor;
            return true;

        }

    }

    boolean transferirDinheiro(Conta c1, double valor) {
        if (sacar(valor)) {
            System.out.println("Foi possivel depositar");
            c1.saldo = c1.saldo + valor;
            return true;
        } else {
            System.out.println("Nao foi possivel depositar");
            return false;

        }
    }

}
