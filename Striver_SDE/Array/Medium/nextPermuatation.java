class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind=-1;
        for(int i=n-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[ind]){
                j--;
            }
            swap(nums, ind, j);
        }
        reverse(nums, ind+1);
    }
    public void reverse(int[] nums, int start){
        int i= start, j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
