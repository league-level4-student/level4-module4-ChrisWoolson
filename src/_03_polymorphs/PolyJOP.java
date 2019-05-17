package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class PolyJOP extends Polymorph implements MouseListener{
PolyJOP(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}



public void draw(Graphics g) {
		
		g.setColor(Color.green);
		g.fillRect(150, 150, width, height);
		
		
		
		
		
	}
	
	
	
public void update(){
   	
    	this.x++;
    	
    	
    }







@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
		JOptionPane.showMessageDialog(null, "clicked");
	
}



@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
