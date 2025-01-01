public class mnumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,3,9,2,4,7,5,3,6,8,64,5,6,7,3,24,5,68};
        int x=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }
            
        }
        System.out.println(x);
    }
}
    

