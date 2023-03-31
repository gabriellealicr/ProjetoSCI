import java.util.Scanner;

public class TresJava {
    
    public  static  void  main ( String [] argss ){
        Scanner  s = new  Scanner ( System . in );
        Double notas[] = new Double[4]; 
        String nome = "";
        int opc;
        double media;
        boolean executarLoop = true;
        
// Entrada de Dados
        do {
            System.out.println("Digite o nome do aluno");
            nome = s.next();
            media = 0.0;
            for (int i = 0; i<notas.length; i++){   
              System.out.println("Digite a "+(i+1)+"° nota");
              media += s.nextDouble();
            }
       
// Saída de Dados  
         media = media/4;
         if(media < 6 )
              System.out.println("\nAluno(a) " +nome+ ": média: "+media+ " - reprovado.");  
         else
              System.out.println("\nAluno(a) " +nome+ ": média: "+media+ " - aprovado!");  
         System.out.println("\nO que deseja fazer? \n[1]Continuar [2]Sair");
         opc = s.nextInt();
            if (opc == 2){
            System.out.println("\nFim do programa!");
            executarLoop = false;         
            }  
        }while(executarLoop);  
        s.close();
    }
}

