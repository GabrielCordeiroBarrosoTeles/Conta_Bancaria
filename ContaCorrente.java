package javaapplication108;

import javax.swing.JOptionPane;

public class ContaCorrente {
    String nome;
    int n_conta,n_agencia,telefone;
    double saldo;
    int imposto = 15;
    public void sacar(double valor){
        if(valor>this.saldo){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }else{
        JOptionPane.showMessageDialog(null,"Lembrando que cobramos 15,00 de imposto!");    
       this.saldo=this.saldo-(valor+imposto);
        }
    }
    public void depositar(double valor){
       this.saldo=this.saldo+valor;
    }
    
    }

