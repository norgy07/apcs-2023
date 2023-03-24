// WHAT DOES IT DO?
//COMMENTS OF INPUT AND OUTPUT FOR EACH CALL OR PRINT

package unit10;

public class Recur {

    //fun3 is a 3^x math function
    public static int fun3(int n) {
        System.out.println("called ("+n+")");
        if (n == 0)  //if n is zero 1 is returned then the calls leading up to it can be evaluated
            return 1;
        else
            System.out.println("output fun3 ("+(n-1)+")");
            return 3 * fun3(n - 1);
    }

    //f is a method that will return the sum of the previous numbers
    public static int f(int n) {
        System.out.println("called ("+n+")");
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            System.out.println("return ("+(n-1)+") + ("+(n-2)+")");
            return f(n - 1) + f(n - 2);
    }

    public static boolean has(String input) {
        System.out.println("called ("+input+")");
        if (input.length() < 2)
            return false;
        /* BELOW: returns whether character at index 0 is the same as 1 if it's or recurses through has
                  assess whether the string is shorter than two characters or go back through the previously 
                  described conditions until either the charAt(0) and charAt(1) is "true" or the length isn't
                  bigger than 2 in which it will return "false"
        */        
        return (input.charAt(0) == input.charAt(1) || has(input.substring(1)));
    }

    public static boolean pot(String input) {
        System.out.println("called ("+input+")");
        if (input.length() < 2)
            return true;
        System.out.println("returned ");
        /*  BELOW: return statement evaluates whether the first and second to last characters are equal to one
         *  another in addition to calling pot again with the first and last characters removed from the string
         *  to see if the changed input will return false or true
         */ 
        return (input.charAt(0) == input.charAt(input.length() - 1)
                && pot(input.substring(1, input.length() - 1)));
    }

    /*  method "two" has one argument that is an int "n" and if that is less than one 1.0/2 is returned then 1.0
     *  is divided by the sum of 2 and the method call of "two" of the number one less than the current "n"
     */ 
    public static double two(int n) {
        System.out.println("executed ("+n+")");
        //Base case stops at zero 
        if (n < 1)
            return 1.0 / 2;
        System.out.println("ended ("+n+")");
        //recursive case calls the int before each method call until reaches base case
        return 1.0 / (2 + two(n - 1));
    }

    /*  "mop" is a method that returns 0 if the input is even and otherwise will recurse through the mop again of
     *  half of the previous value and add n mod 2 
     *  11 is not divisible by 2 so goes to the second return statement and then 11/2 as an int is 5 so mop(5) + 
     *  11%2 which is 1 SO: each method call is integer division of the preious term by 2 and then returns the sum 
     *  of those "mop" calls and the mod 2 of the numbers 
     */ 
    public static String mop(int n) {
        System.out.println("executed ("+n+")");
        if (n / 2 == 0)
            return "" + n % 2;
        System.out.println("ended ("+(n/2)+(n%2)+")");
        return mop(n / 2) + n % 2;
    }

    /*  "cat" will walk through the digits of a number and return the place values and recurse with the number/10 
     */
    public static int cat(int x) {
        System.out.println("executed ("+x+")");
        if (x == 0)
            return x;
        System.out.println("ended ("+x+")");
        return ((x % 10) + cat(x / 10));
    }

    public static int mystery(int x) {
        if (x <= 1)
            return 1;
        // return mystery(x - 1) + mystery(x - 2);
        return 2 * mystery(x - 2); // THIS OPTION returns 32
        // return 2 * mystery(x - 1);
        // return 4 * mystery(x - 4);
        // return 4 + mystery(x - 1);
    }

    public static void main(String[] args) {

        // Consider function fun3
        //System.out.println(fun3(5));
            //RETURNS 243

        // Consider function f
        //System.out.println(f(10));

        // Consider function has
        //System.out.println(has("hello"));
        //System.out.println(has("howdy"));

        // Consider function pot
        //System.out.println(pot("deepeed"));
        //System.out.println(pot("deepfried"));

        // Consider function two
        // System.out.println(two(6));

        // Consider function mop
        // System.out.println(mop(11));

        // Consider function cat
        // System.out.println(cat(4096));

        // Fix function mystery so that mystery(10) == 32
        System.out.println(mystery(10));

    }
package unit10;

public class Recur {

    public static int fun3(int n) {
        if (n == 0)
            return 1;
        else
            return 3 * fun3(n - 1);
    }

    public static int f(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    public static boolean has(String input) {
        if (input.length() < 2)
            return false;
        return (input.charAt(0) == input.charAt(1) || has(input.substring(1)));
    }

    public static boolean pot(String input) {
        if (input.length() < 2)
            return true;
        return (input.charAt(0) == input.charAt(input.length() - 1)
                && pot(input.substring(1, input.length() - 1)));
    }

    public static double two(int n) {
        if (n < 1)
            return 1.0 / 2;
        return 1.0 / (2 + two(n - 1));
    }

    public static String mop(int n) {
        if (n / 2 == 0)
            return "" + n % 2;
        return mop(n / 2) + n % 2;
    }

    public static int cat(int x) {
        if (x == 0)
            return x;
        return ((x % 10) + cat(x / 10));
    }

    public static int mystery(int x) {
        if (x <= 1)
            return 1;
        // return mystery(x - 1) + mystery(x - 2);
        // return 2 * mystery(x - 2);
        // return 2 * mystery(x - 1);
        // return 4 * mystery(x - 4);
        return 4 + mystery(x - 1);
    }

    public static void main(String[] args) {

        // Consider function fun3
        // System.out.println(fun3(5));

        // Consider function f
        // System.out.println(f(6));

        // Consider function has
        // System.out.println(has("hello"));
        // System.out.println(has("howdy"));

        // Consider function pot
        // System.out.println(pot("deified"));
        // System.out.println(pot("deepfried"));

        // Consider function two
        // System.out.println(two(6));

        // Consider function mop
        // System.out.println(mop(11));

        // Consider function cat
        // System.out.println(cat(4096));

        // Fix function mystery so that mystery(10) == 32
        // System.out.println(mystery(10));

    }

}

}