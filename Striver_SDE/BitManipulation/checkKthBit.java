class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        int bit = n & (1<<k);
        if(bit == 0)
            return false;
        return true;
    }
    
}
