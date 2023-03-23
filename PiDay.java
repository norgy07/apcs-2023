//Naomi Norgard
//APCS A 

//Coding to find pi

public class PiDay {
    double total = 0;

    // infinite series for π
    // https://en.wikipedia.org/wiki/Pi#Rate_of_convergence
   public static double piDay (int n, boolean subtract) {
       double pie = 0; 
       if (n==0)
        return 4;

       if (n%2 == 0)
        subtract = true; 
       else
        subtract = false;
       
       //Base case
       if (n < 1000){
        if (subtract == true){
         double pi = -4/(2+(n-1)) + piDay(n-1, false);  
         pie = pi; }
    
        else if (subtract == false){   
         double pi = 4/ (2+(n-1)) + piDay(n-1, true);
         pie = pi;
        }
       }
       return pie;
   }

    public static void main(String args[]) {
        // Gregory–Leibniz
        double pi = piDay(5, false);

        // Nilakantha
        //double pi = 3 + piDay(3, false);
        System.out.println("pi = " + pi);

    }
}
