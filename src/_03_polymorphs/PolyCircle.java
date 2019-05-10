package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class PolyCircle extends Polymorph{
	double angle = 0;
PolyCircle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}



public void draw(Graphics g) {
		
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
		
		
		
		
		
	}
	
	
	
public void update(){
   	
    	this.x+= Math.sin(angle)*20;
    	this.y+= Math.cos(angle)*20;
    	angle+= .1;
    	
    }
}
