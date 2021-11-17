package Assignment7.RodentExample;

public class Mouse extends  Rodent{

    @Override
    public void eat() {
        System.out.println("mouse eats");
    }

    @Override
    public void jump() {
        System.out.println("mouse jumps");
    }
}
