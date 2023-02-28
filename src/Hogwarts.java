public class Hogwarts {
    private String studentName;
    private String studentSurname;
    private int magicPower;
    private int transgression;

    public Hogwarts(String studentName, String studentSurname, int magicPower, int transgression){
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
