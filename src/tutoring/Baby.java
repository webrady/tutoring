package tutoring;

public class Baby extends Human {

    protected boolean canWalk;
    protected boolean canRead;

    public Baby() {
        super();
        greeting = "GOO GOO GAH GAH";
        canWalk = false;
        canRead = false;
    }

    @Override
    public int getPower() {
        if (!canWalk || !canRead) {
            return age - 2; //Baby lacks knowledge making it weak
        } else if (canWalk && canRead) {
            return age; //Baby can function as a human thus it should be as powerful
        } else {
            return age - 1; //Baby can do one or the other so not as weak
        }

    }

    //GETTERS AND SETTERS
    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }
}
