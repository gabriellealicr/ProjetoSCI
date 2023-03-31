import java.util.Scanner;

public class UmJava {
    
    public  static  void  main ( String [] argss ){
        Scanner  s = new  Scanner ( System . in );
        int n = 5;
        int num[] = new int[n]; 
        int i,soma, media;
        soma = 0;
        media = 0;

// Entrada de Dados
    for (i=0; i<n; i++) {
      System.out.println("Digite o número "+(i+1));
      num[i] = s.nextInt();
    }

// Saída (resultados)
    System.out.printf("\n");
    for (i=0; i<n; i++) {
      if (num[i] % 2 == 0)
        System.out.printf("v[%d] = %2d - par\n", i, num[i]);
      
      if (num[i] % 2 != 0)
        System.out.printf("v[%d] = %2d - ímpar\n", i, num[i]);
      
          soma = soma + num[i];
          media = soma/5;
    } 
         System.out.println("\nMédia: "+media);
         s.close();
    }
}
    

