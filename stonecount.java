public class stonecount {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<jewels.length();i++){
        char ch=jewels.charAt(i);
        for(int j=0;j<stones.length();j++){
        char st=stones.charAt(j);
        if(ch==st){
            ans++;
        }
            
        }

        }
        
        return ans;
    }
}
    

