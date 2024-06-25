package DP_DecoratorPattern;

public class WidgetA extends WidgetDecorator {
    private int widgetRank;

    public WidgetA(Page page, int widgetRank) {
        super(page);
        this.widgetRank = widgetRank;
    }

    @Override
    public int getRank() {
        return super.getRank() + widgetRank;
    }
}
