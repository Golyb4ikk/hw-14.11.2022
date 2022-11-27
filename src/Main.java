public class Main {
    public static void main(String[] args) {
        int passenger=59;
        if (passenger>=103) {
            System.out.println("Вагон полностью забит");
        }
        if (passenger<60) {
            System.out.println("Есть сидячее место");
        }
        if (passenger>60&&passenger<=102) {
            System.out.println("Есть стоячее место");
        }
        }
}