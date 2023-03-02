public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String studentName, String studentSurname, int magicPower, int transgression, int nobility, int honor, int bravery){
        super(studentName, studentSurname, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void printStudent() {
        System.out.println("Имя " + getStudentName() + " " + getStudentSurname() +
                " благородство " + getNobility() + " храбрость " + getBravery() +
                " честь " + getHonor());
    }
public int calculateSumPoint() {
    return nobility + honor + bravery;
    }
    public void printGryffindorComparison(Gryffindor faculty) {
        int pointsStudent1 = this.calculateSumPoint();
        int pointsStudent2 = faculty.calculateSumPoint();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getStudentName() + " " + this.getStudentSurname() +
                    " лучше Гриффиндорец, чем " + faculty.getStudentName() + " " + faculty.getStudentSurname());
        } else {
            System.out.println(faculty.getStudentName() + " " + faculty.getStudentSurname() +
                    " лучше Гриффиндорец, чем " + this.getStudentName() + " " + this.getStudentSurname());
        }
    }

}
