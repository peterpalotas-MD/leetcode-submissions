class Solution {
    public static int gcdHelper(int a, int b){

        if(a%b == 0){
            return b;
        }

        return gcdHelper(b, a%b);
    }
    public String gcdOfStrings(String str1, String str2) {

        if(!((str1 + str2).equals(str2+str1))) {return "";}

        int gcd = gcdHelper(Math.max(str1.length(), str2.length()), Math.min(str1.length(), str2.length()));
        return str1.substring(0, gcd);
    }
}
