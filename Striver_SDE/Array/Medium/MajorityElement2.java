class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int mini = (int)(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            int val = hm.getOrDefault(nums[i],0);
            hm.put(nums[i],val+1);
            if(hm.get(nums[i])==mini){
                res.add(nums[i]);
            }
            if(res.size()==2);
        }
        return res;
    }
}
