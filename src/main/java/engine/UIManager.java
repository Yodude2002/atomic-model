package engine;

import processing.core.PApplet;

import java.util.ArrayList;

public class UIManager
{
    private ArrayList<UIElement> elementList;
    public UIManager()
    {
        elementList = new ArrayList<>();
    }
    public void addElement(UIElement element) //im annoyed, why cant we just make elementList public?
    {
        elementList.add(element);
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
}