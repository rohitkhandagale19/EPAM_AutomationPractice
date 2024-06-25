package DP_StrategyPattern;

public class EmailSharing implements PhotoSharing {
    @Override
    public void sharePhoto(byte[] photo) {
        // Implement email sharing logic
        System.out.println("EmailSharing method");
    }
}
