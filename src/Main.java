public class Main {
    public static void main(String[] args) {
        int age =25;
        boolean detsciySad = age <= 6 && age >= 2;
        boolean school = age <= 18 && age >= 7;
        boolean univer= age>18 && age <=24;
        if (detsciySad) {
            System.out.println("Ребенку нужно ходить в школу ");
        }else if (school) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }else if (univer) {
            System.out.println("Пора в университет");
        } else {
            System.out.println("Человк окончил университет и ему пора искать первую работу");


        }

    }
}
