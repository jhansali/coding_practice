class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while(left<right){
                    if(nums[left]+nums[right]==target){
                        List<Integer> al = new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[left]);
                        al.add(nums[right]);
                        res.add(al);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }else if(nums[left]+nums[right]>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
