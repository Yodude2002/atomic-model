package engine.engineElements;

import engine.Main;
import processing.core.PConstants;

public class TextElementScrollable extends TextElement implements UIElementScrollable {

    private int y;
    private int maxScroll;
    private int textColor;
    private String text;

    public TextElementScrollable(String text, int color, int x, int y, int maxScroll) {
        super(text,color,x,y);
        this.text = text;
        this.y = y;
        this.textColor = color;
        this.maxScroll = maxScroll;
    }

    @Override
    public void scroll(int amount) {
        if(amount > 0) {
            y = Math.min(super.getY(), y + amount);
        }else {
            y = Math.max(super.getY()-maxScroll, y + amount);
        }
    }

    @Override
    public void draw(Main app) {
        app.fill(textColor);
        app.textAlign(PConstants.LEFT, PConstants.TOP);
        app.text(text, getX(), y);
    }

    @Override
    public int getY() {
        return y;
    }
}
