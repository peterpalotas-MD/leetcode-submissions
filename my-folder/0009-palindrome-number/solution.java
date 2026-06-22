
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int output = 0;
        int input = x;
        while(x > 0){
            int pop = x % 10;
            x /= 10;
            
            output = (output * 10) + pop;
        }

        return output==input;
        
    }
}


