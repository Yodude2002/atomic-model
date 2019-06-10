package pages;

import engine.Main;
import engine.engineElements.*;

public class MainMenu extends Page {
    public MainMenu(){
        super(0xff000000);
        uiManager.addElement(new TimelineNode("Intro",540,270,200,30,1));
        uiManager.addElement(new TimelineNode("Thompson",670,335,200,30,3));
        uiManager.addElement(new TimelineNode("Millikan",410,435,200,30,4));
        uiManager.addElement(new TimelineNode("Rutherford",670,535,200,30,5));
        uiManager.addElement(new TimelineNode("Bohr",410,635,200,30,6));
        uiManager.addElement(new TimelineNode("Heisenberg",670,735,200,30,7));
        uiManager.addElement(new TimelineNode("Shrödinger",410,835,200,30,8));
        uiManager.addElement(new TimelineNode("Chadwick",670,935,200,30,9));
        uiManager.addElement(new TimelineNode("Conclusion",540,1050,200,30,2));
        uiManager.addElement(new LineElement(640,300,0,750));
        uiManager.addElement(new LineElement(640,350,30,0));
        uiManager.addElement(new LineElement(610,450,30,0));
        uiManager.addElement(new LineElement(640,550,30,0));
        uiManager.addElement(new LineElement(610,650,30,0));
        uiManager.addElement(new LineElement(640,750,30,0));
        uiManager.addElement(new LineElement(610,850,30,0));
        uiManager.addElement(new LineElement(640,950,30,0));
        uiManager.addElement(new TextElement("1897",0xffffffff,540,340));
        uiManager.addElement(new TextElement("1909",0xffffffff,650,440));
        uiManager.addElement(new TextElement("1911",0xffffffff,540,540));
        uiManager.addElement(new TextElement("1922",0xffffffff,650,640));
        uiManager.addElement(new TextElement("1925",0xffffffff,540,740));
        uiManager.addElement(new TextElement("1930",0xffffffff,650,840));
        uiManager.addElement(new TextElement("1932",0xffffffff,540,940));
        uiManager.addElement(new TextElement("The Atomic Model",0xffffffff, 96,240,50));
        uiManager.addElement(new TextElement("A Brief History",0xffffffff,560,170));
    }
}
