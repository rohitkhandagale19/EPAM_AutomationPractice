package DP_DecoratorPattern;

public class MobilePage implements Page {
    private int rank;

    public MobilePage(int rank) {
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return rank;
    }
}
