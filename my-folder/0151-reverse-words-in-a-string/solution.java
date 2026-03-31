class Solution {
    public static String reverseWords(String s) {

        String[] spl = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = spl.length-1; i>=0; i--){
            result.append(spl[i]);
            result.append(" ");
        }
        return result.toString().strip();

    }
}

