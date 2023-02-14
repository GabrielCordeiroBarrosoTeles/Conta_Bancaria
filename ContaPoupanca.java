package javaapplication108;

import javax.swing.JOptionPane;

public class ContaPoupanca {
    String nome;
    int n_conta,n_agencia;
    double saldo;
    
    public void sacar(double valor){
        if(valor>this.saldo){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }else{
            this.saldo=this.saldo-valor;
        }
    }
    public void depositar(double valor){
       this.saldo=this.saldo*0.02;
    }
    
    
}
