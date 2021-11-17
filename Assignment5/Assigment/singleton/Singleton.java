package Assignment5.Assigment.singleton;

public class Singleton {
    String variable1;

    public static Singleton CreateObject(String variable1) {
        //this.variable1=variable1;
        //non-static variable cannot be initialized in static block or function
        return new Singleton(variable1);
    }

    private Singleton(String variable1) {
        this.variable1 = variable1;
    }

    public void print()
    {
        System.out.println("variable ="+variable1);
    }
}
