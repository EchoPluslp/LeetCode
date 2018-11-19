package Solution;
//
//全部字母都是大写，比如"USA"。
//        单词中所有字母都不是大写，比如"leetcode"。
//        如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
public class Solution520 {
    public static boolean detectCapitalUse(String word) {
        boolean b = role1(word);
        boolean b1 = role2(word);
        boolean b2 = role3(word);
        return b || b1 || b2;
    }

    private static boolean role1(String word) {
        String UpperWord = word.toUpperCase();
        if (UpperWord.equals(word)) {
            return true;
        }
        return false;
    }
    private static boolean role2(String word) {
        String LowWord = word.toLowerCase();
        if (LowWord.equals(word)) {
            return true;
        }
        return false;
    }
    private static boolean role3(String word) {
        char[] chars = word.toCharArray();
        if (String.valueOf(chars[0]).matches("[A-Z]") && chars.length > 1) {
            //获取从第二位开始的数据
            String s = String.valueOf(chars, 1, chars.length - 1);
            return role2(s);
        }
        return false;
    }


    public static void main(String[] args) {
        String test = "USA";
        System.out.println(detectCapitalUse(test));
    }
}
