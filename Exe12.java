
package listafinal_felipereis;

import javax.swing.JOptionPane;


public class Exe12 {
    
    static int matriz[][]; 
    
    public static void main (String args[]){
    double somacoluna=0,somalinha=0,res;    
        int i,j;
    matriz = new int [5][3];
    
     for(i=0;i<5;i++){
       
         for(j=0;j<3;j++){
  matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Adicione o espaço " + (i+1) + "/" + (j+1)));  
  
  if ((j+1)%2==0){
  
      somacoluna = somacoluna + matriz[i][j];
  
  }
  
  if ((i+1)%2!=0){
  
   somalinha = somalinha + matriz[i][j];
      
  }
    
    }
     }
     

      
     somacoluna = somacoluna/5;
     somalinha = somalinha/9;
  
    res = somacoluna-somalinha;
    
    JOptionPane.showMessageDialog(null, "a diferença entre a média dos elementos das colunas pares e a média dos elementos das linhas ímpares é " + res );  
     
     
     
    }
}
