public class PrintService {
    public static void print(Gryffindor[] gryffindor) {
        Gryffindor gryffindor1 = gryffindor[1];
        System.out.println("Студент " + gryffindor1.getStudentName() + " " + gryffindor1.getStudentSurname() +
                " Качества студента: " + " сила магии " + gryffindor1.getMagicPower() + " трансгрессия " + gryffindor1.getTransgression() + " честь " + gryffindor1.getHonor() + " храбрость " + gryffindor1.getBravery() + " благородство " + gryffindor1.getNobility());
    }

    public static void printBesteGryffindor(Gryffindor[] gryffindor) {
        int sum = 0;
        Gryffindor gryffindor1 = gryffindor[0];
        sum = gryffindor1.getBravery() + gryffindor1.getHonor() + gryffindor1.getNobility();
        int sum2 = 0;
        Gryffindor gryffindor2 = gryffindor[1];
        sum2 = gryffindor2.getBravery() + gryffindor2.getHonor() + gryffindor2.getNobility();
        int sum3 = 0;
        Gryffindor gryffindor3 = gryffindor[2];
        sum3 = gryffindor3.getBravery() + gryffindor3.getNobility() + gryffindor3.getHonor();
        if (sum > sum2) {
            System.out.println("Гарри Поттер лучше Гриффиндорец, чем Гермиона Грейнджер");
        } else {
            System.out.println("Гермиона Грейнджер лучше Гриффиндоренц, чем Гарри Поттер");
        }
        if (sum > sum3) {
            System.out.println("Гарри Поттер лучше Гриффиндорец, чем Рон Уизли");
        } else {
            System.out.println("Рон Уизли лучше Гриффиндорец, чем Гарри Поттер");
        }
        if (sum2 > sum3) {
            System.out.println("Гермиона Грейнджер лучше Гриффиндорец, чем Рон Уизли");
        } else {
            System.out.println("Рон Уизли лучше Гриффиндорец, чем Гермиона Грейнджер");
        }
    }

    public static void printBesteSlytherin(Slytherin[] slytherin) {
        int sum = 0;
        Slytherin slytherin1 = slytherin[0];
        sum = slytherin1.getAmbition() + slytherin1.getTrick() + slytherin1.getDetermination() + slytherin1.getResourcefulness() + slytherin1.getPowerLust();
        int sum2 = 0;
        Slytherin slytherin2 = slytherin[1];
        sum2 = slytherin2.getAmbition() + slytherin2.getTrick() + slytherin2.getDetermination() + slytherin2.getResourcefulness() + slytherin2.getPowerLust();
        int sum3 = 0;
        Slytherin slytherin3 = slytherin[2];
        sum3 = slytherin3.getAmbition() + slytherin3.getTrick() + slytherin3.getDetermination() + slytherin3.getResourcefulness() + slytherin3.getPowerLust();
        if (sum > sum2) {
            System.out.println("Драко Малфой лучше Слизеринец, чем Грэхэм Монтегю");
        } else {
            System.out.println("Грэхем Монтегю лучше Слизеринец, чем Драко Малфой");
        }
        if (sum > sum3) {
            System.out.println("Драко Малфой лучше Слизеринец, чем Грегори Гойл");
        } else {
            System.out.println("Грегори Гойл лучше Слизеринец, чем Драко Малфой");
        }
        if (sum2 > sum3) {
            System.out.println("Грэхэм Монтегю лучше Слизеринец, чем Грегори Гойл");
        } else {
            System.out.println("Грегори Гойл лучше Слизеринец, чем Грэхэм Монтегю");
        }
    }

