public class reverseascii {
    public static void main(String[] args) {
        String s="abcd";
        int ans=0;
        for(int i=s.length()-1;i>0;i--){
            int a=i;
            int b=i-1;
            char first=s.charAt(a);
            char second=s.charAt(b);
            int aascii=first;
            int bascii=second;
            int temp=(aascii-bascii);
            ans=ans+temp;
            
        }
System.out.println(ans);
    }
    
}
