class Solution {

    public int largestAltitude(int[] gain) {
        int highest = 0;
        int total=0;
        for(int i : gain){
            total+=i;
            if(total>highest) highest=total;
        }
        return  highest;
    }
}
