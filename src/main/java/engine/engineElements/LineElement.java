package engine.engineElements;

import engine.Main;
import pages.Page;

public class LineElement implements UIElement {

    private int x, y;
    private int w, h;
    private int originalY;

    public LineElement(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
        originalY = y;
    }

    @Override
    public void draw(Main app) {
        app.stroke(0xffffffff);
        app.line(x,y,x+w,y+h);
    }

    @Override
    public void click(Main app) {

    }
    public void scroll(int amount, Page page) {
        if(amount > 0) {
            y = Math.min(originalY, y + amount);
        }else {
            y = Math.max(originalY-page.getScrollLimit(), y + amount);
        }
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return w;
    }

    @Override
    public int getHeight() {
        return h;
    }
}
