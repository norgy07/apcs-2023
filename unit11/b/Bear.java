package unit11.b;

// let's explore inheritance!
public class Bear {
    private Zoo home; 
    private String name;

    public Bear(String n){
        name = n;
    }

    public Bear(){
        name = ("Mr.Bear");
    }

    public getName(){
        return name;
    }
    public static void main (String [] args){
        Panda meiLan = new Panda("meiLan");
        Bear mrBear = new Bear(); 
        // Panda mrPandaBear = new Panda();
    }
}

// https://wwf.panda.org/wwf_news/?163461/Is-the-giant-panda-a-bear
class Panda extends Bear{
   
    private String myPandaName;

    // IMPLICIT DEFAULT CONSTRUCTOR WHEN THERE ARE NO OTHERS

    public Panda(String pandaName){
        super(pandaName);
        myPandaName = pandaName;
    //     // CANNOT SET PRIVATE VARS EVEN ON A SUPERCLASS
    //     // this.name = pandaName;
    }

    // IMPLICIT DEFAULT CONSTRUCTOR WHEN THERE ARE NO OTHERS
    public panda(){
        // called implicitly
        //super();
    }
}

// https://en.wikipedia.org/wiki/List_of_giant_pandas
class Zoo {
    private Panda tenant;

}

// Zookeeper, Visitor, etc.
