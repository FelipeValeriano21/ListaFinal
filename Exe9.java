/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafinal_felipereis;

import javax.swing.JOptionPane;


public class Exe9 {
    
    static double [] nota; 
    static double media; 


public static void main (String args[]){

       
      nota = new double [5]; 
 
      
    for(int i = 0; i<nota.length; i++){  

     nota[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A NOTA " + (i+1) + " DO ALUNO" ));   

    media = media + nota[i];
            
    }  
 
 media = media/nota.length;
 
      JOptionPane.showMessageDialog(null,"A MEDIA DO ALUNO É " + media); 
 
    }  
    
        
  

 
    
    
    
    
    
  
}
