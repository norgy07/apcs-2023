//Naomi Norgard
//APCS A 

//Coding to find pi

public class PiDay {
    double total = 0;

    // infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence

    // 4/1 - 4/3 + 4/5 - 4/7
   public static double pi (int n, boolean subtract) {
    //BASE CASE
    if (n>=1000) return 0.0;

    //RECURSIVE CASE
    if(!subtract){
        return 4/(n-1)*(n+2)*n + pi(n+2, false);
    } else
        return -4/(n-1)*(n+2)*n + pi(n+2, true );
   }

    public static void main(String args[]) {
        // Gregory–Leibniz
        double pi = pi(576, true);

        // Nilakantha
        //double pi = 3 + piDay(3, false);
        System.out.println("pi = " + pi);

    }
}
