package DP_StrategyPattern;

public class PhoneCameraApp {
    private PhotoSharing sharingStrategy;

    // Method to set the sharing strategy dynamically
    public void setSharingStrategy(PhotoSharing sharingStrategy) {
        this.sharingStrategy = sharingStrategy;
    }

    // Method to share a photo
    public void sharePhoto(byte[] photo) {
        sharingStrategy.sharePhoto(photo);
    }

}
