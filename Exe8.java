
package listafinal_felipereis;

import javax.swing.JOptionPane;

public class Exe8 {
    
    static int vetor[]; 
    static int vezes; 
    static int aux; 
   
    public static void main (String args[]){
    
    MontareOrdenarVetor();
    GerarVetor();
    
    }
    
      public static void MontareOrdenarVetor(){
      
     vezes = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual será o tamanho do array?"));

     vetor = new int [vezes]; 
     
    for(int i = 0; i<vetor.length; i++){  
        
      vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO " + (i+1) + " DO VETOR"));       
        

         for(int j = 0; j<vetor.length; j++){
        
             if(vetor[i] < vetor[j]){
                 aux = vetor[i];
                 vetor[i] = vetor[j];
                 vetor[j] = aux;
                 
         }
         }     
      
      
         }
      
         }
        
      public static void GerarVetor(){
       JOptionPane.showMessageDialog(null,"O vetor esta ordenado"); 
     
       for(int i = 0; i<vetor.length; i++){  
       
         
        JOptionPane.showMessageDialog(null, "O VALOR DO ESPAÇO " + (i+1) + " É " + vetor[i] );       
       
       }
      
      }
    
}
