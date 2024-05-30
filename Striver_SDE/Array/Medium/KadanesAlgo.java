// even storing start and end index of subarray with max sum.
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        int startInd = -1, endInd = -1, start = 0;
        for(int i=0;i<nums.length;i++){
            if(sum==0)
                start=i;
            sum+=nums[i];
            if(sum>maxSum){
                maxSum = sum;
                startInd = start;
                endInd = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("start "+startInd+" end "+endInd);
        return maxSum;
    }
}
