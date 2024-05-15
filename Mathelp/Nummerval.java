import processing.core.*;

public class Nummerval{
private PApplet p;
private int a,b,c,d,rt1,rn1,gt1,gn1;
private boolean correct1, wrong1,correct2,wrong2;
public Nummerval(int A, int B, int C, int D, PApplet p){
this.p = p;
a = A;
b=B;
c=C;
d=D;
}

public void firstRegnestyk(){
p.stroke(255);
p.textSize(30);
p.text(a, 500,230);
p.line(480,250,530,250);
p.text(b, 500, 300);
p.text("+", 550, 260);
p.text(c, 600,230);
p.line(580,250,630,250);
p.text(d,600,300);
p.line(650,230,700,230);
p.line(650,260,700,260);
rt1=a*d + c*b;
rn1=d*b; 
p.text(gt1,750,230);
p.line(730,250,780,250);
p.text(gn1,750,300);
}
public void guessFirstRegnestyk(){
if(gn1 == rn1){correct1 = true;}
if(gt1 == rt1){correct2 = true;}
if(gn1 != rn1){wrong1 = true;}
if(gt1 != rt1){wrong2 = true;}
if(wrong1 == true){p.text("forkert, prøve igen",500,100);}
if(wrong2 == true){p.text("forkert, prøve igen",500,100);}
if(wrong2 == true){p.text("Man lægger brøker sammen og trækker brøker fra hinanden ved at finde en fællesnævner og fællestæller.",700,360);}
if(wrong2 == true){p.text("Det kan man gøre ved at gange nævner 1 med tæller 2 og gange nævner 2 med tæller 1 og plus dem sammen til at finde fælles tælleren.",700,380);}
if(wrong1 == true){p.text("For at finde en fælles nævner skal man gange tæller 1 med tæller 2 for at finde den.",700,400);}
if(correct1 && correct2){p.text("godt klarede! genstart programet for at prøve igen.",1000,300);}
}
public void plusGuessT1(){
gt1++;
}
public void plusGuessN1(){
gn1++;    
}
public void minusGuessT1(){
gt1--;    
}
public void minusGuessN1(){
gn1--;
}



}