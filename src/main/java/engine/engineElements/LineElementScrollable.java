package engine.engineElements;

import engine.Main;

public class LineElementScrollable extends LineElement implements UIElementScrollable {

    private int y;
    private int maxScroll;

    public LineElementScrollable(int x, int y, int w, int h,int maxScroll) {
        super(x,y,w,h);
        this.y = y;
        this.maxScroll = maxScroll;
    }

    @Override
    public void draw(Main app) {
        app.stroke(0xffffffff);
        app.line(getX(),y,getX()+getWidth(),y+getHeight());
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
    public int getY() {
        return y;
    }
}
