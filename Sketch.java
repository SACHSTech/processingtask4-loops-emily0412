import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	
    size(400, 400);
  }

  public void setup() {
    background(255);
  }

  public void draw() {
	  
    // Quadrant 1
    //prints vertical lines
    for (int lineOne = (width/20); lineOne <= (width/(20/9)); lineOne += (width/20)) {
      stroke (0);
      line(lineOne, 0, lineOne, width/2);
    }
    // prints horizontal lines
    for (int lineOne = (width/20); lineOne <= (width/(20/9)); lineOne += (width/20)) {
      stroke (0);
      line(0, lineOne, width/2, lineOne);
    }

    // Quadrant 2
    for (int circleX = (int)(width/(20.0/11.0)); circleX <= width; circleX += (width/10)) {
      for(int circleY = (width/20); circleY <= (int)(width/(20.0/9.0)); circleY += (width/10)) {
        fill (212, 15, 125);
        stroke (0);
        ellipse(circleX, circleY, (width/20), (width/20));
      }
    }
    
    // Quadrant 3
    float colourAdjust = (float)255/(width/2); // multiply the gradient by this number to get 255 colours within the quadrant

    for (int gradient = 0; gradient <= (width/2); gradient++) {
      stroke((float)(gradient * colourAdjust), (float)(gradient * colourAdjust), (float)(gradient * colourAdjust)); // colour of line
      line(gradient, width/2, gradient, height); 
    }

    // Quadrant 4
    
    // petals
    pushMatrix(); // controls translate()
    fill(220, 93, 52); // petal colour
    stroke(0);
    translate ((float)(width * 0.75), (float)(height * 0.75)); // changes the origin from (0,0) to (width*0.75, height*0.75)
    for (int petals = 0; petals < 8; petals++) {
      rotate(PI/4);
      ellipse(width/70, height/10, width/20, height/6);
    }
    popMatrix(); // resets translate ()

    // middle circle
    noStroke();
    fill(38, 108, 45);
    ellipse(width*((float)(0.75)), width*((float)(0.75)), width/10, width/10);
  }
  
}