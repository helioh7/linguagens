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
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conta c1 = new Conta(50,30);
        c1.titular = new Cliente("M",100,"Q");
        
        c1.sacar(10);
        c1.visualizarSaldo();
        c1.titular.mostrarCliente();

    }

}
