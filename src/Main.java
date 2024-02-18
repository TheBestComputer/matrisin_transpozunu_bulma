
public class Main {
    public static void main(String[] args) {
        int[][] dizi = {{1,2,3},{4,5,6}};
        
        int[][] tekrar = new int[dizi[1].length][dizi.length];
        
        for(int i = 0; i < dizi.length; i++){
            for(int j = 0; j < dizi[i].length; j++){
                tekrar[j][i] = dizi[i][j];
            }
        }
        
        for(int[] i : tekrar){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
       }
    }
}
