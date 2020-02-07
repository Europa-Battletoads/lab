package animals;

public abstract class Otter extends Mammal implements Aquatic {

    public Otter(char inputGender, int inputNumberOfAppendages) {
        super(inputGender, inputNumberOfAppendages, "River", "Omnivore");
    }

    public void eat() {
        System.out.println("The otter is eating nomnomnom");
    }
}
