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

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    public Main() {
        pages = new Page[pageClasses.length];
        try {
            for (int i = 0; i < pageClasses.length; i++) {
                pages[i] = ((Page) pageClasses[i].getConstructor().newInstance());
            }
        }catch (NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    @Override
    public void settings() {
        setSize(1280,720);
        theMain = this;
    }
}
