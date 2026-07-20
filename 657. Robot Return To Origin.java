class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char mv : moves.toCharArray()){
            if(mv == 'U') y++; 
            if(mv == 'D') y--; 
            if(mv == 'L') x++; 
            if(mv == 'R') x--; 
        }
        return x==0 && y==0;
    }
}
