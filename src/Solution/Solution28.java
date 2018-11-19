package Solution;
//给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

//有更简单的indexOf
//split[needle]
public class Solution28 {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }else if (haystack.length() < needle.length()) {
            return 0;
        }
        char[] haystackC = haystack.toCharArray();
        char[] needleC = needle.toCharArray();
        int start = 0;
        int end = haystack.length() - 1;
        while (start <= end) {
            if (haystackC[start] != needleC[0]) {
                start++;
                continue;
            }
            //找到第一个匹配的字符串
            int temp = start + 1;
            int numNeedleC = 1;
            for (; numNeedleC < needleC.length && temp < haystackC.length; numNeedleC++,temp++) {
                if (needleC[numNeedleC] == haystackC[temp]) {

                    continue;
                }else{
                    break;
                }
            }
            if (numNeedleC == needleC.length) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("a","a"));
    }
}
