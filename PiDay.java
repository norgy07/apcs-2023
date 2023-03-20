//Naomi Norgard
//APCS A 

////////////////////////////////////////////////////////////////////////////////////////////////////
//03.14.2023
//Coding to find pi

public class PiDay {
    double total = 0;

    // infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
   public static double piDay (int n, boolean subtract) {
       if (n%2 == 0){
        subtract = true;
       } 
       else{
        subtract = false;
       } 
       
       //Base case
        if (subtract = true){
         double pi = -4/(n+(n-1)) + piDay(n-1, false);  
         return pi;
        } 
        else{ 
         double pi = 4/ (n+(n-1)) + piDay(n-1, true);
         return pi;
        }
        
       return pi;
   }

    /////////////////////////////////////////////////////////////////////////////////////////////////
    // 03.16.2023
    // Recursive and iterative power function

    /*
     * static int power (int a, int b){
     * //base case
     * if (b==1){
     * return a;
     * } else {
     * if (b%2 == 1){
     * //b is odd so...
     * return nextPower * nextPower*2;
     * } else {
     * int nextpower = power(a,b/2);
     * return nextPower * nextPower;
     * }
     * }
     * }
     * 
     * static int powerIter(int a, int b){
     * int result =1;
     * for (int i = 0, i < b; i++){
     * result *= a;
     * }
     * return result;
     * }
     * 
     * 
     * /////////////////////////////////////////////////////////////////////////////
     * //////////////////////
     * // MAIN
     */

    public static void main(String args[]) {
        // Gregory–Leibniz
        // double pi = piDay(1, false);

        // Nilakantha
        double pi = 3 + piDay(3, false);
        System.out.println("pi = " + pi);

    }
}
