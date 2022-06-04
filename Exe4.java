
package listafinal_felipereis;

import javax.swing.JOptionPane;


public class Exe4 {
    
        public static void main (String args[]){
            
           double num1,num2; 
 num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE O PRIMEIRO NUMERO"));
 num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE O SEGUNDO NUMERO")); 

    
	if (num1>num2){
	
	  JOptionPane.showMessageDialog(null,"Numero 1: " + num1);
	  JOptionPane.showMessageDialog(null,"Numero 2: " + num2);
	
	}else if (num1<num2){
	
	  JOptionPane.showMessageDialog(null,"Numero 2: " + num2);
	  JOptionPane.showMessageDialog(null,"Numero 1: " + num1);
	
	}else{
	 JOptionPane.showMessageDialog(null,"Valores iguais");
	
	}

	
	
	
        }
    
}
