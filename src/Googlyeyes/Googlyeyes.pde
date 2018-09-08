
void setup(){
  background(#030000);
size (500,500);

}



void draw(){
  

//if (mousePressed) {
 // println(mousemouseX + " " + mousemouseY);

fill(#FFFFFF);
ellipse (125,200,200,150);
ellipse (350,200,200,150);

fill(#030000);


if (mouseX < 292) {mouseX = 292;}
if (mouseX > 400) {mouseX = 400;}


if (mouseY < 157) {mouseY = 157;}

if (mouseY > 242) {mouseY = 242;}

ellipse(mouseX,mouseY,50,50);

ellipse(mouseX - 225, mouseY,50,50); 


}