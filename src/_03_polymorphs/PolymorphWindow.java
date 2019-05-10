package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    
    
    ArrayList<Polymorph> polys = new ArrayList<Polymorph>();
   // Polymorph bluePoly;
    //Polymorph redPoly;
    //Polymorph movingPoly;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 //movingPoly = new MovingMorph(50,50);
   	 //bluePoly = new BluePolymorph(50, 50);
   	 //redPoly = new RedPolymorph(50, 50);
   	 
	polys.add(new PolyCircle(50,200));
	PolyMouse PM = new PolyMouse(50,50);
	window.addMouseMotionListener(PM);
   	polys.add(PM); 
	PolyImage PI = new PolyImage(50,50);
	polys.add(PI);
	
	
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	// bluePoly.draw(g);
   	 //movingPoly.draw(g);
   	 //redPoly.draw(g);
   	 
   	 for (Polymorph polym : polys) {
	polym.draw(g);
	}
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 //bluePoly.update();
   	 //redPoly.update();
   	 //movingPoly.update();
   	 
   	for (Polymorph polym : polys) {
   		polym.update();
   		}
   	 
    }
}
