package Assignment5.Assigment.main;

import Assignment5.Assigment.data.DefaultInitilizationAssignment;
import Assignment5.Assigment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        DefaultInitilizationAssignment defaultInitilizationAssignment=new DefaultInitilizationAssignment();
        defaultInitilizationAssignment.printLocal();
        defaultInitilizationAssignment.printNonStatic();
        Singleton singleton=Singleton.CreateObject("vamshi");
        singleton.print();

    }
}
