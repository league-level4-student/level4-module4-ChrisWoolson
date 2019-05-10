package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PolyImage extends Polymorph{
	BufferedImage img;
	
PolyImage(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("Pimage"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



public void draw(Graphics g) {
		
	
		
		//g.fillRect(x, y, width, height);
	 	g.drawImage(img,400,400,246, 205, null);	
		
		
		
		
	}
	
	
	
public void update(){
   	
    	this.x++;
   
    	
    }
}
