package Assignment5.Assigment.data;

public class DefaultInitilizationAssignment {
    int variable1;
    char variable2;

    public void printNonStatic()
    {
        System.out.println("int variable = "+variable1+"\n"+"char variable = "+variable2);
        //for the non-static variable whenever the constructor is invoked
        // their default behaviour will be initialized

    }
    public void printLocal()
    {
        int localVar1;
        char localVar2;
        //for local variables unless the variables are initlized the error will not be resolved
     //   System.out.println("int variable = "+localVar1+"\n"+"char variable = "+localVar2);
    }
}
