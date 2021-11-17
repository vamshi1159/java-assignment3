package Assignment7.CycleExample;

public class Main {
    public static void main(String[] args) {

        BiCycle bicycleObj = new BiCycle();
        UniCycle unicycleObj = new UniCycle();
        TriCycle tricycleObj = new  TriCycle();

        Cycle[] objects = new Cycle[3];
        objects[0] = (Cycle)bicycleObj; // upcasting
        objects[1] = (Cycle)unicycleObj;
        objects[2] = (Cycle)tricycleObj;

/*       for(Cycle obj : objects){
             obj.balance();  it results to compilation error because balance method is not present in base class
          }
 */


        ((BiCycle) objects[0]).balance(); // it works
        ((UniCycle) objects[1]).balance(); // it works

//        ((Tricycle) objects[2]).balance(); // compilation error because Tricycle didn't have balance method


    }
}