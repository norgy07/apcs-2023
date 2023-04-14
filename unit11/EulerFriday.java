package unit11;
import unit10.Recur;

public class EulerFriday {

    public static void main(String[] args) {

        // 1
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if(i%3==0 || i%5==0)
                sum+=i;
        }
        System.out.println(sum);

        // 2
        sum = 0;
        int a = 1;
        int b = 2;
        while(b < 4000000){
            if(b%2==0)
                sum += b;
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);

        // 3
        long factorMe = 600851475143l;
        int factor = 2;
        while(factorMe > factor){
            if(factorMe % factor == 0){
                factorMe /= factor;
            }
            else
                factor++;
        }
        System.out.println(factor);

        // 4
        int largestPal = 0;
        for(int i = 100; i <= 999; i ++){
            for(int o = 100; o <= 999; o++){
                int product = i*o; 
                String pro = Integer.toString(product);
                if(Recur.pot(pro)){
                    if(product > largestPal)
                        largestPal = product;
                }
            }
        }
        System.out.println(largestPal);

        // 5
        for (int i = 1; i <= 20; i++){
          //  gcd(i);
        }
       // lcm (a*b)/gcd(a,b)
       // gcd if(a%b == 0) b else gcd of (b, a %b)
    }

    static int[] prob8scaffold() {
        // woo java 13 supports multi-line strings!
        String lines = """
                73167176531330624919225119674426574742355349194934
                96983520312774506326239578318016984801869478851843
                85861560789112949495459501737958331952853208805511
                12540698747158523863050715693290963295227443043557
                66896648950445244523161731856403098711121722383113
                62229893423380308135336276614282806444486645238749
                30358907296290491560440772390713810515859307960866
                70172427121883998797908792274921901699720888093776
                65727333001053367881220235421809751254540594752243
                52584907711670556013604839586446706324415722155397
                53697817977846174064955149290862569321978468622482
                83972241375657056057490261407972968652414535100474
                82166370484403199890008895243450658541227588666881
                16427171479924442928230863465674813919123162824586
                17866458359124566529476545682848912883142607690042
                24219022671055626321111109370544217506941658960408
                07198403850962455444362981230987879927244284909188
                84580156166097919133875499200524063689912560717606
                05886116467109405077541002256983155200055935729725
                71636269561882670428252483600823257530420752963450""";
        // remove all whitespace
        lines = lines.replaceAll("\\s", "");
        // split into digits and parse into int array
        String[] digitArr = lines.trim().split("");
        int[] nums = new int[digitArr.length];
        for (int i = 0; i < digitArr.length; i++) {
            nums[i] = Integer.parseInt(digitArr[i]);
        }
        return nums;
    }

    public int gcd(int a, int b){
        if (a%b == 0)
            return b;
        else
            return gcd(b, a%b);
    }

    public int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
