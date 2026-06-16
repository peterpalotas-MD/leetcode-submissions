class Solution {
    public int[] plusOne(int[] digits) {
        
        int pointer = digits.length-1;

        boolean carry = true;

        while (carry==true){
            
            if(digits[pointer]!=9){
                digits[pointer]++;
                carry=false;
            }
            else{
                digits[pointer]=0;
                carry=true;
                pointer--;
            }
            
            if(pointer<0){
                int[] newArray = new int[digits.length+1];
                newArray[0]=1;
                for(int i = 1; i<newArray.length;i++){
                    newArray[i]=digits[i-1];
                }
                return newArray;
            }

        }
        return digits;

    }
}
