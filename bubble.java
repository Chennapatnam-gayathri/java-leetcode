public class bubble {
    public static void main(String[] arg){
        int arr[]={3,1,6,3,6,8};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int first = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = first;


                }
                
            }
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
