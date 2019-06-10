package engine.engineElements;

import engine.Main;
import processing.core.PApplet;
import processing.core.PConstants;

public class TimelineNode implements UIElement {

    private int page;
    private String name;
    private String description;
    private int x;
    private int y, yi, mdy;
    private int width;
    private int height;

    public TimelineNode(String name, int x, int y, int width, int height, int mdy, int page){
        this.name = name;
        this.x = x;
        this.y = y;
        this.yi = y;
        this.mdy = mdy;
        this.width = width;
        this.height = height;
        this.page = page;
    }

    public void setDescription(String str){
        description = str;
    }

    public void scroll(int yChange){
        if(yChange > 0) {
            y = Math.min(yi, y + yChange);
        }else {
            y = Math.max(yi-mdy, y + yChange);
        }
    }

    public void draw(Main p){
        float r = Math.min(width,height)/4;
        p.fill(0xffffffff);
        p.rect(x,y,width,height,r);
        p.fill(0x00000000);
        p.textSize(20);
        p.textAlign(PConstants.LEFT, PConstants.BASELINE);
        p.text(name,x+r,y + 25);
    }

    public void click(Main p) {
        p.setPage(page);
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
