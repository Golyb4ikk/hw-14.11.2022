public class Main {
    public static void main(String[] args) {
        int one=1;
        int two=2;
        int three=3;
        if(one>two) {
            if (one > three) {
                System.out.println("one");
            }
        }else if (two>three) {
            System.out.println("two");
        }else{
            System.out.println("three");
        }

    }
}