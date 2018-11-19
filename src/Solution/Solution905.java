package Solution;

public class Solution905 {
    public static   int[] sortArrayByParity(int[] A) {
        int[] temp = new int[A.length];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                temp[index++] = A[i];
                A[i] = -1;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == -1) {
                continue;
            }else {
                temp[index++] = A[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] X = {0,3,7,3,3,9,6,4,6};
        int[] ints = sortArrayByParity(X);
        for (int i = 0; i < ints.length; i++) {
            System.out.println("A[" + i + "]" + "=" + ints[i]);
        }
    }
}
