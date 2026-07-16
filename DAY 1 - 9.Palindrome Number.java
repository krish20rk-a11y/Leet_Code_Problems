class Solution {
    public boolean isPalindrome(int x) {
        long vn=0;
        int st=x;
        while (x != 0) {
            int dj = x % 10;
            vn = vn * 10 + dj;
            x /= 10;
        }
        vn = (int) vn;
        if(vn<0){   vn=-vn;}
        if(vn==st){
           return(true);
        }
        else{
            return(false);
        }

    }
}
