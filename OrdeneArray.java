public class OrdeneArray{
    public static void main(String[] args){
        int n = 5;
        int aux = 0;
        int i = 0;
        int j = 0;
        
        int[] vetor = new int[n];
        
        vetor[0] = 7;
        vetor[1] = 8;
        vetor[2] = 4;
        vetor[3] = 15;
        vetor[4] = 1;
        
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                if(vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        
        for(i = 0; i < 5; i++){
            System.out.println(vetor[i]);
        }
    }
}