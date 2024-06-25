package Java8;

public class RunnableInterfaceLambda {

    public static void main(String[] args) {
        Runnable printNumbers = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(printNumbers);
        thread.start();
    }
}

