class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int length = s.length();
        int current = getValue(s.charAt(0));
        for (int i = 0; i < length - 1; i++) {
            int next = getValue(s.charAt(i + 1));

            if (current < next) {
                ans -= current;
            } else {
                ans += current;
            }
            current = next;
        }

        ans += getValue(s.charAt(length - 1));

        return ans;
    }

    private int getValue(char c) {
        return switch (c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
