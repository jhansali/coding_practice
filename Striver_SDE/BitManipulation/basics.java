class Solution {
    static void bitManipulation(int num, int i) {
        int bit = (num >> (i - 1)) & 1;
        System.out.print(bit + " ");
        
        // Set ith bit
        int setBit = num | (1 << (i - 1));
        System.out.print(setBit + " ");
        
        // Clear ith bit
        int clearBit = num & ~(1 << (i - 1));
        System.out.print(clearBit);

    }
}
