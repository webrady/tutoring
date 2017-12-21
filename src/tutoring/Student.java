package tutoring;

public class Student extends Human {

    protected String major;
    protected double gpa;

    public Student() {
        super();
        greeting = "Hello, I am a student";
        major = "Liberal Arts";
        gpa = 0.0;
    }

    //Students are smart thus are stronger than a basic human
    @Override
    public int getPower() {
        return this.age + 3;
    }

    //SETTERS AND GETTERS
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
