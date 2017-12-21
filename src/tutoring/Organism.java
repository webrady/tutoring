package tutoring;

public interface Organism {

    //NOTE: This would be better as an abstract class but for example's sake its an interface

    public String getGreeting();

    public int getPower();

    public void kill();

    public void attack(Organism o);
}
