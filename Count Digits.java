
    public static int countDigits(int n){
       int k = n;
       int count = 0;
       while(k>0){
           int ld = k%10;
           if(ld!=0 && n%ld==0) count++;
            k/=10;
       }
       return count;
    }