    public static void printBesteHufflepuff(Hufflepuff[] hufflepuff) {
        int sum = 0;
        Hufflepuff hufflepuff1 = hufflepuff[0];
        sum = hufflepuff1.getDiligence() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int sum2 = 0;
        Hufflepuff hufflepuff2 = hufflepuff[1];
        sum2 = hufflepuff2.getDiligence() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        int sum3 = 0;
        Hufflepuff hufflepuff3 = hufflepuff[2];
        sum3 = hufflepuff3.getDiligence() + hufflepuff3.getLoyalty() + hufflepuff3.getHonesty();
        if (sum > sum2) {
            System.out.println("Захария Смит лучше Пуффендуец, чем Седрик Диггори");
        } else {
            System.out.println("Седрик Диггори лучше Пуффендуец, чем Захария Смит");
        }
        if (sum > sum3) {
            System.out.println("Захария Смит лучше Пуффендуец, чем Джастин Финч-Флетчли");
        } else {
            System.out.println("Джастин Финч-Флетчли лучше Пуффендуец, чем Захария Смит");
        }
        if (sum2 > sum3) {
            System.out.println("Седрик Диггори лучше Пуффендуец, чем Джастин Финч-Флетчли");
        } else {
            System.out.println("Джастин Финч-Флетчли лучше Пуффендуец, чем Седрик Диггори");
        }
    }

    public static void printBesteRavenclaw(Ravenclaw[] ravenclaw) {
        int sum = 0;
        Ravenclaw ravenclaw1 = ravenclaw[0];
        sum = ravenclaw1.getIntellect() + ravenclaw1.getWisdom() + ravenclaw1.getWit() + ravenclaw1.getCreativity();
        int sum2 = 0;
        Ravenclaw ravenclaw2 = ravenclaw[1];
        sum2 = ravenclaw2.getIntellect() + ravenclaw2.getWisdom() + ravenclaw2.getWit() + ravenclaw2.getCreativity();
        int sum3 = 0;
        Ravenclaw ravenclaw3 = ravenclaw[2];
        sum3 = ravenclaw3.getIntellect() + ravenclaw3.getWisdom() + ravenclaw3.getWit() + ravenclaw3.getCreativity();
        if (sum > sum2) {
            System.out.println("Чжоу Чанг лучше Когтевранец, чем Падма Патил");
        } else {
            System.out.println("Падма Патил лучше Когтевранец, чем Чжоу Чанг");
        }
        if (sum > sum3) {
            System.out.println("Чжоу Чанг лучше Когтевранец, чем Маркус Белби");
        } else {
            System.out.println("Маркус Белби лучше Когтевранец, чем Чжоу Чанг");
        }
        if (sum2 > sum3) {
            System.out.println("Падма Патил лучше Когтевранец, чем Маркус Белби");
        } else {
            System.out.println("Маркус Белби лучше Когтевранец, чем Падма Патил");
        }
    }

    public static void printBesteInSchool(Hogwarts[] hogwarts) {
        int magic = 0;
        int transgression = 0;
        Hogwarts hogwarts1 = hogwarts[4];
        magic = hogwarts1.getMagicPower();
        transgression = hogwarts1.getTransgression();
        int magic2 = 0;
        int transgression2 = 0;
        Hogwarts hogwarts2 = hogwarts[0];
        magic2 = hogwarts2.getMagicPower();
        transgression2 = hogwarts2.getTransgression();
        if (magic > magic2) {
            System.out.println(hogwarts1.getStudentName() + " " + hogwarts1.getStudentSurname() +
                    " обладает большей силой магии, чем " + hogwarts2.getStudentName() +
                    " " + hogwarts2.getStudentSurname());
        } else {
            System.out.println(hogwarts2.getStudentName() + " " + hogwarts2.getStudentSurname() +
                    " обладает большей силой магии, чем " + hogwarts1.getStudentName() +
                    " " + hogwarts1.getStudentSurname());
        }
        if (transgression > transgression2) {
            System.out.println(hogwarts1.getStudentName() + " " + hogwarts1.getStudentSurname() +
                    " обладает большей трансгрессией, чем " + hogwarts2.getStudentName() +
                    " " + hogwarts2.getStudentSurname());
        } else {
            System.out.println(hogwarts2.getStudentName() + " " + hogwarts2.getStudentSurname() +
                    " обладает большей трансгрессией, чем " + hogwarts1.getStudentName() +
                    " " + hogwarts1.getStudentSurname());
        }
    }
}


