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
    public UIManager(Page page)
    {
        this.page = page;
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
        for(UIElement uiElement : elementList)
        {
            uiElement.draw(app);
        }
    }
    public void click(Main app)
    {
        for(int i = elementList.size() - 1; i >= 0; i--)
        {
            UIElement elem = elementList.get(i);
            int mx = app.mouseX - elem.getX();
            int my = app.mouseY - elem.getY();
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
        for(UIElement elem : elementList)
        {
            elem.scroll(amount, page);
        }
    }
}