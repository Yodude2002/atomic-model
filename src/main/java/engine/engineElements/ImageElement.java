package engine.engineElements;

import engine.Main;
import pages.Page;
import processing.core.PImage;

public class ImageElement implements UIElement
{
    private PImage image;
    private int x;
    private int y;
    private int originalY;
    private int width;
    private int height;
    private float scale;
    private String filename;
    private Object caller;
    public ImageElement(String filename, Object caller)
    {
        image = null;
        this.filename = filename;
        this.x = 0;
        this.y = 0;
        this.width = -1;
        this.height = -1;
        originalY = y;
        scale = 1;
        this.caller = caller;
    }
    public ImageElement(String filename, int x, int y, Object caller)
    {
        this(filename, caller);
        this.x = x;
        this.y = y;
    }
    public ImageElement(String filename, int x, int y, int width, int height, Object caller)
    {
        this(filename, x, y, caller);
        this.width = width;
        this.height = height;
    }
    public ImageElement(String filename, int x, int y, float scale, Object caller)
    {
        this(filename, caller);
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
    @Override
    public void draw(Main app)
    {
        if(image == null)
        {
            image = app.loadImage(caller.getClass().getResource(filename).getPath());
            if(width < 0 || height < 0)
            {
                width = (int)(image.width * scale);
                height = (int)(image.height * scale);
            }
        }
        if(image != null)
        {
            app.image(image, x, y, width, height);
        }
    }
    public void scroll(int amount, Page page)
    {
        if(true) return; //will change later
        y += amount;
        if(y < originalY)
        {
            y = originalY;
        }
        else if(y > originalY + page.getScrollLimit())
        {
            y = originalY + page.getScrollLimit();
        }
    }
    @Override
    public void click(Main app)
    {

    }

    @Override
    public int getX()
    {
        return x;
    }

    @Override
    public int getY()
    {
        return y;
    }

    @Override
    public int getWidth()
    {
        return width;
    }

    @Override
    public int getHeight()
    {
        return height;
    }
}
