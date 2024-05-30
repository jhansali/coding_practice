class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> st= new HashSet<>();
        for(int n : nums){
            st.add(n);
        }
        int maxLen = 1;
        for(int i : st){
            if(!st.contains(i-1)){
                int count = 1;
                int x = i;
                while(st.contains(x+1)){
                    x = x+1;
                    count += 1;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
