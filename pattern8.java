public class pattern8 {
    public static void main(String[] args){
        int n=5;
        for(int i=5;i<0;i--){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){ //(i*2)+1
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
