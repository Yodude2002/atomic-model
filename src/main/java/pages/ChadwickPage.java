package pages;

import engine.Main;
import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class ChadwickPage extends Page {
    public ChadwickPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("James Chadwick", 0xffffffff, 10, 10));
        uiManager.addElement(new ImageElement("chadwick.jpeg",0,50,this));
        uiManager.addElement(new TextElement("Discoverer of the Neutron",0xffffffff,0,330){
            @Override
            public void draw(Main app) {
                float fsi = app.g.textSize;
                app.textSize(12);
                super.draw(app);
                app.textSize(fsi);
            }
        });
    }
}
