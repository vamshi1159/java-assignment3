package Assignment7.CycleFactory;

public class TriCycleFactory extends CycleFactory{
    @Override
    Cycle getCycle() {
        return new TriCycle();
    }
}
