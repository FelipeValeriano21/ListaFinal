
package listafinal_felipereis;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;


public class Exe3 {
    
    public static void main (String args[]){
        
    double num1,num2,res;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE O PRIMEIRO NUMERO"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE O SEGUNDO NUMERO")); 
    
     res = num1+num2; 
    
    JOptionPane.showMessageDialog(null,"A soma dos números " + res);
    
     res = 0; 
    
     res = num1*(num2*num2);
    
     JOptionPane.showMessageDialog(null,"O produto do primeiro número pelo quadrado do segundo " + res);
     
      res = 0; 
      
      res = num1*num1; 
      
     JOptionPane.showMessageDialog(null,"O quadrado do primeiro número " + res);
     
      res = 0;
     res = sqrt((num1*num1)+(num2*num2));
     JOptionPane.showMessageDialog(null,"A raiz quadrada da soma dos quadrados " + res); 
     
     res = 0;
      res = Math.sin(num1-num2);
    
      JOptionPane.showMessageDialog(null,"O seno da diferença do primeiro número pelo segundo " + res); 
      
     res = 0; 
     
     if (num1<0){
         
 res = num1*(-1);
     JOptionPane.showMessageDialog(null,"O módulo do primeiro número " + res); 
         
    }else{
         
 res = num1;        
      JOptionPane.showMessageDialog(null,"O módulo do primeiro número " + res);       
}
    }
    
}