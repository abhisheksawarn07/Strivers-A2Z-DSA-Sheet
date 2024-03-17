public static long reverseBits(long n) {
    long result = 0;
    for(int i=0;i<32;i++){
        long lsb = n&1;
        long reverselsb = lsb << (31-i);
        result  = result | reverselsb;
        n = n>>1;
    }return result;
}

