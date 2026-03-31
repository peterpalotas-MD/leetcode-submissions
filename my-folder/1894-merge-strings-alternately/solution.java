
class Solution {

    public String mergeAlternately(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        int trackFirst = 0;
        int trackSecond = 0;


        StringBuilder result = new StringBuilder();
        while(trackFirst < word1.length() && trackSecond < word2.length()){
            result.append(w1[trackFirst]);
            result.append(w2[trackSecond]);

            trackFirst++; trackSecond++;
        }

        result.append(word1.substring(trackFirst));
        result.append(word2.substring(trackSecond));
        return result.toString();
    }

}
