public class Main {
    public static void main(String[] args) {
        int passenger = 102;
        if (passenger >= 103) {
            System.out.println("Вагон полностью забит");
        } else if (passenger < 60) {
            System.out.println("Есть сидячее место");
        } else {
            System.out.println("Есть стоячее место");
        }
    }
}