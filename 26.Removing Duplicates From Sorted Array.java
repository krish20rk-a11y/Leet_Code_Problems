class Solution {
    public int removeDuplicates(int[] nums) {
        int cn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[cn]){
                cn++;
                nums[cn]=nums[i];
            }
        }
        return cn+1;
    }
}
