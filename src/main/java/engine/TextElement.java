package engine;

import processing.core.PApplet;
import processing.core.PConstants;

public class TextElement implements UIElement
{
    private String text;
    private int textColor;
    private int x;
    private int y;
    private float width;
    public TextElement(String text, int textColor, int x, int y)
    {
        this.text = text;
        this.x = x;
        this.y = y;
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