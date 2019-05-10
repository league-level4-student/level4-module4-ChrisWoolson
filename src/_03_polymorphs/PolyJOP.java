package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class PolyJOP extends Polymorph{
PolyJOP(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}



public void draw(Graphics g) {
		
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
		
		
		
		
		
	}
	
	
	
public void update(){
   	
    	this.x++;
    	
    	
    }
}
