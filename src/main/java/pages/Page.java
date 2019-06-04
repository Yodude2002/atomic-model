package pages;

import engine.Main;

public interface Page {

    void draw(Main main);

    void onMouseEvent(Main main);

    void onKeyPress(Main main);
}
