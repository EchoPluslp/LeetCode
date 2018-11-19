package Solution;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> totalList = new ArrayList();
        if (numRows == 0) {
            return totalList;
        }

        List<Integer> index1 = new ArrayList<>();
        index1.add(1);
        totalList.add(index1);
        if (numRows == 1) {
            return totalList;
        }
        List<Integer> index2 = new ArrayList<>();
        index2.add(1);
        index2.add(1);
        totalList.add(index2);
        if (numRows == 2) {
            return totalList;
        }
        for (int i = 2; i < numRows + 1; i++) {
            List<Integer> integerList  = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i-1) {
                    integerList.add(1);
                    continue;
                }
                integerList.add(totalList.get(i - 1).get(j) + totalList.get(i - 1).get(j - 1));
            }
            totalList.add(integerList);
        }
        totalList.remove(2);
        return totalList;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(0);
        for (int i = 0; i < generate.size(); i++) {
            System.out.println(generate.get(i));
        }
    }
}
