package unit11;


// 2019 FRQ #2
// https://apcentral.collegeboard.org/media/pdf/ap19-frq-computer-science-a.pdf#page=7
public class StepTracker {

    private int activeDays;
    private int days;
    private int totalSteps;
    private int min; 

    public StepTracker(int s){
        min = s;
        totalSteps = 0;
        days = 0;
        activeDays = 0;
    }

    public void addDailySteps(int num){
        days++;
        totalSteps += num;
        if(num >= min)
            activeDays++;
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        if(totalSteps == 0)
            return 0.0;
        else 
            return 1.0*totalSteps/days; 
    }


    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("bad panda");
    }

    public static void main(String[] args) {
        // uncomment the following lines to test your code
        StepTracker tr = new StepTracker(10000);
        check(tr.activeDays() == 0);
        check(tr.averageSteps() == 0.0);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        check(tr.activeDays() == 0);
        check(tr.averageSteps() == 7000.0);
        tr.addDailySteps(13000);
        check(tr.activeDays() == 1);
        check(tr.averageSteps() == 9000.0);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        check(tr.activeDays() == 2);
        check(tr.averageSteps() == 10222.2);
        System.out.println("Happy Panda! \uD83D\uDC3C");
    }
}
