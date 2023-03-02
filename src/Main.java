public class Main {

    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри","Поттер",6,5,57,45,67);
        Gryffindor granger = new Gryffindor("Гермиона","Грейнджер",5,6,45,64,42);
        Gryffindor weasley = new Gryffindor("Рон","Уизли",5,4,55,78,32);
        Slytherin malfoy = new Slytherin("Драко","Малфой",5,5,33,45,67,87,21);
        Slytherin montague = new Slytherin("Грэхэм","Монтегю",4,5,44,67,89,45,37);
        Slytherin goyle = new Slytherin("Грегори","Гойл",3,3,12,26,65,49,68);
        Hufflepuff smith = new Hufflepuff("Захария","Смит",4,4,89,56,67);
        Hufflepuff diggory = new Hufflepuff("Седрик","Диггори",4,3,78,49,50);
        Hufflepuff finchFletchley = new Hufflepuff("Джастин","Финч-Флетчли",2,3,39,60,99);
        Ravenclaw chang = new Ravenclaw("Чжоу","Чанг",4,6,67,45,69,80);
        Ravenclaw patil = new Ravenclaw("Падма","Патил",3,5,38,27,55,88);
        Ravenclaw belby = new Ravenclaw("Маркус","Белби",3,5,33,87,76,59);

        potter.printStudent();
        montague.printStudent();
        finchFletchley.ptintStudent();
        chang.printStudent();
        potter.printGryffindorComparison(granger);
        malfoy.printSlytherinComparison(goyle);
        diggory.printHufflepuffComparison(smith);
        patil.printRavenclawComparison(belby);
        weasley.printStudentComparison(chang);


    }
}