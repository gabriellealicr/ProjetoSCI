import java.util.Scanner;

public class DoisJava {
    
     public  static  void  main ( String [] argss ){
        Scanner  s = new  Scanner ( System . in );
        int t = 5; 
        int n[] = new int[t]; 
        int i; // 

// Entrada de Dados
    for (i=0; i<t; i++) {
      System.out.println("Digite o número "+(i+1));
      n[i] = s.nextInt();
    }

    int menor = n[0]; 
    int maior = n[0];
    for (i=0; i<t; i++) {

      if (n[i] < menor)
         menor = n[i];

      if (n[i] > maior)
         maior = n[i];
    }

// Saída (resultados)
    System.out.printf("\n");
    for (i=0; i<t; i++) {
      if (n[i] == menor)
        System.out.printf("v[%d] = %2d - menor valor\n", i, n[i]);
      else if (n[i] == maior)
              System.out.printf("v[%d] = %2d - maior valor\n", i, n[i]);
    }
    s.close();
} 
}
