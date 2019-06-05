package engine.engineElements;

import processing.core.PApplet;

public class TimelineNode {

    private String name;
    private String description;
    private int x;
    private int y;
    private int width;
    private int height;
    private PApplet p;

    public TimelineNode(String name, int x, int y, int width, int height, PApplet p){
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.p = p;
    }

    public void setDescription(String str){
        description = str;
    }

    public void scroll(int yChange){
        y += yChange;
    }

    public void draw(){
        p.rect(x,y,width,height,Math.min(width,height)/4);
    }

}
