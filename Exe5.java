
package listafinal_felipereis;




public class Exe5 {
    
 
    
    public static void main (String args[]){
         
         for(int i = 0; i<128; i++){  
         
        String valorhexa = Integer.toHexString(i);
       String valoroct = Integer.toOctalString(i);
       
        System.out.println("O valor em decimal é " + i);
       System.out.println();
        System.out.println("O valor em hexadecimal é " + valorhexa);
       System.out.println();
        System.out.println("O valor em octadecimal é " + valoroct);     
          System.out.println();
          System.out.println();
          System.out.println();
          
         }    
         
     }
    
}
