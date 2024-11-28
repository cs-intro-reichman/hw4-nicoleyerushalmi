public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code again
        int n = Integer.parseInt(args[0]);
        boolean [] prime_num = new boolean [n + 1];
        prime_num[0] = false;
        prime_num[1] = false;
        for(int i = 2; i < prime_num.length; i++){
            prime_num[i] = true;
        }
        for(int k = 2; k < Math.sqrt(n); k ++){
            for(int t = k; t < prime_num.length; t++){
                if (t % k == 0) {
                    prime_num[t] = false;
                }
            }
        }
    }
}