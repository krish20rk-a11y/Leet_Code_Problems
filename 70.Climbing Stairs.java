class Solution {
    public int climbStairs(int n) {
        if (n<=2){return n;}
        int on=1,to=2;
        for(int i=3;i<=n;i++){
            int cr = on+to;
            on=to;
            to=cr;
        }
        return to;
    }
}
