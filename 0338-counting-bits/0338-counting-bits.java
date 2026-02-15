class Solution {
    private static final int[] LOOKUP_TABLE = new int[256];

    static {
        LOOKUP_TABLE[0] = 0;
        for (int i = 1; i < 256; i++) {
            LOOKUP_TABLE[i] = (i & 1) + LOOKUP_TABLE[i / 2];
        }
    }

    public static int countActiveBits(int n) {
        return LOOKUP_TABLE[n & 0xff] + 
               LOOKUP_TABLE[(n >> 8) & 0xff] + 
               LOOKUP_TABLE[(n >> 16) & 0xff] + 
               LOOKUP_TABLE[(n >>> 24) & 0xff];
    }
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=countActiveBits(i);
        }
        return arr;
    }
}