package pages;

import engine.Main;
import engine.engineElements.TimelineNode;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class MainMenu extends Page {

    public static final int SCROLL_LIMIT = 300;

    private TimelineNode[] timelineNodes;

    public MainMenu(){
        super(0xff000000);
        timelineNodes = new TimelineNode[8];
        timelineNodes[0] = new TimelineNode("Intro",10,10,200,30, SCROLL_LIMIT,1);
        timelineNodes[1] = new TimelineNode("Thompson",10,50,200,30,SCROLL_LIMIT,3);
        timelineNodes[2] = new TimelineNode("Millikan",10,90,200,30, SCROLL_LIMIT,4);
        timelineNodes[3] = new TimelineNode("Rutherford",10,130,200,30,SCROLL_LIMIT,5);
        timelineNodes[4] = new TimelineNode("Bohr",10,170,200,30, SCROLL_LIMIT,6);
        timelineNodes[5] = new TimelineNode("Chadwick",10,210,200,30,SCROLL_LIMIT,7);
        timelineNodes[6] = new TimelineNode("Shrödinger",10,250,200,30, SCROLL_LIMIT,8);
        timelineNodes[7] = new TimelineNode("Conclusion",10,290,200,30,SCROLL_LIMIT,2);
        for(TimelineNode node : timelineNodes)
        {
            uiManager.addElement(node);
        }
    }

    @Override
    public void onMouseWheel(MouseEvent event, Main main) {
        if(event.getCount() == 0) return;
        for (TimelineNode node : timelineNodes) {
            node.scroll(PApplet.platform == PApplet.MACOSX?-event.getCount():event.getCount());
        }
    }
}
