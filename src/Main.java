import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //int ans = (int)Math.pow(8,1.0/3+(1e-8));
        System.out.println(getNext("abaabacaefabcd")[5]);
    }
    public static int[] getNext(String ps) {

        char[] p = ps.toCharArray();

        int[] next = new int[p.length];

        next[0] = -1;

        int j = 0;

        int k = -1;

        while (j < p.length - 1) {

            if (k == -1 || p[j] == p[k]) {

                next[++j] = ++k;

            } else {

                k = next[k];

            }

        }

        return next;

    }

}
