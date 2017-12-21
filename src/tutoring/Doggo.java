package tutoring;

public class Doggo implements Organism {

    protected int weight;
    protected boolean alive;

    public Doggo() {
        weight = 0;
        alive = true;
    }

    @Override
    public String getGreeting() {
        return "BARK BARK";
    }

    @Override
    public int getPower() {
        return this.weight / 5;
    }

    @Override
    public void kill() {
        alive = false;
    }

    @Override
    public void attack(Organism o) {
        if (this.getPower() > o.getPower()) {
            o.kill();
        } else {
            this.kill();
        }
    }

    //GETTERS AND SETTERS
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
