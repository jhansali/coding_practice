class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();
        int leader = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=leader){
                leader = arr[i];
                result.add(0,leader);
            }
        }
        // Collections.reverse(result);
        return result;
    }
}
