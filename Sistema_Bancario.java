package javaapplication108;

import javax.swing.JOptionPane;

public class Sistema_Bancario {
public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();
        boolean cont = true;
        do{
           int opcao = Integer.parseInt(JOptionPane.showInputDialog(""
                   + "=======-Cordeiro Pay-=======\n"
                   + "1-Cadastro Conta Corrente\n"
                   + "2-Cadastro Conta Poupança\n"
                   + "3-Sair do Sitema\n"
                   + "========================"));
           switch(opcao){
               case 1:
                   boolean con = true;
                   cc.nome = JOptionPane.showInputDialog("Informe o seu nome:");
                   cc.n_conta = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da sua conta"));
                   cc.n_agencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da sua agencia"));
                   cc.telefone= Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do seu telefone"));
                   do{
                   int opca = Integer.parseInt(JOptionPane.showInputDialog(""
                   + "=======-Cordeiro Pay-=======\n"
                   + "=======-Conta Corrente-=======\n"
                   + "1-Sacar\n"
                   + "2-Depositar\n"
                   + "3-Consultar Saldo\n"
                   + "4-Sair do Sitema\n"
                   + "========================"));
                   switch(opca){
                       case 1:
                           cc.sacar(Double.parseDouble(JOptionPane.showInputDialog("Informe o numero da sua conta")));
                       break;
                       
                       case 2:
                           cc.depositar(Double.parseDouble(JOptionPane.showInputDialog("Informe o numero da sua conta")));
                       break;
                          
                       case 3:
                            JOptionPane.showMessageDialog(null,"Saldo do "+cc.nome+"\n"+cc.saldo );
                       break; 
                           
                       case 4:
                           JOptionPane.showMessageDialog(null,"Saindo...");
                       con=false;    
                       break; 
                           
                       default:
                           JOptionPane.showMessageDialog(null,"Que???? Repeti de novo!");
                               
                           
                   }
                   }while(con);
               break;
                   
               case 2:
                   boolean co = true;
                   cp.nome = JOptionPane.showInputDialog("Informe o seu nome:");
                   cp.n_conta = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da sua conta"));
                   cp.n_agencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da sua agencia"));
                   do{
                   int opca = Integer.parseInt(JOptionPane.showInputDialog(""
                   + "=======-Cordeiro Pay-=======\n"
                   + "=======-Conta Poupança-=======\n"
                   + "1-Sacar\n"
                   + "2-Depositar\n"
                   + "3-Consultar Saldo\n"
                   + "4-Sair do Sitema\n"
                   + "========================"));
                   switch(opca){
                       case 1:
                           cp.sacar(Double.parseDouble(JOptionPane.showInputDialog("Informe o numero da sua conta")));
                       break;
                       
                       case 2:
                           cp.depositar(Double.parseDouble(JOptionPane.showInputDialog("Informe o numero da sua conta")));
                       break;
                          
                       case 3:
                            JOptionPane.showMessageDialog(null,"Saldo do "+cp.nome+"\n"+cp.saldo );
                       break; 
                           
                       case 4:
                           JOptionPane.showMessageDialog(null,"Saindo...");
                       co=false;    
                       break;    
                           
                       default:
                           JOptionPane.showMessageDialog(null,"Que???? Repeti de novo!");
                           
                   }
                   }while(co);    
               break;
                  
               case 3:
                   cont = false;
               break;
                   
                default:
                           JOptionPane.showMessageDialog(null,"Que???? Repeti de novo!");   
                   
           }
        }while(cont);
                
    }
    
}
