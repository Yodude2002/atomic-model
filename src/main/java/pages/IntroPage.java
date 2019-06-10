package pages;

import engine.engineElements.TextElement;

public class IntroPage extends Page {
    public IntroPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Intro", 0xffffffff, 10, 10, false));
    }
}
