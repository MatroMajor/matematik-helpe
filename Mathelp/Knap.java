import processing.core.*;

public class Knap{
private PApplet p;
private String action, name;
private boolean clicked;
private int x, y, w, h;
  
 public Knap(int x,int y,int w,int h,String a,String n,PApplet p){
    action = a;
    name = n;
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.p = p;

  }
  
  public void mouseDown(){
    if(p.mouseX > x && p.mouseX < x + w && p.mouseY > y  && p.mouseY < y+h && p.mousePressed){
      clicked = true;
      p.method(action);
    }
  }
  
 public void mouseUp(){
    clicked = false;    
  }
  
 public void KnapDisplay(){
    if(clicked) p.stroke(0); else p.stroke(255); 
    p.rect(x,y,w,h);
    p.textSize(15);
    p.textAlign(p.CENTER, p.CENTER);
    p.text(name,x+25,y-25);
  }





}