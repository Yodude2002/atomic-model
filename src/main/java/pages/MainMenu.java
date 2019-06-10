package pages;

import engine.Main;
import engine.engineElements.*;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class MainMenu extends Page {

    private static final int SCROLL_LIMIT = 300;

    public MainMenu(){
        super(0xff000000);
        uiManager.addElement(new TimelineNode("Intro",540,270,200,30, SCROLL_LIMIT,1));
        uiManager.addElement(new TimelineNode("Thompson",670,335,200,30,SCROLL_LIMIT,3));
        uiManager.addElement(new TimelineNode("Millikan",410,435,200,30, SCROLL_LIMIT,4));
        uiManager.addElement(new TimelineNode("Rutherford",670,535,200,30,SCROLL_LIMIT,5));
        uiManager.addElement(new TimelineNode("Bohr",410,635,200,30, SCROLL_LIMIT,6));
        uiManager.addElement(new TimelineNode("Chadwick",670,735,200,30,SCROLL_LIMIT,7));
        uiManager.addElement(new TimelineNode("Shrödinger",410,835,200,30, SCROLL_LIMIT,8));
        uiManager.addElement(new TimelineNode("Conclusion",540,950,200,30,SCROLL_LIMIT,2));
        uiManager.addElement(new LineElementScrollable(640,300,0,650,SCROLL_LIMIT));
        uiManager.addElement(new LineElementScrollable(640,350,30,0,SCROLL_LIMIT));
        uiManager.addElement(new LineElementScrollable(610,450,30,0,SCROLL_LIMIT));
        uiManager.addElement(new LineElementScrollable(640,550,30,0,SCROLL_LIMIT));
        uiManager.addElement(new LineElementScrollable(610,650,30,0,SCROLL_LIMIT));
        uiManager.addElement(new LineElementScrollable(640,750,30,0,SCROLL_LIMIT));
        uiManager.addElement(new LineElementScrollable(610,850,30,0,SCROLL_LIMIT));
        uiManager.addElement(new TextElementScrollable("1897",0xffffffff,570,340,SCROLL_LIMIT));
        uiManager.addElement(new TextElementScrollable("1909",0xffffffff,650,440,SCROLL_LIMIT));
        uiManager.addElement(new TextElementScrollable("YEAR",0xffffffff,570,540,SCROLL_LIMIT));
        uiManager.addElement(new TextElementScrollable("YEAR",0xffffffff,650,640,SCROLL_LIMIT));
        uiManager.addElement(new TextElementScrollable("YEAR",0xffffffff,570,740,SCROLL_LIMIT));
        uiManager.addElement(new TextElementScrollable("YEAR",0xffffffff,650,840,SCROLL_LIMIT));
        uiManager.addElement(new TextElementScrollable("The Atomic Model",0xffffffff,240,50,SCROLL_LIMIT) {
            @Override
            public void draw(Main app) {
                float fsi = app.g.textSize;
                app.textSize(96);
                super.draw(app);
                app.textSize(fsi);
            }
        });
        uiManager.addElement(new TextElementScrollable("A Brief History",0xffffffff,560,170,SCROLL_LIMIT));
    }

    @Override
    public void onMouseWheel(MouseEvent event, Main main) {
        if(event.getCount() == 0) return;
        for (UIElement node : uiManager.getElementList()) {
            if(node instanceof UIElementScrollable)
                ((UIElementScrollable) node).scroll(PApplet.platform == PApplet.MACOSX?-event.getCount():event.getCount());
        }
    }
}
