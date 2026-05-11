class Solution {

    public boolean isVowel(char c){

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
    }
    public int maxVowels(String s, int k) {
        char[] sChar = s.toCharArray();
    
        int right = 0;
        int left = 0;

        int maxValue = 0;
        while(right < k){
            
            if(isVowel(sChar[right])){
                maxValue++;
            }
            right++;
            
        }

        //at this point right should be k, and left 0
        int current = maxValue;

        while(right<sChar.length){
            if(maxValue==k){
                return k;
            }
            
            if(isVowel(sChar[right])){
                current++;
            }
            right++;
            if(isVowel(sChar[left])){
                current--;
            }
            left++;
            maxValue= Math.max(maxValue, current);
        }
    return maxValue;

    }
}
