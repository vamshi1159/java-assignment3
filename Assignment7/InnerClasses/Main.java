package Assignment7.InnerClasses;


public  class Main
{
    public static void main(String[] args) {
        OuterClassOne outerClassOne=new OuterClassOne();
        OuterClassTwo outerClassTwo=new OuterClassTwo();
        OuterClassTwo.InnerClassTwo innerClassTwo=outerClassTwo.new InnerClassTwo(outerClassOne,4);
        System.out.println(innerClassTwo.id);
    }
}