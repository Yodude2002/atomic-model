package pages;

import engine.Main;
import engine.TextElement;
import processing.event.MouseEvent;

public class CitationPage extends Page {
    public CitationPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Works Cited", 0xffffffff, 10, 10));
    }
    @Override
    public void draw(Main main) {
        uiManager.draw(main);
    }

    @Override
    public void onMouseEvent(Main main) {
        uiManager.click(main);
    }

    @Override
    public void onKeyPress(Main main) {

    }

    @Override
    public void onMouseWheel(MouseEvent event, Main main) {

    }
}
