import processing.core.*;

public class Tekst{
private PApplet p;
private String tekstsay;
private int tekstpositionX, tekstpositionY, tekstsize;

public Tekst(String tekstSay, int positionX, int positionY,int Tekstsize,PApplet p){
this.p = p;
tekstsay = tekstSay;
tekstpositionX = positionX ;
tekstpositionY = positionY;
tekstsize = Tekstsize;
}

public void tekstDisplay(){
p.textSize(tekstsize);
p.text(tekstsay,tekstpositionX,tekstpositionY);

}



}