package unit11.b;

// 🐦🐦🐦
// https://birdsarentreal.com/
public class Bird {
    public static void main(String[] args) {

        String s = "turkey";
        // predict before uncommenting ---> will print urk because inclusive on first num but exclusive on second
        System.out.println(s.substring(1, 4));

        String t = new String("turkey");
        // EXPLICIT STRINGS COME FROM THE STRING POOL
        System.out.println(s == t); //FALSE
        System.out.println("turkey" == t); //FALSE
        System.out.println(s == "turkey"); //TRUE
        System.out.println(s.equals(t));

        int x = 3 % 7;
        System.out.println(x); //3 because int division
        x = 7 % 3;
        System.out.println(x);

        String w = "ans: " + 4 + 5;
        System.out.println(w); // ans: 45

        int num1 = 0;
        int num2 = 3;
        while ((num2 != 0) && ((num1 / num2) >= 0)) {
            num1 = num1 + 2;// 2,4,6
            num2 = num2 - 1;

        }

        recur(7);
        
        int[] oddball = {1,3,5,7,9,11,13,15,17,19,21};
        // predict before uncommenting
        // System.out.println(num1 + ", " + num2);

        // what will recur do?
        // recur(7);
    }

    private static void recur(int n) {
        //if (n != 0) { //calls 7, 5, 3, 1, -1 <----- OVERFLOW Sooooooo....
        if(n>0){
            recur(n - 2);
            System.out.print(n + " ");
        }
    }

    // precondition: arr is not empty, and may have negative values
    // https://www.khanacademy.org/math/cc-sixth-grade-math/cc-6th-negative-number-topic/x0267d782:ordering-rational-numbers/a/ordering-negative-numbers
    private int smallest(int[] arr, int n) {
        // return smallest value in arr less than n
        // what is the smallest integer?
    
        int thisIsSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < n){
                if (arr[i] < thisIsSmallest){
                    thisIsSmallest = arr[i];
            }
        }
        }
        return thisIsSmallest; 
    }
}
