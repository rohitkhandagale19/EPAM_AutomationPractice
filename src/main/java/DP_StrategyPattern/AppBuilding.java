package DP_StrategyPattern;

public class AppBuilding {
    public static void main(String[] args) {
        PhoneCameraApp basicApp = new BasicCameraApp();

        // Set the initial sharing strategy (e.g., via text)
        basicApp.setSharingStrategy(new TextSharing());

        // User interaction example: share a photo
        byte[] photo = loadPhotoFromFile("path/to/photo.jpg");
        basicApp.sharePhoto(photo);

        // Later, if we want to change to sharing via email
        basicApp.setSharingStrategy(new EmailSharing());
        basicApp.sharePhoto(photo);

        // If a new social media sharing method emerges
        basicApp.setSharingStrategy(new SocialMediaSharing());
        basicApp.sharePhoto(photo);
    }

    private static byte[] loadPhotoFromFile(String s) {
        return new byte[0];
    }
}
