
package listafinal_felipereis;

import javax.swing.JOptionPane;


public class Exe1 {
    
    public static void main (String args[]){
    
     double m,dc,c,ml; 
     m = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em METRO")); 
    
    dc = m*10;
    c = m*100; 
    ml = m*1000; 
 
    JOptionPane.showMessageDialog(null,"O valor em DECIMETRO = " + dc); 
    JOptionPane.showMessageDialog(null,"O valor em CENTIMETRO = " + c); 
    JOptionPane.showMessageDialog(null,"O valor em MILIMETRO = " + ml); 
    
    }
    
}
