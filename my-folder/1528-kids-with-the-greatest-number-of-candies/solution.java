class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //O(2n)  simpifies to O(n)
        int biggest = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i : candies){
            biggest = Math.max(biggest, i);
        }
        for(int x = 0; x < candies.length; x++){
            if(candies[x]+extraCandies >= biggest){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}
