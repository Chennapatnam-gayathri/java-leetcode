public class pattern5 {
    public static void main(String[] args){
        int n=4;
        int r=30;
        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                if(i==0||i==n-1||j==0||j==r-1){
                    System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.println("");
            }
            
        }
    }
    
