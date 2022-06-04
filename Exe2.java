
package listafinal_felipereis;

import javax.swing.JOptionPane;


public class Exe2 {
    
    public static void main (String args[]){
    int valor;
       valor = Integer.parseInt(JOptionPane.showInputDialog("Um número decimal")); 
   
       String valorhexa = Integer.toHexString(valor);
       String valoroct = Integer.toOctalString(valor);
       
       JOptionPane.showMessageDialog(null,"O valor em hexadecimal é " + valorhexa);
       
          JOptionPane.showMessageDialog(null,"O valor em octadecimal é " + valoroct);
    
    }
    
}
