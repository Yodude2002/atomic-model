package engine.engineElements;

import engine.Main;
import engine.engineElements.UIElement;
import pages.Page;
import processing.core.PConstants;

public class TextElement implements UIElement
{
    private String text;
    private int textColor;
    private int x;
    private int y;
    private int originalY;
    private float width;
    private boolean scrollable;
    public TextElement(String text, int textColor, int x, int y, boolean scrollable)
    {
        this.scrollable = scrollable;
        this.text = text;
        this.x = x;
        this.y = y;
        originalY = y;
        this.textColor = textColor;
        width = -1;
    }
    public void draw(Main app)
    {
        app.fill(textColor);
        app.textAlign(PConstants.LEFT, PConstants.TOP);
        app.text(text, x, y);
        if(width < 0)
        {
            width = app.textWidth(this.text);
        }
    }
    public void click(Main app)
    {
        //no
    }
    public void scroll(int amount, Page page) {
        if(!scrollable) return;
        y += amount;
        if(y < originalY - page.getScrollLimit())
        {
            y = originalY - page.getScrollLimit();
        }
        else if(y > originalY)
        {
            y = originalY;
        }
    }
    public int getWidth()
    {
        return (int)width;
    }
    public int getHeight()
    {
        return 0; //finding text height is too complicated for me to do right now from what I've found
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}