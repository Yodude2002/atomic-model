package pages;

import engine.engineElements.TextElement;

public class RutherfordPage extends Page {
    public RutherfordPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Rutherford", 0xffffffff, 70,40, 10));
        uiManager.addElement(new TextElement("" +
                "[text]" +
                "", 0xffffffff, 20,20,100));
    }
}
