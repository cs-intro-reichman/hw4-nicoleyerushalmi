public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code again
        int n = Integer.parseInt(args[0]);
        boolean [] prime_num = new boolean [n + 1];
        prime_num[0] = false;
        prime_num[1] = false;
        int s = 0;
        int count = prime_num.length;
        for(int i = 2; i < prime_num.length; i++){
            prime_num[i] = true;
        }
        for(int k = 2; k < Math.sqrt(n); k ++){
            for(int t = k; t < prime_num.length; t++){
                if (t % k == 0 && t != k && prime_num[t] != false) {
                        count --;
                        prime_num[t] = false;
                    //System.out.println( " k = " + k + " t = " + t);
                }
            }
        }
        int[] all_prime = new int [count - 2];
        System.out.println("Prime numbers up to " + n + ":");
        for(int p = 0; p < prime_num.length; p++){
            if (prime_num[p] == true) {
                all_prime[s] = p;
                s++;
                System.out.println(p);
            }
        }
        int percent =(int)(100*(all_prime.length + 0.0)/(prime_num.length - 1.0));
        // System.out.println("number of primes: " + all_prime.length);
        // System.out.println("number of trys: " + prime_num.length);
        // System.out.println("percent of primes: " + (all_prime.length + 0.0)/(prime_num.length -1.0));
        System.out.println("There are " + all_prime.length + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
}