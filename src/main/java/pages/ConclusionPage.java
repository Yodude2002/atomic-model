package pages;

import engine.engineElements.TextElement;

public class ConclusionPage extends Page {
    public ConclusionPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Conclusion", 0xffffffff, 10, 10, false));
    }
}
