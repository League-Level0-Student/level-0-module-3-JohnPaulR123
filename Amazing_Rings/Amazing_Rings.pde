void setup(){
   size(1000,1000);
}
void draw(){
  background(255,255,255);
 noFill();
 strokeWeight(2);
 for(int i=0;i<400;i=i+10){
  ellipse(200+x,400,i,i);
  ellipse(800-x,400,i,i);
 }
 x=x+1;
 if (x==600){
   x=1;
 }
  }

int x=1;