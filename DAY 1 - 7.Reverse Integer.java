import java.util.*;
class Solution {
    public int reverse(int x) {
        long vn=0;
        while (x != 0) {
            int dj = x % 10;
            vn = vn * 10 + dj;
            x /= 10;
            if(vn > Integer.MAX_VALUE || vn < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int) vn;
    }
}
