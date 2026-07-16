class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] rs = new int[2*n];
        int i = 0;
        for(int k=0;k<n;k++){
            rs[i++] = nums[k];
            rs[i++] = nums[k+n];
        }
        return rs;
    }
}
