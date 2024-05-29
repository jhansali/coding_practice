class Solution {
    static long count(int n) {
        long count = (n*(n-1))/2;
        return (long)Math.pow(2,count);
  }
}
