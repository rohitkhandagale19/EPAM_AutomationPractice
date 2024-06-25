package DP_DecoratorPattern;

public class DesktopPage implements Page {
    private int rank;

    public DesktopPage(int rank) {
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return rank;
    }
}
