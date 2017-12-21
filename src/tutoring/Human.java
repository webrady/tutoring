package tutoring;

public abstract class Human implements Organism {

    protected String greeting;
    protected String name;
    protected int age;
    protected boolean alive;

    public Human() {
        greeting = "Hello";
        name = "";
        age = 0;
        alive = true;
    }

    @Override
    public String getGreeting() {
        return this.greeting;
    }

    @Override
    public int getPower() {
        return age;
    }

    @Override
    public void kill() {
        this.alive = false;
    }

    @Override
    public void attack(Organism o) {
        if (this.getPower() > o.getPower()) {
            o.kill();
        } else {
            this.kill();
        }
    }

    //SETTERS AND GETTERS
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
