package Assignment7.RodentExample;

public class Main {
    public static void main(String[] args) {
        Rodent rodents[]=new Rodent[2];

        rodents[0]=new Mouse();
        rodents[0].Classfication();
        rodents[0].eat();
        rodents[0].jump();
        rodents[1]=new Gerbil();
        rodents[1].Classfication();
        rodents[1].eat();
        rodents[1].jump();

    }
}
