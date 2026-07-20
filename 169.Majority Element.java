class Solution {
    public int majorityElement(int[] nums) {
        int cd = 0, cn = 0;
        for (int nm:nums){
            if(cn == 0){    cd = nm;    }
            if(cd == nm){   cn++;   }
            else{   cn--;}
        }
        return cd;
    }
}
