public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, String studentSurname, int magicPower, int transgression, int diligence, int loyalty, int honesty){
        super(studentName, studentSurname, magicPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void ptintStudent() {
        System.out.println("Имя " + getStudentName() + " " + getStudentName() +
                " трудолюбие " + diligence + " верность " + loyalty + " честность " + honesty);
    }
    public int calculateSumPoint() {
        return diligence + loyalty + honesty;
    }
    public void printHufflepuffComparison(Hufflepuff faculty) {
        int pointsStudent1 = this.calculateSumPoint();
        int pointsStudent2 = faculty.calculateSumPoint();
        if (pointsStudent1 > pointsStudent2) {
            System.out.println(this.getStudentName() + " " + this.getStudentSurname() +
                    " лучше Пуффендуец, чем " + faculty.getStudentName() + " " + faculty.getStudentSurname());
        } else {
            System.out.println(faculty.getStudentName() + " " + faculty.getStudentSurname() +
                    " лучше Пуффендуец, чем " + this.getStudentName() + " " + this.getStudentSurname());
        }
    }
}
