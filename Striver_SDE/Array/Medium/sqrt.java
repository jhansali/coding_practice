class Solution
{
     long floorSqrt(long x)
	 {
		long low = 1, high = x;
		while(low<=high){
		    long mid = (low+high)/2;
		    long val = mid*mid;
		    if(val == x)
		        return mid;
		    else if(val<=x)
		        low = mid+1;
		    else
		        high = mid-1;
		}
		return high;
	 }
}
