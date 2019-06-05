package pages;

import engine.Main;
import engine.engineElements.TimelineNode;

public class MainMenu implements Page {

    private TimelineNode[] timelineNodes = new TimelineNode[1];

    public MainMenu(){
        timelineNodes[0] = new TimelineNode("Test",10,10,200,300,Main.getTheMain());
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
}
