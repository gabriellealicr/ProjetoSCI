import java.util.Scanner;

public class QuatroJava {
    
   public  static  void  main ( String [] argss ){
       Scanner  s = new  Scanner ( System . in );
       int n[] = new int[5]; 
       
// Entrada de Dados
       for (int i = 0; i<n.length; i++){
           System.out.println("Digite o "+(i+1)+" número:");
           n[i] = s.nextInt();
       }
       
 // Saída de Dados      
       System.out.println("Vetor na terceira posição: "+n[2]);
       s.close();
   
   }
    
}
