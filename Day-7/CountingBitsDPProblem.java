public class CountingBitsDPProblem {
    public int[] countBits(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 1)
                dp[i] = dp[i / 2] + 1;
            else
                dp[i] = dp[i / 2];
        }
        return dp;
    }

    public static void main(String[] args) {
        CountingBitsDPProblem obj = new CountingBitsDPProblem();
        int n = 10; // You can change this input
        int[] result = obj.countBits(n);

        System.out.println("Number of 1s in binary representations from 0 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println("Number " + i + " -> " + result[i]);
        }
    }
}
