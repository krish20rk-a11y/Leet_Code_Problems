class Solution {
    public int subtractProductAndSum(int n) {
        int pr = 1 , sum = 0;
        while(n>0){
            int dj = n%10;
            pr *=dj;
            sum +=dj;
            n/=10;
        }
        return pr - sum;
    }
}
