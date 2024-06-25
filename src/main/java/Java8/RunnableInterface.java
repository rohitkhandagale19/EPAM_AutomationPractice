package Java8;

public class RunnableInterface {

    public static void main(String[] args) {
        Runnable printNumbers = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        };

        Thread thread = new Thread(printNumbers);
        thread.start();
    }
}
