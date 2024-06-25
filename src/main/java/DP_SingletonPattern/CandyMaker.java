package DP_SingletonPattern;

public class CandyMaker {
    private boolean empty;
    private boolean boiled;
    private static volatile CandyMaker instance; // volatile to ensure visibility of changes to variables across threads

    // Private constructor prevents instantiation from other classes
    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    // Double-checked locking for thread-safe singleton instance retrieval
    public static CandyMaker getInstance() {
        if (instance == null) {
            synchronized (CandyMaker.class) {
                if (instance == null) {
                    instance = new CandyMaker();
                }
            }
        }
        return instance;
    }

    // To fill the boiler it must be empty, and once it's full, we set the empty and boiled flags
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the candyMaker with milk and chocolate mix
        }
    }

    // To drain the boiler, it must be full (non-empty) and also boiled. Once it is drained, we set the empty back to true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    // To boil the mixture the boiler has to be full and not already boiled. Once it's boiled, we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

