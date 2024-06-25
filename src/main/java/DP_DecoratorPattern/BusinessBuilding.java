package DP_DecoratorPattern;

public class BusinessBuilding {
    public static void main(String[] args) {
        Page mobilePage = new MobilePage(10); // Initial rank for mobile page
        Page desktopPage = new DesktopPage(15); // Initial rank for desktop page

        // Adding widgets to the mobile page
        mobilePage = new WidgetA(mobilePage, 5); // Adds a widget with rank 5
        mobilePage = new WidgetB(mobilePage, 10); // Adds another widget with rank 10

        // Adding widgets to the desktop page
        desktopPage = new WidgetA(desktopPage, 8); // Adds a widget with rank 8

        System.out.println("Mobile Page Rank: " + mobilePage.getRank());
        System.out.println("Desktop Page Rank: " + desktopPage.getRank());
    }
}
