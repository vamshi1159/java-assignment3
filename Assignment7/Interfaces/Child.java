package Assignment7.Interfaces;

public class Child extends ConcreteClass implements CombineInterface{
    @Override
    public void m7() {
        System.out.println("m7");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }

    @Override
    public void m4() {
        System.out.println("m4");
    }

    @Override
    public void m5() {
        System.out.println("m5");
    }

    @Override
    public void m6() {
        System.out.println("m6");
    }
    public void interface1(Interface1 inter)
    {
        inter.m1();
    }
    public void interface2(Interface2 inter)
    {
        inter.m3();
    }
    public void interface3(Interface3 inter)
    {
        inter.m5();
    }
    public void combined(CombineInterface inter)
    {
        inter.m7();
    }
}
