class Solution {
    public String longestCommonPrefix(String[] strs) {
       
       char[] word = strs[0].toCharArray();
        int max = word.length;
       for(int i = 1; i<strs.length;i++){
        for(int j = 0; j<max;j++){
            char[] chosen = strs[i].toCharArray();
            if(!(j <  chosen.length && word[j]==chosen[j])){
                max=j;
            }
        }
       }

       return max==0 ? "" : strs[0].substring(0,max);
       
    }
}
