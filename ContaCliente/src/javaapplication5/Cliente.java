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
public class Cliente {

    private String nome;
    private int numero;
    private String cpf;

    
   Cliente(String A, int B, String C) {
   this.nome=A;
   this.numero = B;
   this.cpf = C;
       
   }
    
    
    
    int getNumero() {
        return this.numero;
    }

    void setNumero(int Q) {
        this.numero = Q;
    }

    
    
    
    
    void mostrarCliente() {
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("Numero do cliente: " + this.numero);
        System.out.println("CPF do cliente: " + this.cpf);

    }

}
