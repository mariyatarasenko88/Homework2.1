public class Main {

    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри","Поттер", 6,5),
                new Hogwarts("Драко","Малфой",5,5),
                new Hogwarts("Захария","Смит",4,4),
                new Hogwarts("Чжоу","Чанг",4,6),
                new Hogwarts("Гермиона","Грейнджер",5,6),
                new Hogwarts("Грэхэм","Монтегю",4,5),
                new Hogwarts("Рон","Уизли",5,4),
                new Hogwarts("Седрик","Диггори",4,3),
                new Hogwarts("Грегори","Гойл",3,3),
                new Hogwarts("Маркус","Белби",3,5),
                new Hogwarts("Джастин","Финч-Флетчли",2,3),
                new Hogwarts("Падма","Патил",3,5)
        };
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри", "Поттер", 6, 5, 57, 45, 67),
                new Gryffindor("Гермиона", "Грейнджер", 5, 6, 45, 64, 42),
                new Gryffindor("Рон", "Уизли", 5, 4, 55, 78, 32),
        };

        Slytherin[] slytherin = {
                new Slytherin("Драко", "Малфой", 5, 5, 33, 45, 67, 87, 21),
                new Slytherin("Грэхэм", "Монтегю", 4, 5, 44, 67, 89, 45, 37),
                new Slytherin("Грегори", "Гойл", 3, 3, 12, 26, 65, 49, 68),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария", "Смит", 4, 4, 89, 56, 67),
                new Hufflepuff("Седрик", "Диггори", 4, 3, 78, 49, 50),
                new Hufflepuff("Джастин", "Финч-Флетчли", 2, 3, 39, 60, 99),
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу", "Чанг", 4, 6, 67, 45, 69, 80),
                new Ravenclaw("Падма", "Патил", 3, 5, 38, 27, 55, 88),
                new Ravenclaw("Маркус", "Белби", 3, 5, 33, 87, 76, 59),
        };
        PrintService printService = new PrintService();
        PrintService.print(gryffindor);
        System.out.println();
        PrintService.printBesteGryffindor(gryffindor);
        System.out.println();
        PrintService.printBesteSlytherin(slytherin);
        System.out.println();
        PrintService.printBesteHufflepuff(hufflepuff);
        System.out.println();
        PrintService.printBesteRavenclaw(ravenclaw);
        System.out.println();
        PrintService.printBesteInSchool(hogwarts);



    }
}