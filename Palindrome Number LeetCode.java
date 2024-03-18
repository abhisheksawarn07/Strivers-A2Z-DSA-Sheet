public boolean isPalindrome(int x) {
    int original = x;
    int updtd = 0;
    while(x>0){
        int ld = x%10;
        updtd = updtd*10+ld;
        x/=10;
    }
    if(original != updtd) return false;
    return true;
}
