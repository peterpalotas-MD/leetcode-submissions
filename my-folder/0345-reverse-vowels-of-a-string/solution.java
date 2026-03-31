class Solution {
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' || c == 'u' || c == 'U';
    }

    public String reverseVowels(String s) {

        char[] sChar = s.toCharArray();

        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(!isVowel(sChar[left])){
                left++;
            }
            else if (!isVowel(sChar[right])) {
                right--;
            }
            else{
                char temp = sChar[left];
                sChar[left] = sChar[right];
                sChar[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(sChar);
    }
}
