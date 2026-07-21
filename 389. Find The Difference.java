class Solution {
    public char findTheDifference(String s, String t) {
        char[] tp = t.toCharArray();
        char[] sp = s.toCharArray();
        long sm=0,df=0;
        for(char c:tp){sm+=c;}
        for(char c:sp){df+=c;}
        return (char)(sm-df);

    }
}
