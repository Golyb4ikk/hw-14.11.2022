public class Main {
    public static void main(String[] args) {
        int age=24;
        if (age>=7&&age<18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (age>=18&&age<24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        else {
            System.out.println("Человк окончил университет и ему пора искать первую работу!");
        }
    }
}