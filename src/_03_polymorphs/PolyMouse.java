package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PolyMouse extends Polymorph implements MouseMotionListener{
	
	int mX = 300;
	int mY = 300;
PolyMouse(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}



public void draw(Graphics g) {
		
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
		
		
		
		
		
	}
	
	
	
public void update(){
   	
    	this.x = mX;
    	this.y = mY;
    	
    	
    }



@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	mY = e.getY();
	mX = e.getX();
}
}
