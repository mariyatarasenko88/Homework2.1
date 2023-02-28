public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String studentName, String studentSurname, int magicPower, int transgression, int trick, int determination, int ambition, int resourcefulness, int powerLust){
        super(studentName, studentSurname, magicPower, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }
}
