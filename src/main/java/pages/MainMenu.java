package pages;

import engine.Main;
import engine.engineElements.TimelineNode;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class MainMenu implements Page {

    PApplet p;
    private TimelineNode[] timelineNodes;

    public MainMenu(){
        p = Main.getTheMain();
        timelineNodes = new TimelineNode[1];
        timelineNodes[0] = new TimelineNode("Test",10,10,200,300,p);
    }

    @Override
    public void draw(Main main) {
        for (TimelineNode node:
             timelineNodes) {
            node.draw();
        }
    }

    @Override
    public void onMouseEvent(Main main) {

    }

    @Override
    public void onKeyPress(Main main) {

    }

    @Override
    public void onMouseWheel(MouseEvent event, Main main) {
        for (TimelineNode node:
             timelineNodes) {
            node.scroll(event.getCount());
        }
    }
}
