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
        uiManager.addElement(new TextElement("Discoverer of the Neutron",0xffffffff,12, 0,330));
        uiManager.addElement(new TextElement(""+
                "The Bohr model was not created to account for the existence of a neutron particle.\n" +
                "Chadwick fired alpha particles at beryllium, with the beryllium followed by paraffin\n" +
                "wax, and then a detector that could detect protons. He discovered that there was some\n" +
                "neutral particle with mass slightly higher than a proton being released from the\n" +
                "beryllium because the paraffin wax was emitting protons, and named those particles\n" +
                "neutrons.\n" +
                "Chadwick then modified the Bohr model to account for neutrons in the nucleus.\n" +
                "The discovery of the neutron dramatically accelerated nuclear physics and his research\n" +
                "was used on the allied side during World War 2.",
                0xffffffff, 20, 208, 16));
    }
}
