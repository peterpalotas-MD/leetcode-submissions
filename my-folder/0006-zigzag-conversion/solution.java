
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        char[] input = s.toCharArray();
        StringBuilder output = new StringBuilder();
        for(int row = 0; row<numRows;row++){
            int increment = 2*(numRows-1);
            for(int letter=row; letter<input.length;letter+=increment){
                
                output.append(input[letter]);
                if(row>0 && row<numRows-1 && (letter+increment)-(2*row) < input.length){
                    output.append(input[letter+increment- (2*row)]);
                }
            }
        }
        return  output.toString();
    }
}

