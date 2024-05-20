class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        int totalCount = 0;
        
        for(int i=1;i<=n;i++){
            int num=i;
            while(num>1){
                totalCount+=(num&1);
                num=num>>1;
            }
            if(num==1)
                totalCount+=1;
        }
        return totalCount;
    }
}
