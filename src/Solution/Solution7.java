package Solution;



public class Solution7 {
    public static int reverse(int x) {
        Long ada = Integer.toUnsignedLong(x);
        char[] chars = String.valueOf(ada).toCharArray();
        int lastNum = chars.length - 1;
        int i = 0;
        while (i<lastNum) {
            if (chars[i] == '-') {
                i++;
                continue;
            }
            char temp = chars[i];
            chars[i++] = chars[lastNum];
            chars[lastNum--] = temp;
        }
        Long aLong = Long.valueOf(String.valueOf(chars));
        if (aLong > 4294967296l) {
            return 0;
        }
        return Math.toIntExact(aLong);
    }

    public static void main(String[] args) {
        long x = 3717694924l;
//        System.out.println(reverse(x));
    }
}
