package unit11;

// 2018 FRQ #3
// https://secure-media.collegeboard.org/ap/pdf/ap18-frq-computer-science-a.pdf#page=12
interface StringChecker {
    /** Returns true if str is valid. */
    boolean isValid(String str);
}

public class CodeWordChecker implements StringChecker {

    private int min;
    private int max;
    private String no;

    public CodeWordChecker(int m, int m2, String n){
        min = m;
        max = m2;
        no = n;
    }

    public CodeWordChecker(String n){
        no = n;
    }

    /** Returns true if str is valid. */
    public boolean isValid(String str) {
        boolean good = true;
        if(str.length() >= min && str.length() <= max){
            for(int index = 0; index < str.length(); index++){
                if (Character.toString(str.charAt(index)) == no)
                    good = false;
                else
                    good = true;
            }
        }
        return good;
    }

    static boolean check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
        return test;
    }

    public static void main(String[] args) {
        // uncomment the following lines to test your code
         StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        check(sc1.isValid("happy"));
        check(!sc1.isValid("happy$"));
        check(!sc1.isValid("Code"));
        check(!sc1.isValid("happyCode"));
        check(!sc1.isValid("happy$Code"));
        check(!sc1.isValid("Code$happy"));

        StringChecker sc2 = new CodeWordChecker("pass");
        check(sc2.isValid("MyPass"));
        check(!sc2.isValid("Mypassport"));
        check(!sc2.isValid("happy"));
        check(!sc2.isValid("1,000,000,000,000,000"));

        System.out.println("Happy Panda! \uD83D\uDC3C");
    }

}
