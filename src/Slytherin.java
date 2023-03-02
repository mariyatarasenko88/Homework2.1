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

    public void printStudent() {
        System.out.println("Имя " + getStudentName() + " " + getStudentSurname() +
                " хитрость " + trick + " решительность " + determination +
                " амбициозность " + ambition + " находчивость " + resourcefulness +
                " жажда власти " + powerLust);
    }
    public int calculateSumPoint() {
        return trick + determination + ambition + resourcefulness + powerLust;
    }
    public void printSlytherinComparison(Slytherin faculty) {
        int pointsStudent1 = this.calculateSumPoint();
        int pointsStudent2 = faculty.calculateSumPoint();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getStudentName() + " " + this.getStudentSurname() +
                    " лучше Слизеринец, чем " + faculty.getStudentName() + " " + faculty.getStudentSurname());
        } else {
            System.out.println(faculty.getStudentName() + " " + faculty.getStudentSurname() +
                    " лучше Слизеринец, чем " + this.getStudentName() + " " + this.getStudentSurname());
        }
    }
}
