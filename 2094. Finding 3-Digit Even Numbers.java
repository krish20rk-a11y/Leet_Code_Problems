class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] cn = new int[10];
        for(int d : digits){    cn[d]++;    }
        List<Integer> resultList = new ArrayList<>();
        for(int i = 100; i<=998; i+=2){
            int hd = i/100;
            int tns = (i/10) % 10;
            int ons = i % 10;
            cn[hd]--;
            cn[tns]--;
            cn[ons]--;
            if(cn[hd] >= 0 && cn[tns] >= 0 && cn[ons] >= 0){
                resultList.add(i);
            }
            cn[hd]++;
            cn[tns]++;
            cn[ons]++;
        }
        int[] result = new int[resultList.size()];
        for (int k = 0; k<resultList.size();k++){   result[k] = resultList.get(k);  }
        return result;
    }
}
