
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> baloonMap = new HashMap<>();

        char[] textArr = text.toCharArray();
        for(char c : textArr){
            if(isBalloon(c)){
                baloonMap.put(c, baloonMap.getOrDefault(c, 0)+1);
            }
        }
        if(baloonMap.get('l') != null){
            baloonMap.put('l', baloonMap.get('l')/2);
        }
        if(baloonMap.get('o') != null){
            baloonMap.put('o', baloonMap.get('o')/2);
        }

        if(baloonMap.values().size()==5){

            OptionalInt smallest = baloonMap.values().stream().mapToInt(Integer::intValue)
            .min();
            int small = smallest.getAsInt();
            if(small >=1){
                return small;
            }
        }
       return 0;
    }

    public boolean isBalloon(char c){
        return c=='b' || c=='a' || c=='l' || c=='o' || c=='n'; 
    }
}


