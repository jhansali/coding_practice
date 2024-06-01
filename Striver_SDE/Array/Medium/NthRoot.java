class Solution
{
    public int func(int n, int m, int mid){
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
    public int NthRoot(int n, int m)
    {
        int low = 1, high = m;
        while(low<=high){
            int mid = low+(high-low)/2;
            int midN = func(n,m,mid);
            if(midN==1)
                return mid;
            else if(midN==0)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
