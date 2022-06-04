
package listafinal_felipereis;

import javax.swing.JOptionPane;


public class Exe10 {
    
   static double [] vetor;
   static int vezes;

 public static void main (String args[]){

        criarVetor();
        mostrarVetor(); 
        
           
    
    }  
 
 
 public static void criarVetor(){
    
     
      vezes = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o tamanho do array?")); 
     
      vetor = new double[vezes]; 

      
      
    for(int i = 0; i<vetor.length; i++){  

    vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O NUMERO " + (i+1) + " DO VETOR"));   

    }  
    
      
}
 
public static void  mostrarVetor() {
   
   for(int i = 0; i<vetor.length; i++){  
        
 JOptionPane.showMessageDialog(null, "O VALOR DO ESPAÇO " + (i+1) + " É " + vetor[i] );   
   
   }  
       

 
 
    
    
    
    
    
}
      
    
  
}
