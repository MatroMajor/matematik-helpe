Side s1 = new Side1(this);
Tekst test1;
Knap test2;
Knap test3;
Knap test4;
Knap test5;
Knap test6;
Nummerval regnstyk1;
void setup(){
size(1400,600);
test1 = new Tekst("Hvad er resultatet?",600,500,20,this);
test2 = new Knap(80,150,50,50,"test","plus T",this);
test3 = new Knap(80,450,50,50,"test2","minus T",this);
test4 = new Knap(150,150,50,50,"test3","plus N",this);
test5 = new Knap(150,450,50,50,"test4","minus N",this);
test6 = new Knap(300,150,50,50,"test5","guess",this);
regnstyk1 = new Nummerval( (int) random (1,10),(int)random(1,10),(int)random(1,10),(int)random(1,10),this);

}
void draw(){
test2.KnapDisplay();
test3.KnapDisplay();
test4.KnapDisplay();
test5.KnapDisplay();
test6.KnapDisplay();
regnstyk1.firstRegnestyk();
test1.tekstDisplay();

}

void mousePressed(){
test2.mouseDown();
test3.mouseDown();
test4.mouseDown();
test5.mouseDown();
test6.mouseDown();
}

void mouseReleased(){
    test2.mouseUp();
    test3.mouseUp();
    test4.mouseUp();
    test5.mouseUp();
    test6.mouseUp();
}

void test(){
background(0);
regnstyk1.plusGuessT1(); 
}
void test2(){
background(0);
regnstyk1.minusGuessT1();
}
void test3(){
background(0);
regnstyk1.plusGuessN1();    
}
void test4(){
background(0);
regnstyk1.minusGuessN1();
}
void test5(){
background(0);
regnstyk1.guessFirstRegnestyk();    
}