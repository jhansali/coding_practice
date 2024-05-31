class Solution {
    public int subarraySum(int[] arr, int k) {
        int result = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int prefixSum=0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            int diff = prefixSum-k;
            if(hm.containsKey(diff)){
                result+=hm.get(diff);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return result;
    }
}
