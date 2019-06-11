package engine;

import engine.engineElements.UIElement;
import pages.Page;
import processing.core.PApplet;
import processing.event.MouseEvent;

import java.util.ArrayList;

public class UIManager
{
    private ArrayList<UIElement> elementList;
    private Page page;
    private int scrollPosition;
    public int scrollAmount;
    public int minScroll;
    public int maxScroll;
    public UIManager(Page page)
    {
        this.page = page;
        scrollPosition = 0;
        scrollAmount = 16;
        minScroll = 0;
        maxScroll = 300;
        elementList = new ArrayList<>();
    }
    public void addElement(UIElement element)
    {
        elementList.add(element);
    }
    public ArrayList<UIElement> getElementList() {
        return elementList;
    }
    public void draw(Main app)
    {
        app.pushMatrix();
        app.translate(0, -scrollPosition);
        for(UIElement uiElement : elementList)
        {
            uiElement.draw(app);
        }
        app.popMatrix();
    }
    public void click(Main app)
    {
        for(int i = elementList.size() - 1; i >= 0; i--)
        {
            UIElement elem = elementList.get(i);
            int mx = app.mouseX - elem.getX();
            int my = app.mouseY - elem.getY() + scrollPosition;
            if(mx > 0 && my > 0 && mx < elem.getWidth() && my < elem.getHeight())
            {
                elem.click(app);
                break;
            }
        }
    }
    public void scroll(MouseEvent event, Main main)
    {
        if(event.getCount() == 0) return;
        int amount = PApplet.platform == PApplet.MACOSX?-event.getCount():event.getCount();
        scrollPosition += (amount > 0) ? scrollAmount : -scrollAmount;
        if(scrollPosition < minScroll)
        {
            scrollPosition = minScroll;
        }
        else if(scrollPosition > maxScroll)
        {
            scrollPosition = maxScroll;
        }
    }
}