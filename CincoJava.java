import java.util.Scanner;

public class Ex05 {
    
    public  static  void  main ( String [] argss ){
       Scanner s = new Scanner(System.in);      
       String[][] grade = new String[6][3];
       double nota = 0.0;
       double mediaTotal = 0.0;
       double[] medias = new double[3];

// Entrada de Dados
	for (int i = 0; i < 3; i++) {
            mediaTotal=0.0;
            System.out.println("Digite o nome do aluno");
            grade[0][i] = s.next();
                for (int j = 1; j < 5; j++) {
                    System.out.println("Digite a nota");
                    nota =  s.nextDouble();
                    mediaTotal += nota;
                    grade[j][i] = String.valueOf(nota); 
		}
                    medias[i] = mediaTotal/4;
                    grade[5][i] = String.valueOf(mediaTotal/4);
		}
// Saída de Dados
                    mostraMedias(grade);
                    mostraMenorMedia(medias, grade);
                    mostraMaiorMedia(medias, grade);
                    s.close();
	}
    
    public static void mostraMedias(String[][] boletim) {
	for (int i = 0; i < 3; i++) {
            System.out.println(" Aluno(a): "+boletim[0][i]+" - média "+boletim[5][i]);
	}
    }
    
    public static void mostraMenorMedia(double[] medias,String[][] boletim) {
	if(medias[0]<medias[1] || medias[0]<medias[2]){	
            System.out.println("\n Aluno(a) "+boletim[0][0]+" - menor média: "+medias[0]);	
	}else if(medias[1]<medias[2]){
            System.out.println("\n Aluno(a) "+boletim[0][1]+" - menor média: "+medias[1]);	
	}else{
            System.out.println("\n Aluno(a) "+boletim[0][2]+" - menor média: "+medias[2]);	
        }
    }
    
    public static void mostraMaiorMedia(double[] medias,String[][] boletim) {
	if(medias[0]>medias[1] || medias[0]>medias[2]){
            System.out.println(" Aluno(a) "+boletim[0][0]+" - maior média: "+medias[0]);	
	}else if(medias[1]>medias[2]){	
            System.out.println(" Aluno(a) "+boletim[0][1]+" - maior média: "+medias[1]);
	}else{
            System.out.println(" Aluno(a) "+boletim[0][2]+" - maior média: "+medias[2]);			
	}
    }
}