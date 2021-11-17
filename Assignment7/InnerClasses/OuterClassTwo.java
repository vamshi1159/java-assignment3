package Assignment7.InnerClasses;

public class OuterClassTwo {
    class InnerClassTwo extends OuterClassOne.InnerClassOne
    {

        InnerClassTwo(OuterClassOne outerClassOne,int id) {
            outerClassOne.super(id);

        }
    }
}
