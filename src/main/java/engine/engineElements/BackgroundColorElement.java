package engine.engineElements;

import engine.Main;
import engine.engineElements.UIElement;

public class BackgroundColorElement implements UIElement
{
    private int color;
    private int width;
    private int height;
    public BackgroundColorElement(int color)
    {
        this.color = color;
        width = -1;
        height = -1;
    }
    public void draw(Main app)
    {
        app.background(color);
        if(width < 0 || height < 0)
        {
            width = app.width;
            height = app.height;
        }
    }
    public void click(Main app) { }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public int getX()
    {
        return 0;
    }
    public int getY()
    {
        return 0;
    }
}