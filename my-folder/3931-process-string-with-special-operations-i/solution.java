class Solution {
    public String processStr(String s) {
        char[] c = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char character : c){
            switch (character) {
                case '*':
                    if(result.length()>=1){
                        result.deleteCharAt(Math.max(0, result.length()-1));
                    }break;
                case '#':
                     result.append(result);
                     break;
                case '%':
                     result.reverse();
                     break;
                default:
                     result.append(character);
                     break;
            }
        }
        return result.toString();
    } 
}
