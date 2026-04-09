class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0){
            return true;
        }
        int sPointer = 0;
  

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(int tPointer = 0; tPointer< tChar.length; tPointer++){

            if(tChar[tPointer] == sChar[sPointer]){
                sPointer++;
            }

            if(sPointer >= sChar.length){
                return true;
            }


        }
        return false;
    }
}
