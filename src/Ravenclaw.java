public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String studentName, String studentSurname, int magicPower, int transgression, int intellect, int wisdom, int wit, int creativity) {
        super(studentName, studentSurname, magicPower, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void printStudent() {
        System.out.println("Имя " + getStudentName() + " " + getStudentSurname() +
                " ум " + intellect + " остроумие " + wit + " мудрость " + wisdom + " творчество " + creativity);
    }

    public int calculateSumPoint() {
        return intellect + wit + wisdom + creativity;
    }

    public void printRavenclawComparison(Ravenclaw faculty) {
        int pointsStudent1 = this.calculateSumPoint();
        int pointsStudent2 = faculty.calculateSumPoint();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getStudentName() + " " + this.getStudentSurname() +
                    " лучше Когтевранец, чем " + faculty.getStudentName() + " " + faculty.getStudentSurname());
        } else {
            System.out.println(faculty.getStudentName() + " " + faculty.getStudentSurname() +
                    " лучше Когтевранец, чем " + this.getStudentName() + " " + this.getStudentSurname());
        }
    }
}
