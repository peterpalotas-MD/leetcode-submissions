class Solution {
    public int reverse(int x) {


        int output = 0;
        boolean negative = false;
        if(x<0){
            negative=true;
            x*=-1;
        }
        while(x > 0){
            int pop = x % 10;
            x /= 10;
            if (output > Integer.MAX_VALUE / 10 || (output == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }            
            output = (output * 10) + pop;
        }
        
        if(negative){
            output*=-1;
        }
        return output;
        
    }
}

