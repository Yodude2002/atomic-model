package pages;

import engine.Main;
import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class ChadwickPage extends Page {
    public ChadwickPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("James Chadwick", 0xffffffff, 10, 10));
        uiManager.addElement(new ImageElement("chadwick.jpeg",0,50,this));
        uiManager.addElement(new TextElement(""+
                "Chadwick worked at Manchester University with Rutherford in 1921. There, he created a certain\n" +
                "experiment that resulted in the discovery of the neutron.\n" +
                "   In the experiment, alpha particles were first fired at some beryllium. Placed\n" +
                "after the beryllium is some paraffin wax, and then after the paraffin wax there\n" +
                "is a geiger counter. For the geiger counter to detect something means that there\n" +
                "is some particle going between beryllium and the paraffin wax after firing alpha particles\n" +
                "at the beryllium in order for the paraffin wax to release protons.\n" +
                "   This new particle discovered was then called the neutron, and has a mass slightly higher\n" +
                "than a proton. He added the neutron to Bohr's model of the atom.\n" +
                "   His work accelerated the development of nuclear physics for the allied side in World War 2\n" +
                "and provided a critical leap in understanding for the future of the atomic model.",
                0xffffffff, 20, 208, 16));
        uiManager.addElement(new ImageElement("chadwickexperiment.png", 256, 384, this));
    }
}
