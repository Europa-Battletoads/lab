package animals;

public abstract class Otter extends Mammal implements Aquatic {

    public Otter(char inputGender, int inputNumberOfAppendages) {
        super(inputGender, inputNumberOfAppendages, "River", "Omnivore");
    }

    public void eat() {
        System.out.println("Generic otter is eating nomnomnom");
    }

    public void swim() {
        System.out.println("Generic otter is swimming.");
    }
}
