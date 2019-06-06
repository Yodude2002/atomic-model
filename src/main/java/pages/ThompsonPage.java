package pages;

import engine.Main;
import processing.event.MouseEvent;

public class ThompsonPage implements Page {
    @Override
    public void draw(Main main) {
        main.background(0xff000000);
        main.fill(0xffffffff);
        main.text("Thompson",10,10);
    }

    @Override
    public void onMouseEvent(Main main) {
        main.setPage(0);
    }

    @Override
    public void onKeyPress(Main main) {

    }

    @Override
    public void onMouseWheel(MouseEvent event, Main main) {

    }
}
