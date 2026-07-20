class Solution {
    public int maximum69Number (int num) {
        char[] dj = String.valueOf(num).toCharArray();
        for(int i = 0; i < dj.length;i++){
            if(dj[i] == '6'){
                dj[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(dj));
    }
}
