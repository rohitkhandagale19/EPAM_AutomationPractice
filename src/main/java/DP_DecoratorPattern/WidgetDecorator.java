package DP_DecoratorPattern;

public abstract class WidgetDecorator implements Page {
    protected Page decoratedPage;

    public WidgetDecorator(Page page) {
        this.decoratedPage = page;
    }

    @Override
    public int getRank() {
        return decoratedPage.getRank();
    }
}
