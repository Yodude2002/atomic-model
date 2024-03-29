package engine;

import pages.*;
import processing.core.PApplet;
import processing.event.MouseEvent;

import java.lang.reflect.InvocationTargetException;

public class Main extends PApplet {
    private static final Class<?>[] pageClasses = {
            MainMenu.class,
            IntroPage.class,
            ConclusionPage.class,
            ThompsonPage.class,
            MillikanPage.class,
            RutherfordPage.class,
            BohrPage.class,
            HeisenbergPage.class,
            ShrodingerPage.class,
            ChadwickPage.class
    };

    private Page[] pages;
    private int activePage = 0;

    public static final int DEFAULT_TEXT_SIZE = 20;

    public void setPage(int page) {
        if(page > -1 && page < pages.length)
            activePage = page;
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    @Override
    public void settings() {
        setSize(1280,720);
        fullScreen();
    }

    @Override
    public void setup() {
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

    @Override
    public void mouseWheel(MouseEvent event) {
         pages[activePage].onMouseWheel(event, this);
    }
}
