package unit10;
//Naomi Norgard
//APCS A 

//Coding to find pi

public class PiDay {
    double total = 0;

    // infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence

   public static double piDay (int n, boolean subtract) {
    if (n>=1000){
        return 0;
    }
    else{
        if(subtract){
            return -4.0/n + piDay(n+2, false);
        }
        return 4.0/n + piDay(n+2, true);
    }
   }

    public static void main(String args[]) {
        // Gregory–Leibniz
        double pi = piDay(1, false);

        // Nilakantha
        //double pi = 3 + piDay(3, false);
        System.out.println("pi = " + pi);

    }
}
