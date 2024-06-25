package DP_DecoratorPattern;

public class WidgetB extends WidgetDecorator {
    private int widgetRank;

    public WidgetB(Page page, int widgetRank) {
        super(page);
        this.widgetRank = widgetRank;
    }

    @Override
    public int getRank() {
        return super.getRank() + widgetRank;
    }
}
