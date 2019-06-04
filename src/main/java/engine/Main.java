package engine;

import pages.*;
import processing.core.PApplet;

import java.lang.reflect.InvocationTargetException;

public class Main extends PApplet {

    private static Main theMain;
    public static Main getTheMain() {
        return theMain;
    }

    private static final Class<?>[] pageClasses = {
            MainMenu.class
    };

    private final Page[] pages;
    private int activePage = 0;

    public void setPage(int page) {
        if(page > -1 && page < pages.length)
            activePage = page;
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    public Main() {
        theMain = this;
        pages = new Page[pageClasses.length];
        try {
            for (int i = 0; i < pageClasses.length; i++) {
                pages[i] = ((Page) pageClasses[i].getConstructor().newInstance());
            }
        }catch (NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            exit();
        }
    }

    @Override
    public void settings() {
        setSize(1280,720);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        pages[activePage].draw(this);
    }

    @Override
    public void mouseClicked() {
        pages[activePage].onMouseEvent(this);
    }

    @Override
    public void keyPressed() {
        pages[activePage].onKeyPress(this);
    }
}
