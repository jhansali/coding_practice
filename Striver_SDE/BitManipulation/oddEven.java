class Solution{
    static String oddEven(int N){
        if((N & 1) != 1)
            return "even";
        return "odd";
    }
}
