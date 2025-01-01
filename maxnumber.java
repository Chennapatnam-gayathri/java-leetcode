public class maxnumber {
    public static void main(String[] args) {
        int num[]={1,5,3,5,7,4,2,5,6,7,8,9,1,3,5,6,7,8,9,3,6,7,8};
        int x=0;
        for(int i=0;i<num.length;i++){
            x=Math.max(num[i],x);
            }
           
        
         System.out.println(x);   
        }
    }
    

