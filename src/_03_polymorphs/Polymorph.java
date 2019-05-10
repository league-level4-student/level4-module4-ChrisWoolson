package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	
    protected int x;
    protected int y;
     protected int height = 50;
     protected int width = 50;
    
    
    
    int getX() {
    	return x;
    }
    void setX(int z) {
    	x=z;
    }
    
    int getY() {
    	return y;
    }
    
    void setY(int z) {
    	y = z;
    }
    
    
    
    
    int getH() {
    	return height;
    }
    void setH(int z) {
    	height=z;
    }
    
    int getW() {
    	return width;
    }
    
    void setW(int z) {
    	width = z;
    }
    
    
    
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	
    	
    	
    	
    }
    
    public abstract void draw(Graphics g);
}
